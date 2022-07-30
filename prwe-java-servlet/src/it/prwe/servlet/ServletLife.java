package it.prwe.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

/**
 * @Author zhengxr
 * @Date 2021/12/10 14:42
 */

/**
 * Servlet是单例的
 * 浏览器多次对Servlet的请求，一般情况下，服务器只创建一个Servlet对象，也就是说，Servlet对象一旦创建了，就会驻留在内存中，为后续的请求做服务，直到服务器关闭
 *
 * 每次访问请求对象和响应对象都是新的
 * 对于每次访问请求，Servlet引擎都会创建一个新的HttpServletRequest请求对象和一个新的HttpServletResponse响应对象，然后将这两个对象作为参数传递给它调用的Servlet的service()方法，service方法再根据请求方式分别调用doXXX方法
 *
 * 线程安全问题
 * 当多个用户访问Servlet的时候，服务器会为每个用户创建一个线程。当多个用户并发访问Servlet共享资源的时候就会出现线程安全问题
 *
 *
 * 原则：
 * 如果一个变量需要多个用户共享，则应当在访问该变量的时候，加同步机制synchronized (对象){}
 * 如果一个变量不需要共享，则直接在 doGet() 或者 doPost()定义.这样不会存在线程安全问题
 *
 * load-on-startup
 * 如果在<servlet>元素中配置了一个<load-on-startup>元素，那么WEB应用程序在启动时，就会装载并创建Servlet的实例对象、以及调用Servlet实例对象的init()方法
 * 作用：
 * 为web应用写一个InitServlet，这个servlet配置为启动时装载，为整个web应用创建必要的数据库表和数据
 * 完成一些定时的任务【定时写日志，定时备份数据】
 *
 * ServletConfig对象
 * 通过此对象可以读取web.xml中配置的初始化参数
 *
 * ServletContext对象
 * 当Tomcat启动的时候，就会创建一个ServletContext对象。它代表着当前web站点
 *
 *
 * ServletContext有什么用
 * ServletContext既然代表着当前web站点，那么所有Servlet都共享着一个ServletContext对象，所以Servlet之间可以通过ServletContext实现通讯。
 * ServletConfig获取的是配置的是单个Servlet的参数信息，ServletContext可以获取的是配置整个web站点的参数信息
 * 利用ServletContext读取web站点的资源文件
 * 实现Servlet的转发【用ServletContext转发不多，主要用request转发】
 *
 * Servlet之间实现通讯
 * ServletContext对象可以被称之为域对象;域对象可以简单理解成一个容器【类似于Map集合】
 *
 */

//@WebServlet("/testLife")
public class ServletLife implements Servlet{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet init");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("do some service");
        System.out.println("do some service");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy servlet");

    }
}
