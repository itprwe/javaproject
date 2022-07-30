package it.prwe.se10_designmodel.model02_factory.factory.test;

import it.prwe.se10_designmodel.model02_factory.factory.Coffee;
import it.prwe.se10_designmodel.model02_factory.factory.CoffeeFactory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:19
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
