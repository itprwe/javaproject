package it.prwe.oop.duotai;

/**
 * @Author zhengxr
 * @Date 2022/7/22 11:25
 */
public class Test01 {
    public static void main(String[] args) {
        //虽然是父类的引用指向子类，但是实际调用的还是子类的方法，因为子类重写了父类的方法
        Father sonFather = new Son();
        sonFather.play();

        //父类的方法，子类没有此方法相当于继承了，不用重写
        sonFather.eat();

        //父类中没有此方法，指向子类的父类对象，实质还是父类的外皮，无法调用父类中没有的方法会报错
        //sonFather.eatChicken();

        //强制将父类引用转换为子类引用，则可以直接调用子类方法了
        ((Son) sonFather).eatChicken();

        //总结 多态就是子类继承父类以后，用父类指向new出来的子类，可以条用父类中有且子类的中有的方法，不能调用子类中有父类中没有的方法

    }
}
