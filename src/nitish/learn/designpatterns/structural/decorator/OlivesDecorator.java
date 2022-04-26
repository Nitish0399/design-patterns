package nitish.learn.designpatterns.structural.decorator;

public class OlivesDecorator extends PizzaDecorator{
    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + " + Olives";
    }

    public double cost() {
        return super.cost() + 50;
    }
}
