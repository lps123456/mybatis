package frame_mybaris;
import frame_mybaris.dao.CountryMapper;
import frame_mybaris.pojo.Provincial;
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
    public void selectCountryById(){
         Provincial provincial = mapper.selectCountryById(1);

        System.out.println(provincial.getpName());
        System.out.println(provincial.getCountry().getCname());
    }
}
