package it.prwe.se10_designmodel.model02_factory.abstractfactory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:32
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
