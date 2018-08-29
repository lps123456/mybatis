package frame_mybaris.dao;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 登录
     */
    int login(@Param("name") String name,@Param("pwd") String passWords);

}
