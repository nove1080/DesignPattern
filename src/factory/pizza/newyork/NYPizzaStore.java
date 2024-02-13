package factory.pizza.newyork;

import factory.pizza.Pizza;
import factory.pizza.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    /** 팩토리 메서드 */
    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("clam")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
