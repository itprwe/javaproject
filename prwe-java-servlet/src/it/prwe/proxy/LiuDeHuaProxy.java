package it.prwe.proxy;

/**
 * @Author zhengxr
 * @Date 2021/12/14 10:55
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class LiuDeHuaProxy {

    //设计一个变量记录代理类呀代理的目标对象
    private Person ldh = new LiuDeHua();

    //设计一个方法生成代理对象
    public Person getProxy(){

        /**
         * 使用newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)返回某个对象的代理对象
         * ClassLoader loader生成代理对象使用哪个类加载器，一般用代理对象的类加载器
         * Class<?>[] interfaces 用来指明生成哪个对象的代理对象，一般用真实对象的接口指定
         * InvocationHandler h用来指明产生的代理对象要做什么事情
         *
         * InvocationHandler接口定义了一个invoke方法，使用一个匿名内部类来实现该接口
         * invoke(proxy,method,args)
         * proxy 把代理对象自己传进去
         * method 把代理对象当前调用的方法传递进去
         * args 把方法的参数传递进去
         *
         * 当调用代理对象的person.sing("冰雨");或者 person.dance("dandandan");方法时，
         * 实际上执行的都是invoke方法里面的代码，
         * 因此我们可以在invoke方法中使用method.getName()就可以知道当前调用的是代理对象的哪个方法
         *
         */
        return (Person) Proxy.newProxyInstance(LiuDeHuaProxy.class.getClassLoader(), ldh.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //如果调用的是代理对象的sing方法
                if (method.getName().equals("sing")){
                    System.out.println("我是他经纪人，要找他唱歌得先给10w！！");
                    //已经给钱了，经纪人自己不会唱歌，就只能找刘德华去唱歌！
                    //代理对象调用真实目标对象的sing方法去处理用户请求
                    return method.invoke(ldh,args);
                }
                //如果调用的是代理对象的dance方法
                if (method.getName().equals("dance")){
                    System.out.println("我是他的经纪人，要找他跳舞得先给二十万块钱！！");
                    //已经给钱了，经纪人自己不会唱歌，就只能找刘德华去跳舞！
                    return method.invoke(ldh, args);//代理对象调用真实目标对象的dance方法去处理用户请求
                }
                return null;
            }
        });
    }

}
