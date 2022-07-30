package it.prwe.oop.abstr;

/**
 * @Author zhengxr
 * @Date 2022/7/22 14:20
 */
public class Test01 {
    public static void main(String[] args) {
        //抽象类不可以可以实例化，要实现其中抽象方法才行
        Father father = new Father() {
            @Override
            public void eat() {
                System.out.println("main eat");
            }
        };
        father.play();
        father.eat();

        Son son = new Son();
        son.eat();//调用的是子类的方法
        son.play();//子类没有该方法，调用的是继承子父类的方法
        son.swimming();///调用的是子类的方法

        Father son2 = new Son();
        son2.eat();//实际调用的是子类的方法
        son2.play();//子类没有该方法，调用的是继承子父类的方法
        //son2.swimming(); 无法调用

        /**
         * 抽象类：在Java中被abstract关键字修饰的类称为抽象类，被abstract关键字修饰的方法称为抽象方法，抽象方法只有方法的声明，没有方法体。抽象类的特点
         * a、抽象类不能被实例化只能被继承；
         * b、包含抽象方法的一定是抽象类，但是抽象类不一定含有抽象方法；
         * c、抽象类中的抽象方法的修饰符只能为public或者protected，默认为public；
         * d、一个子类继承一个抽象类，则子类必须实现父类抽象方法，否则子类也必须定义为抽象类；
         * e、抽象类可以包含属性、方法、构造方法，但是构造方法不能用于实例化，主要用途是被子类调用。
         *
         * 
         * Java中接口使用interface关键字修饰
         * a、接口可以包含变量、方法；变量被隐士指定为public static final，方法被隐士指定为public abstract（JDK1.8之前）；
         * b、接口支持多继承，即一个接口可以extends多个接口，间接的解决了Java中类的单继承问题；
         * c、一个类可以实现多个接口；
         * d、JDK1.8中对接口增加了新的特性：（1）、默认方法（default method）：JDK 1.8允许给接口添加非抽象的方法实现，但必须使用default关键字修饰；
         * 定义了default的方法可以不被实现子类所实现，但只能被实现子类的对象调用；如果子类实现了多个接口，并且这些接口包含一样的默认方法，则子类必须重写默认方法；
         * （2）、静态方法（static method）：JDK 1.8中允许使用static关键字修饰一个方法，并提供实现，称为接口静态方法。接口静态方法只能通过接口调用（接口名.静态方法名）
         */
    }
}
