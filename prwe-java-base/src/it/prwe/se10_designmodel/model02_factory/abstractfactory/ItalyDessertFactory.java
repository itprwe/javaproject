package it.prwe.se10_designmodel.model02_factory.abstractfactory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:40
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
