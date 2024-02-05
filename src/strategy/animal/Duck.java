package strategy.animal;

public abstract class Duck {

    protected FlyBehavior flyBehavior;      //구성(composition)
    protected QuackBehavior quackBehavior;  //구성(composition)

    public Duck() {
    }

    public abstract void display();

    /**
     * performXXX(): 행동 클래스에 기능을 위임
     */
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    /**
     * setXXX(): 동적으로 전략(strategy)을 변경
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
