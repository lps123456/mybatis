package frame_mybaris.dao;

import frame_mybaris.pojo.Provincial;

public interface CountryMapper {
    /**
     * 根据国家id查询省会城市
     */

     Provincial selectCountryById (Integer id);



}
