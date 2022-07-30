package it.prwe.models.model01single;

/**
 * @Author zhengxr
 * @Date 2021/12/21 17:51
 */

/**
 * 单例模式：
 * 一个类只有一个实例，并且提供一个全局访问点
 * 特点：
 * 只有一个实例
 * 自我实例化
 * 提供全局访问点
 * <p>
 * 优点：
 * 内存里只有一个实例，减少了内存的开销
 * 可以避免对资源的多重占用。
 * 单例模式设置全局访问点，可以优化和共享资源的访问。
 * <p>
 * 实现：
 * 单例类：包含一个实例且能自行创建这个实例
 * <p>
 * 一旦一个共享变量（类的成员变量、类的静态成员变量）被volatile修饰之后，那么就具备了两层语义：
 * 1）保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
 * 2）禁止进行指令重排序。
 * https://www.cnblogs.com/dolphin0520/p/3920373.html
 *
 * 只有private构造方法，确保外部无法实例化；
 * 通过private static变量持有唯一实例，保证全局唯一性；
 * 通过public static方法返回此唯一实例，使外部调用方能获取到实例。
 */
public class TestSingle {

    public static void main(String[] args) {
        President instance = President.getInstance();
        instance.getName();
        President instance1 = President.getInstance();
        instance1.getName();
        if (instance == instance1) {
            System.out.println("他们是同一个人...");
        } else {
            System.out.println("他们不是同一个人...");
        }

    }

}

//懒汉式单例
class President {
    private static volatile President instance;//保证在所有线程中同步

    private President() {
        //以免被外部实例化
    }

    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统了...");
        }
        return instance;
    }

    public void getName() {
        System.out.println("我是美国总统特朗普...");
    }
}
