package nitish.learn.designpatterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        System.out.println("Pizza : " + pizza.getDescription());
        System.out.println("Cost : " + pizza.cost());
        System.out.println();

        pizza = new CheeseDecorator(new OlivesDecorator(pizza));
        System.out.println("Pizza : " + pizza.getDescription());
        System.out.println("Cost : " + pizza.cost());
        System.out.println();
    }
}
