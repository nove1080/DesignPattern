package strategy.animal.behavior;

import strategy.animal.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("날 수 없습니다.");
    }
}
