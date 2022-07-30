package it.prwe.se10_designmodel.model02_factory.factory.test;

import it.prwe.se10_designmodel.model02_factory.factory.AmericanCoffeeFactory;
import it.prwe.se10_designmodel.model02_factory.factory.Coffee;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:20
 */
public class TestDemo3 {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee test = coffeeStore.orderCoffee("test");
        System.out.println(test.getName());
    }
}
