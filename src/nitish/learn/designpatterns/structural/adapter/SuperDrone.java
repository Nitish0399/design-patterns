package nitish.learn.designpatterns.structural.adapter;

public class SuperDrone implements Drone{
    @Override
    public void beep() {
        System.out.println("Beep Beep Beep");
    }

    @Override
    public void spin_rotors() {
        System.out.println("Rotors are spinning");
    }

    @Override
    public void take_off() {
        System.out.println("Super Drone taking off");
    }
}
