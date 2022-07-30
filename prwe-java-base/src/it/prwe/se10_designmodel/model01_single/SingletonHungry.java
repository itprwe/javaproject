package it.prwe.se10_designmodel.model01_single;

/**
 *
 * 饿汉式：类加载就会导致该单实例对象被创建
 *
 * @Author zhengxr
 * @Date 2022/7/21 14:03
 */
public class SingletonHungry {

    //私有构造方法
    private SingletonHungry(){
    }

    private static SingletonHungry instance = new SingletonHungry();

    public static SingletonHungry getInstance(){
        return instance;
    }


}
