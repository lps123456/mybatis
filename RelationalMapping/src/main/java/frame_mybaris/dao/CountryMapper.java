package frame_mybaris.dao;

import frame_mybaris.pojo.Country;

public interface CountryMapper {
    /**
     * 根据国家id查询省会城市
     */
    Country getCountryByIddelay(Integer id);

}
