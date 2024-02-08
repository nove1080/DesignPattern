package decorator.decorator;

import decorator.beverage.Beverage;
import decorator.beverage.Size;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }

}
