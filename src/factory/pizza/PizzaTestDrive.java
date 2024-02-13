package factory.pizza;

import factory.pizza.chicago.ChicagoPizzaStore;
import factory.pizza.newyork.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("edan이 주문한 " + pizza.getName());
        System.out.println();

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("kim이 주문한 " + pizza.getName());
        System.out.println();
    }
}
