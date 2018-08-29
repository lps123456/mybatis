package frame_mybaris;
import frame_mybaris.dao.UserMapper;
import frame_mybaris.pojo.User;
import frame_mybaris.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserTest {
    SqlSession session=null;
    UserMapper mapper=null;
    @Before
    public void before(){
        session= SessionFactoryUtil.getSession();
        mapper=session.getMapper(UserMapper.class);
    }
    @After
    public void after(){
        session.commit();   //提交事务
        session.close();   //释放session
    }
    /**
     * 新增方法
     */
    @Test
    public void testadd(){
        User user=new User();
        user.setUserName("Mapper测试");
        user.setPassWords("ceshi");
        int num=mapper.addUser(user);
        if (num>0){
            System.out.println("新增成功！");
        }else {
            System.out.println("新增失败！");
        }
    }
    /**
     * 删除方法
     */
    @Test
    public void deleteUser(){

        int num=mapper.delectUser(24);
        if (num>0){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
    }
    /**
     * 修改方法
     */
    @Test
    public void updateUser(){
        User user=new User();
        user.setUserName("hello");
        user.setPassWords("ceshi");
        int num=mapper.updateUser(user);
        if (num>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
    }
    /**
     * 查询指定单个
     */
    @Test
    public void findUserById(){
        mapper.findUserById(25);
    }
    /**
     * 查询所有
     */
    @Test
    public  void findAll(){
    mapper.findAll();
    }
    @Test
    public void findOneByTwo(){
        Map<String,Object> map=new HashMap<>();
        map.put("myName","hello");
        map.put("mypwd","ceshi");
        User user=mapper.findOneByTwo(map);
        System.out.println(user);
    }

}
