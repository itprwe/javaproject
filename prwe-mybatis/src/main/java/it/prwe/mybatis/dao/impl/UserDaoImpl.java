package it.prwe.mybatis.dao.impl;

import it.prwe.mybatis.dao.UserDao;
import it.prwe.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author zhengxr
 * @Date 2022/2/10 12:17
 */
public class UserDaoImpl implements UserDao {

    public SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User queryUserById(Long id) {
        return this.sqlSession.selectOne("UserDao.queryUserById", id);
    }

    @Override
    public List<User> queryUserAll() {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}
