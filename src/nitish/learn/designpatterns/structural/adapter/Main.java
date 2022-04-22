package nitish.learn.designpatterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.quack();
        mallardDuck.fly();

        Drone superDrone = new SuperDrone();
        Duck superDroneAdapter = new DroneAdapter(superDrone);

        superDroneAdapter.quack();
        superDroneAdapter.fly();
    }
}
