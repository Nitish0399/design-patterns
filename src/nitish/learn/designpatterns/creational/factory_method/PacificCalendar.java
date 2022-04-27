package nitish.learn.designpatterns.creational.factory_method;

public class PacificCalendar extends Calendar {

    public PacificCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone("US/Pacific");
    }

    @Override
    public void createCalendar() {
        System.out.println("Creating Calendar..");
    }
}
