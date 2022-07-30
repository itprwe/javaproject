package it.prwe.se10_designmodel.model02_factory.simplefactory.test;

import it.prwe.se10_designmodel.model02_factory.simplefactory.Coffee;
import it.prwe.se10_designmodel.model02_factory.simplefactory.SimpleCoffeeFactory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:07
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.getInstance(type);
        String name = coffee.getName();
        System.out.println(name);
        return coffee;
    }
}
