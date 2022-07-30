package it.prwe.mybatis.mybatis;

import it.prwe.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author zhengxr
 * @Date 2022/2/10 10:15
 */

/**
 * MyBatis使用步骤总结
 * 1)配置mybatis-config.xml 全局的配置文件 (1、数据源，2、外部的mapper)
 * 2)创建SqlSessionFactory
 * 3)通过SqlSessionFactory创建SqlSession对象
 * 4)通过SqlSession操作数据库 CRUD
 * 5)调用session.commit()提交事务
 * 6)调用session.close()关闭会话
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //指定全局配置文件
        String resource = "mybatis-config.xml";
        //读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        //构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            //操作CRUD,第一个参数指定statement
            //第二个参数，指定传入sql的参数
            User user = sqlSession.selectOne("MyMapper.selectUser", 1);
            System.out.println(user);
        } finally {
            sqlSession.close();
        }
    }
}
