package nitish.learn.designpatterns.structural.decorator;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + " + Cheese";
    }

    public double cost() {
        return super.cost() + 20;
    }
}
