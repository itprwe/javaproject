package it.prwe.se10_designmodel.model02_factory.simplefactory;


/**
 * @Author zhengxr
 * @Date 2022/7/21 15:05
 */
public class SimpleCoffeeFactory {

    public static Coffee getInstance(String type){
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }
        return coffee;
    }

}
