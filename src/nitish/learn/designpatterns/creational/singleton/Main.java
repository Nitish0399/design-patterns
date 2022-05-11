package nitish.learn.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hey");
        System.out.println(singleton.value);
        singleton = Singleton.getInstance("Hello");
        System.out.println(singleton.value);
    }
}
