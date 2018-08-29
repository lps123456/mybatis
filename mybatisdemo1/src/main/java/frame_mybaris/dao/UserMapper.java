package frame_mybaris.dao;

import frame_mybaris.pojo.User;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 用户的接口
 */
public interface UserMapper {
    /**
     * 新增用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 删除
     * @param condition
     * @return
     */
    int delectUser(Serializable condition);
    /**
     * 修改
     * @param condition
     * @return
     */
    int updateUser(Serializable condition);
    /**
     * 查询
     */

    User findUserById(Serializable condition);
    /**
     * 查询所有
     */
    List<User> findAll();
    /**
     * 多条件查询
     */
    User findOneByTwo (Map map);


}
