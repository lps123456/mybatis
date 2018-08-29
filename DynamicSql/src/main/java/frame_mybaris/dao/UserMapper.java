package frame_mybaris.dao;

import frame_mybaris.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    List<User> findUserByCondtion(User user);
    /**
     * 根据用户传递的对象属性  来执行sql
     */
    List<User> findUserByCondtiontirm(User user);


    /**
     * 查询匹配
     * @param user
     * @return
     */
    int updateuserById(User user);


    int selectByChoose (User user);

    /**
     * 遍历数组
     * @param ids
     * @return
     */
    List<User> selectArrayById(int[] ids);

    List<User> selectlistById(List<Integer> ids);

    List<User> selectlistUser(List<User> ids);


    List<User> selectlistUsermap (@Param("mymap")Map<String,Integer> map);

    List<User> selectlistUsermapTwo (@Param("mymap")Map<String,User> map);

}
