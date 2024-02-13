package factory.pizza.simplefactory;

import factory.pizza.Pizza;

/**
 * Factory: 객체의 생성을 전담하는 클래스
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
//            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
        }

        return pizza;
    }

}
