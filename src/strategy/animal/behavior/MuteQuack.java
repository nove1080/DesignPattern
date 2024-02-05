package strategy.animal.behavior;

import strategy.animal.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
