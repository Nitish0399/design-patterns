package nitish.learn.designpatterns.creational.factory_method;

public class Main {

    public static void main(String[] args) {
        ZoneFactory zoneFactory = new ZoneFactory();
        Calendar calendar = new PacificCalendar(zoneFactory);

        calendar.createCalendar();
        calendar.print();
    }
}
