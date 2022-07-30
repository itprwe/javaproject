package it.prwe.se10_designmodel.model02_factory.abstractfactory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:39
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
