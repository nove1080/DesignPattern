package factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();
    void prepare() {
        System.out.println("준비 중: " + name);
        System.out.println("도우를 돌리는 중...");
        System.out.println("소스를 뿌리는 중...");
        System.out.println("토핑을 올리는 중: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake() {
        System.out.println("175도 25분 간 굽기");
    }
    void cut() {
        System.out.println("피자 자르기");
    }
    void box() {
        System.out.println("포장하기");
    }

    public String getName() {
        return name;
    }
}
