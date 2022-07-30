package it.prwe.se10_designmodel.model02_factory.factory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:18
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
