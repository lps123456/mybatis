package frame_mybaris;

import frame_mybaris.dao.TeacherMapper;
import frame_mybaris.pojo.Student;
import frame_mybaris.pojo.Teacher;
import frame_mybaris.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    SqlSession session=null;
    TeacherMapper mapper=null;
    @Before
    public void before(){
        session= SessionFactoryUtil.getSession();
        mapper=session.getMapper(TeacherMapper.class);
    }
    @After
    public void after(){
        session.commit();   //提交事务
        session.close();   //释放session
    }
    /**
     * 根据学生编号查出  所有老师的信息
     */
    @Test
    public void selectTeachersById(){
        Student student=mapper.selectTeacherById(2);
        System.out.println(student);
    }
    /**
     * 根据老师编号查出  所有学生的信息
     */
    @Test
    public void selectStudentsById(){
        Teacher teacher=mapper.selectStudentById(2);
        System.out.println(teacher.getStudents());
    }
}
