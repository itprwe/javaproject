package it.prwe.se10_designmodel.model02_factory.simplefactory.test;

import it.prwe.se10_designmodel.model02_factory.simplefactory.Coffee;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:08
 */
public class TestDemo2 {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
