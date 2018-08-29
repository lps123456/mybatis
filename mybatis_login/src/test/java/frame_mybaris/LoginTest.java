package frame_mybaris;

import frame_mybaris.dao.UserMapper;
import frame_mybaris.pojo.User;
import frame_mybaris.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

import java.util.Scanner;

public class LoginTest {


    @After
    public void after(){
        sqlSession.commit();   //提交事务
        sqlSession.close();   //释放session
    }
    static SqlSession sqlSession=null;
    static UserMapper userMapper=null;

    public static void main(String[] args) {

        sqlSession= SessionFactoryUtil.getSession();
        userMapper=sqlSession.getMapper(UserMapper.class);
        //扫描仪
        Scanner input =new Scanner(System.in);
        System.out.println("欢迎进入biu一下系统");
        System.out.println("请先登录");
        System.out.println("1.登陆");
        System.out.println("2.根据条件查询");
        System.out.println("3.根据条件修改");
        System.out.println("4.根据条件删除");
        System.out.println("5.查询所有");
        System.out.println("请先登录");
        int num=0;
        int shuzi=input.nextInt();
        switch (num=shuzi){
            case 1:
                login();
                break;
            case 2:
                selectBy();
                break;
            case 3:
                updateBy();
                break;
            case 4:
                delectBy();
                break;
            case 5:
                findAll();
                break;
        }
        }

    /**
     * 根据条件查询
     */
    private static void selectBy() {
    }

    /**
     * 登录
     */
    private static void login() {
        //扫描仪
        Scanner input =new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=input.next();
        System.out.println("请输入密码");
        String password=input.next();
        User user=null;


        if (user.getUserName()!=name&&user.getPassWords()!=password){
            System.out.println("用户名或者密码错误！");
            login();
        }else{
            System.out.println("登陆成功！");
        }
    }

    /**
     * 根据条件修改
     */
    private static void updateBy() {
    }

    /**
     * 根据条件删除
     */
    private static void delectBy() {
    }

    /**
     * 查询所有
     */
    private static void findAll() {
    }



}


