package it.prwe.listener;

/**
 * @Author zhengxr
 * @Date 2021/12/13 14:07
 */

import java.awt.*;

/**
 * 事件源 Person
 * 事件源要提供方法注册监听器（在事件源上关联监听器对象）
 */
public class Person {

    //在成员变量定义一个监听器对象
    PersonListener personListener;

    //注册监听器，该类没有监听器对象啊，那么就传递进来吧。
    public void registerListener(PersonListener personListener){
        this.personListener = personListener;
    }

    //在事件源中定义两个方法
    public void eat(){
        //当事件源调用了Eat方法时，应该触发监听器的方法，调用监听器的方法并把事件对象传递进去
        personListener.doEat(new Event(this));

    }
    public void sleep(){
        personListener.doSleep(new Event(this));
    }

}
