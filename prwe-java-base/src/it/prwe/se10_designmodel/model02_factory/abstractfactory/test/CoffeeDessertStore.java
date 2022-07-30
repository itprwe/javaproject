package it.prwe.se10_designmodel.model02_factory.abstractfactory.test;

import it.prwe.se10_designmodel.model02_factory.abstractfactory.Coffee;
import it.prwe.se10_designmodel.model02_factory.abstractfactory.Dessert;
import it.prwe.se10_designmodel.model02_factory.abstractfactory.DessertFactory;

/**
 * @Author zhengxr
 * @Date 2022/7/21 15:42
 */
public class CoffeeDessertStore {
    DessertFactory dessertFactory;
    public CoffeeDessertStore(DessertFactory dessertFactory){
        this.dessertFactory = dessertFactory;
    }
    public Coffee orderCoffee(){
        Coffee coffee = dessertFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public Dessert orderDessert(){
        Dessert dessert = dessertFactory.createDessert();
        dessert.show();
        return dessert;
    }
}
