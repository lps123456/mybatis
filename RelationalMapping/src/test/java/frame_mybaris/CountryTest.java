package frame_mybaris;

import frame_mybaris.dao.CountryMapper;
import frame_mybaris.pojo.Country;
import frame_mybaris.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountryTest {
    SqlSession session=null;
    CountryMapper mapper=null;
    @Before
    public void before(){
        session= SessionFactoryUtil.getSession();
        mapper=session.getMapper(CountryMapper.class);
    }
    @After
    public void after(){
        session.commit();   //提交事务
        session.close();   //释放session
    }
    @Test
    public void getCountryById(){
        Country country = mapper.selectCountryById(1);
        System.out.println(country);     //会直接把省会加载
    }
    @Test
    public void getCountryByIddelay(){
        Country country = mapper.selectCountryById(1);
        System.out.println(country.getcName());
        System.out.println(country.getcName());
        System.out.println(country.getProvincials());
    }
}
