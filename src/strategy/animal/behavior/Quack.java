package strategy.animal.behavior;

import strategy.animal.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("꽥");
    }
}