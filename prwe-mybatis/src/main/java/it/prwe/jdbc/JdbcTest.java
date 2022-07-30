package it.prwe.jdbc;

import java.sql.*;

/**
 * @Author zhengxr
 * @Date 2022/2/9 15:36
 */


/**
 * 数据库连接池
 * 数据库的连接的建立和关闭是非常消耗资源的
 * 频繁地打开、关闭连接造成系统性能低下
 *
 * 编写连接池需实现java.sql.DataSource接口
 * 创建批量的Connection用LinkedList保存【既然是个池，当然用集合保存、、LinkedList底层是链表，对增删性能较好】
 * 实现getConnetion()，让getConnection()每次调用，都是在LinkedList中取一个Connection返回给用户
 * 调用Connection.close()方法，Connction返回给LinkedList
 *
 * JDBC中的Statement 和PreparedStatement的区别？
 * 区别：
 *
 * PreparedStatement是预编译的SQL语句，效率高于Statement。
 * PreparedStatement支持?操作符，相对于Statement更加灵活。
 * PreparedStatement可以防止SQL注入，安全性高于Statement。
 * CallableStatement适用于执行存储过程。
 *
 * 最好的办法是利用sql语句进行分页，这样每次查询出的结果集中就只包含某页的数据内容。
 * SELECT *
 *     FROM 表名
 *     LIMIT [START], length;
 *
 * 工作原理：
 *
 * JAVA EE服务器启动时会建立一定数量的池连接，并一直维持不少于此数目的池连接。客户端程序需要连接时，池驱动程序会返回一个未使用的池连接并将其表记为忙。
 * 如果当前没有空闲连接，池驱动程序就新建一定数量的连接，新建连接的数量有配置参数决定。当使用的池连接调用完成后，池驱动程序将此连接表记为空闲，其他调用就可以使用这个连接。
 * 实现方案：连接池使用集合来进行装载，返回的Connection是原始Connection的代理，代理Connection的close方法，当调用close方法时，不是真正关连接，
 * 而是把它代理的Connection对象放回到连接池中，等待下一次重复利用。
 *
 *
 * 事务是作为单个逻辑工作单元执行的一系列操作。
 * 一个逻辑工作单元必须有四个属性，称为原子性、一致性、隔离性和持久性 (ACID) 属性，只有这样才能成为一个事务
 * Connection类中提供了4个事务处理方法:
 *
 * setAutoCommit(Boolean autoCommit):设置是否自动提交事务,默认为自动提交,即为true,通过设置false禁止自动提交事务;
 * commit():提交事务;
 * rollback():回滚事务.
 * savepoint:保存点
 * 注意：savepoint不会结束当前事务，普通提交和回滚都会结束当前事务的
 *
 *
 */
public class JdbcTest {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "root");
            //3.准备statement
            statement = connection.createStatement();
            //4.执行
            resultSet = statement.executeQuery("select * from tb_user");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
            }
//            //设置事务自动提交
//            connection.setAutoCommit(true);
//            //提交事务
//            connection.commit();
//            //回滚事务
//            connection.rollback();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //5.关闭
            /*
             * 关闭资源，后调用的先关闭
             *
             * 关闭之前，要判断对象是否存在
             * */

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
