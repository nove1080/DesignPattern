package strategy.animal.behavior;

import strategy.animal.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("삑삑");
    }
}
