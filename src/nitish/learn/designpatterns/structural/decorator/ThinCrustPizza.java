package nitish.learn.designpatterns.structural.decorator;

public class ThinCrustPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Thin Crust Pizza";
    }

    @Override
    public double cost() {
        return 199.50;
    }
}
