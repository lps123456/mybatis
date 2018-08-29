package frame_mybaris.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionFactoryUtil {
    /**
     * 创建需要单例的对象
     */
    private static SqlSessionFactory sqlSessionFactory;

    //私有化构造
    private SessionFactoryUtil(){

    }
    //对外访问的接口
    public static  synchronized SqlSession getSession(){

        try {
            /**
             * 给一个核心文件·配置位置 返回一个输入流
             * 也就是把配置信息读取到了内存中 方便以后使用
             */
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //通过构造器创建工厂
            if (sqlSessionFactory==null){
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
            //通过工厂来获取session

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory.openSession();
    }
}
