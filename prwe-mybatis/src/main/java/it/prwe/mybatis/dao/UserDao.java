package it.prwe.mybatis.dao;

import it.prwe.mybatis.pojo.User;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author zhengxr
 * @Date 2022/2/10 11:32
 */
public interface UserDao {

    /**
     * 根据id查询User信息
     *
     * @param id
     * @return
     */
    public User queryUserById(Long id);

    /**
     * 查询所有User信息
     *
     * @return
     */
    public List<User> queryUserAll();

    /**
     * 新增User
     *
     * @param user
     */
    public void insertUser(User user);

    /**
     * update User
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * 删除User
     *
     * @param id
     */
    public void deleteUser(Long id);

}
