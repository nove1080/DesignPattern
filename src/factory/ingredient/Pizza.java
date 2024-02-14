package factory.ingredient;

import factory.ingredient.original.*;

public abstract class Pizza {

    String name;

    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /** 피자를 만들기 위해 필요한 재료를 가져온다. */
    abstract void prepare();

    void bake() {}
    void cut() {}
    void box() {}
}
