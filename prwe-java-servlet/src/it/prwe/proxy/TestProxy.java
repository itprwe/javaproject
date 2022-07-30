package it.prwe.proxy;

/**
 * @Author zhengxr
 * @Date 2021/12/14 10:37
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理技术就是用来产生一个对象的代理对象的
 * 　1、代理对象存在的价值主要用于拦截对真实业务对象的访问。
 * 　2、代理对象应该具有和目标对象(真实业务对象)相同的方法
 * 刘德华(真实业务对象)会唱歌，会跳舞，会拍戏，我们现在不能直接找他唱歌，跳舞，拍戏了，只能找他的代理人(代理对象)唱歌，跳舞，拍戏，
 * 一个人要想成为刘德华的代理人，那么他必须具有和刘德华一样的行为(会唱歌，会跳舞，会拍戏)，刘德华有什么方法，他(代理人)就要有什么方法，
 * 我们找刘德华的代理人唱歌，跳舞，拍戏，但是代理人不是真的懂得唱歌，跳舞，拍戏的，真正懂得唱歌，跳舞，拍戏的是刘德华，在现实中的例子就是我们要找刘德华唱歌，
 * 跳舞，拍戏，那么只能先找他的经纪人，交钱给他的经纪人，然后经纪人再让刘德华去唱歌，跳舞，拍戏。
 * 代理对象与真实对象有相同的方法，但是做这些方法的还是真实对象；主要就是拦截外部对真实对象的访问，由代理对象来让真实对象做事
 * <p>
 * 现在要生成某一个对象的代理对象，这个代理对象通常也要编写一个类来生成，所以首先要编写用于生成代理对象的类。
 * 在java中如何用程序去生成一个对象的代理对象呢，java在JDK1.5之后提供了一个"java.lang.reflect.Proxy"类，
 * 通过"Proxy"类提供的一个newProxyInstance方法用来创建一个对象的代理对象
 * <p>
 * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
 * newProxyInstance方法用来返回一个代理对象，这个方法总共有3个参数，
 * ClassLoader loader用来指明生成代理对象使用哪个类装载器，
 * Class<?>[] interfaces用来指明生成哪个对象的代理对象，通过接口指定，
 * InvocationHandler h用来指明产生的这个代理对象要做什么事情。
 * 所以我们只需要调用newProxyInstance方法就可以得到某一个对象的代理对象了。
 * <p>
 * 在java中规定，要想产生一个对象的代理对象，那么这个对象必须要有一个接口，
 * 第一步就是设计这个对象的接口，在接口中定义这个对象所具有的行为(方法)
 * 第二步定义目标业务对象类
 * 第三步创建生成代理对象的代理类
 */

public class TestProxy {
    public static void main(String[] args) {
        LiuDeHuaProxy liuDeHuaProxy = new LiuDeHuaProxy();
        Person person = liuDeHuaProxy.getProxy();

        String retValue1 = person.sing("冰雨");
        System.out.println(retValue1);

        String retValue2 = person.dance("dandandan");
        System.out.println(retValue2);
    }

}
