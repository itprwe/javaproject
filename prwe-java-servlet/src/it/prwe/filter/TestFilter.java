package it.prwe.filter;

/**
 * @Author zhengxr
 * @Date 2022/2/9 15:52
 */

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * web浏览器--web服务器--过滤器--web资源/servlet/html
 * 当浏览器发送请求给服务器的时候，先执行过滤器，然后才访问Web的资源。服务器响应Response，从Web资源抵达浏览器之前，也会途径过滤器
 * 引申在Web容器中，过滤器可以做：过滤一些敏感的字符串【规定不能出现敏感字符串】、避免中文乱码【规定Web资源都使用UTF-8编码】、权限验证【规定只有带Session或Cookie的浏览器，才能访问web资源】等等等
 *
 * 在Java中就使用了链式结构。把所有的过滤器都放在FilterChain里边，如果符合条件，就执行下一个过滤器（如果没有过滤器了，就执行目标资源）。
 *
 * filter部署
 * 第一种方式：在web.xml文件中配置
 * filter
 * <filter>用于注册过滤器
 * <filter>
 *               <filter-name>FilterDemo1</filter-name>
 *              <filter-class>FilterDemo1</filter-class>
 *              <init-param>
 *              <param-name>word_file</param-name>
 *              <param-value>/WEB-INF/word.txt</param-value>
 *              </init-param>
 *     </filter>
 *     <filter-mapping>
 *         <filter-name>FilterDemo1</filter-name>
 *         <url-pattern>/*</url-pattern>
 *     </filter-mapping>
 *
 * <filter-name>用于为过滤器指定一个名字，该元素的内容不能为空。
 * <filter-class>元素用于指定过滤器的完整的限定类名。
 * <init-param>元素用于为过滤器指定初始化参数，它的子元素<param-name>指定参数的名字，<param-value>指定参数的值。在过滤器中，可以使用FilterConfig接口对象来访问初始化参数。
 * filter-mapping
 * <filter-mapping>元素用于设置一个Filter 所负责拦截的资源。
 * 一个Filter拦截的资源可通过两种方式来指定：Servlet 名称和资源访问的请求路径
 * <filter-name>子元素用于设置filter的注册名称。该值必须是在<filter>元素中声明过的过滤器的名字
 * <url-pattern>设置 filter 所拦截的请求路径(过滤器关联的URL样式)
 * <servlet-name>指定过滤器所拦截的Servlet名称。
 * <dispatcher>指定过滤器所拦截的资源被 Servlet 容器调用的方式，可以是REQUEST,INCLUDE,FORWARD和ERROR之一，默认REQUEST。用户可以设置多个<dispatcher> 子元素用来指定 Filter 对资源的多种调用方式进行拦截。
 * dispatcher
 *
 * 第二种方式：通过注解配置
 * @WebFilter(filterName = "FilterDemo1",urlPatterns = "/*")
 */
@WebFilter(filterName = "FilterDemo1",urlPatterns = "/*")
public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //执行这一句，说明放行（让下一个过滤器执行，如果没有过滤器了，就执行执行目标资源）
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
