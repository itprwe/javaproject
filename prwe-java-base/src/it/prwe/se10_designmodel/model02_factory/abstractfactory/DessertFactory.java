package it.prwe.se10_designmodel.model02_factory.abstractfactory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:38
 */
public interface DessertFactory {
    Coffee createCoffee();
    Dessert createDessert();
}
