package factory.pizza;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * factory 객체 대신 사용할 메서드
     */
    abstract protected Pizza createPizza(String type);
}
