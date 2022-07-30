package it.prwe.se10_designmodel.model02_factory.abstractfactory.test;

import it.prwe.se10_designmodel.model02_factory.abstractfactory.AmericanDessertFactory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:44
 */
public class TestDemo4 {
    public static void main(String[] args) {
        CoffeeDessertStore coffeeDessertStore = new CoffeeDessertStore(new AmericanDessertFactory());
        coffeeDessertStore.orderCoffee();

    }
}
