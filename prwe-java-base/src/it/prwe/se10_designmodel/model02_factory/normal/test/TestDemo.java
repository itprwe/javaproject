package it.prwe.se10_designmodel.model02_factory.normal.test;

import it.prwe.se10_designmodel.model02_factory.normal.Coffee;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:02
 */
public class TestDemo {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
