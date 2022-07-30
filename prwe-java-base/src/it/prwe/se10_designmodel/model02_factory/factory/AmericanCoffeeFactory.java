package it.prwe.se10_designmodel.model02_factory.factory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:17
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
