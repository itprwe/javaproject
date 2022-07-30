package it.prwe.oop.duotai;

/**
 * @Author zhengxr
 * @Date 2022/7/22 14:05
 */
public class Test02 {
    public static void main(String[] args) {

        //接口指向的实现的子类的对象，只能调用接口里的方法，不能调用子类中在接口里没有的方法，就连他继承自父类的方法也不能调用
        Swimming sonSwim = new Son();
        sonSwim.goSwimming();

        Fly birdFly = new Bird();
        birdFly.goFly();

        /**
         * 多态更多的用处就是方便传参，如果传入不同子类的对象，不用写多个方法的参数，只用写一个方法传入接口的对象即可
         * 1.提高了代码的可维护性
         * 2.提高了代码的扩展性
         * 可以当做形式参数，可以接受任意子类对象
         * 不能使用子类特有的属性和行为
         */

        /**
         * Java中接口使用interface关键字修饰
         * a、接口可以包含变量、方法；变量被隐士指定为public static final，方法被隐士指定为public abstract（JDK1.8之前）；
         * b、接口支持多继承，即一个接口可以extends多个接口，间接的解决了Java中类的单继承问题；
         * c、一个类可以实现多个接口；
         * d、JDK1.8中对接口增加了新的特性：（1）、默认方法（default method）：JDK 1.8允许给接口添加非抽象的方法实现，但必须使用default关键字修饰；
         * 定义了default的方法可以不被实现子类所实现，但只能被实现子类的对象调用；如果子类实现了多个接口，并且这些接口包含一样的默认方法，则子类必须重写默认方法；
         * （2）、静态方法（static method）：JDK 1.8中允许使用static关键字修饰一个方法，并提供实现，称为接口静态方法。接口静态方法只能通过接口调用（接口名.静态方法名）
         *
         */
    }
}
