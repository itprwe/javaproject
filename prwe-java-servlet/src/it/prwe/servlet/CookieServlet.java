package it.prwe.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @Author zhengxr
 * @Date 2021/12/10 16:01
 */

/**
 * 网页之间的交互是通过HTTP协议传输数据的，而Http协议是无状态的协议。无状态的协议是什么意思呢？一旦数据提交完后，浏览器和服务器的连接就会关闭，再次交互的时候需要重新建立新的连接。
 * 服务器无法确认用户的信息，于是乎，W3C就提出了：给每一个用户都发一个通行证，无论谁访问的时候都需要携带通行证，这样服务器就可以从通行证上确认用户的信息。通行证就是Cookie
 *
 * Cookie的流程：浏览器访问服务器，如果服务器需要记录该用户的状态，就使用response向浏览器发送一个Cookie，浏览器会把Cookie保存起来。当浏览器再次访问服务器的时候，
 * 浏览器会把请求的网址连同Cookie一同交给服务器
 *
 * Cookie不可跨域名性
 * 在访问Servlet的时候浏览器是不是把所有的Cookie都带过去给服务器，会不会修改了别的网站的Cookie
 * 答案是否定的。Cookie具有不可跨域名性。浏览器判断一个网站是否能操作另一个网站的Cookie的依据是域名。所以一般来说，当我访问baidu的时候，浏览器只会把baidu颁发的Cookie带过去，而不会带上google的Cookie
 *
 * Cookie的有效期
 * Cookie的有效期是通过setMaxAge()来设置的。
 *
 * Cookie的域名
 *
 * Cookie的路径
 *
 * Cookie的安全属性
 *
 * Cookie的应用
 *
 *
 *
 */
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req, resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.setContentType("text/html;chartset=UTF-8");
        Cookie cookie = new Cookie("cname", "test");
        resp.addCookie(cookie);
        resp.getWriter().write("写了cookie");
    }
}
