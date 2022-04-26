package nitish.learn.designpatterns.structural.decorator;

public class ThickCrustPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Thick Crust Pizza";
    }

    @Override
    public double cost() {
        return 299.99;
    }
}
