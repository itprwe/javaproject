package it.prwe.se10_designmodel.model02_factory.normal.test;

import it.prwe.se10_designmodel.model02_factory.normal.AmericanCoffee;
import it.prwe.se10_designmodel.model02_factory.normal.Coffee;
import it.prwe.se10_designmodel.model02_factory.normal.LatteCoffee;

/**
 * @Author zhengxr
 * @Date 2022/7/21 14:57
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
