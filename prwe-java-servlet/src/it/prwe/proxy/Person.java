package it.prwe.proxy;

/**
 * @Author zhengxr
 * @Date 2021/12/14 10:51
 */

/**
 * 定义对象的行为
 * 第一步就是设计这个对象的接口，在接口中定义这个对象所具有的行为(方法)
 */
public interface Person {

    //唱歌行为
    String sing(String name);

    //跳舞行为
    String dance(String name);
}
