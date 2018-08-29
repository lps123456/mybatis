package frame_mybaris;

import com.github.pagehelper.PageHelper;
import frame_mybaris.dao.CacheMapper;
import frame_mybaris.pojo.Student;
import frame_mybaris.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CacheTest {
    SqlSession session=null;
    CacheMapper mapper=null;
    @Before
    public void before(){
        session= SessionFactoryUtil.getSession();
        mapper=session.getMapper(CacheMapper.class);
    }
    @After
    public void after(){
        session.commit();   //提交事务
        session.close();   //释放session
    }

    @Test
    public void CacheTest(){
        Student student=mapper.selectStudentFandAll(1);
        System.out.println(student+"第一次查询==================");
        student=mapper.selectStudentFandAll(1);
        System.out.println(student+"第二次查询==================");
    }

    /**
     * 一级缓存执行增删改会清空缓存，执行sql操作数据库
     */
    @Test
    public void firstCacheAdd(){
        Student student=mapper.selectStudentFandAll(1);
        System.out.println("第一次查询=====================》》》"+student);
        session.close();   //关闭session  清理了缓存
        session=SessionFactoryUtil.getSession();
        mapper=session.getMapper(CacheMapper.class);   //再次获取session
        //student.setSname("狗子");
        mapper.firstCacheAdd(new Student("啊吴"));      //新增数据
        student=mapper.selectStudentFandAll(1);
        System.out.println("第二次查询------------------》》》"+student);
    }


    /**
     * 二级缓存增删改不会执行新的sql是去缓存区拿数据
     */
     @Test
    public void addStudent(){
        Student student=mapper.selectStudentFandAll(1);
        System.out.println("第一次查询=====================》》》"+student);
        session.close();   //关闭session  清理了缓存
        session=SessionFactoryUtil.getSession();
        mapper=session.getMapper(CacheMapper.class);   //再次获取session
        //student.setSname("狗子");
        mapper.cacheSecondAdd(new Student(10,"啊吴"));      //新增数据
        student=mapper.selectStudentFandAll(1);
        System.out.println("第二次查询------------------》》》"+student);
    }

    @Test
    public void  pageheper(){
        PageHelper.startPage(1,2);
        List<Student> s = mapper.pagehelper();
        System.out.println(s);

        PageHelper.startPage(2,2);
        List<Student> ss = mapper.pagehelper();
        System.out.println(ss);
    }


    @Test
    public void test (){
         Student student=new Student();
         student.getSid(2);
        System.out.println("执行存储过程之前"+student.getSname());
        mapper.selectnameByProcedure(student);
        System.out.println("执行存储过程之前"+student.getSname());
    }
 }
