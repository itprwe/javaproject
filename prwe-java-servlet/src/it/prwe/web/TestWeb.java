package it.prwe.web;

/**
 * @Author zhengxr
 * @Date 2021/12/13 15:06
 */

/**
 *
 * Http学习
 *
 * DAO(Data Access Object)：主要对数据的操作，增加、修改、删除等原子性操作。
 * Web层：界面+控制器，也就是说JSP【界面】+Servlet【控制器】
 * Service业务层：将多个原子性的DAO操作进行组合，组合成一个完整的业务逻辑
 * 控制层：主要使用Servlet进行控制
 * 数据访问层：使用DAO、Hibernate、JDBC技术实现对数据的增删改查
 * JavaBean用于封装数据，处理部分核心逻辑，每一层中都用到
 *
 * domain
 * dao
 * daoimpl
 * service
 * serviceimpl
 * controller
 * filter
 * listener
 * utils
 * job
 *
 */

public class TestWeb {
}
