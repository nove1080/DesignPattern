package factory.pizza.chicago;

import factory.pizza.Pizza;
import factory.pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    /** 팩토리 메서드 */
    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
