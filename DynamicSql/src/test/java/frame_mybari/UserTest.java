package frame_mybari;

import frame_mybaris.dao.UserMapper;
import frame_mybaris.pojo.User;
import frame_mybaris.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class UserTest {
    SqlSession session = null;
    UserMapper mapper = null;

    @Before
    public void before() {
        session = SessionFactoryUtil.getSession();
        mapper = session.getMapper(UserMapper.class);
    }

    @Test
    public void findUserByCondtion() {
        User user = new User();
        user.setUserName("hello");
        user.setPassWords("ceshi");
        List<User> list = mapper.findUserByCondtion(user);
        System.out.println(list);
    }

    @Test
    public void findUserByCondtiontirm() {
        User user = new User();
        user.setUserName("hello");
        user.setPassWords("ceshi");
        List<User> list = mapper.findUserByCondtiontirm(user);
        System.out.println(list);
    }

    @Test
    public void updateuserById() {
        User user = new User();
        user.setId(25);
        user.setUserName("你好");
        user.setPassWords("123");
        int i = mapper.updateuserById(user);
        System.out.println((i > 0) ? "成功" : "失败");
    }

    @Test
    public void selectByChoose() {
        User user = new User();
        user.setUserName("hello");
        user.setPassWords("ceshi");
        List<User> list = mapper.findUserByCondtion(user);
        System.out.println(list);
    }

    /**
     * 遍历数组
     */
    @Test
    public void selectArray() {
        int[] ids = {25, 26, 31};
        List<User> users = mapper.selectArrayById(ids);
        System.out.println(users);
    }


    @Test
    public void selectlistById() {
        List<Integer> list = new ArrayList<>();
        List<User> list1 = mapper.selectlistById(list);
        System.out.println(list1);
    }

    //遍历集合
    @Test
    public void selectlistUser() {

        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(26);
        list.add(31);
        System.out.println(list);
    }

    /**
     * map集合
     */
    @Test
    public void testmap() {
        Map<String, Integer> mymap = new HashMap<>();
        mymap.put("a",25);
        mymap.put("a",26);
        mymap.put("a",31);
        mapper.selectlistUsermap(mymap);
        System.out.println(mymap);
    }
    @Test
    public void selectlistUsermapTwo() {
        Map<String, User> mymap = new HashMap<>();
         User user=new User(25);
        // user.setId(25);
        User user1=new User(26);
        // user.setId(26);
         mymap.put("user1",user1);
        mymap.put("user",user);
         mapper.selectlistUsermapTwo(mymap);
    }

}
