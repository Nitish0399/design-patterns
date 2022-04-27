package nitish.learn.designpatterns.creational.factory_method;

public abstract class Calendar {
    Zone zone;
    public void print() {
        System.out.println("Zone name : " + zone.getDisplayName());
        System.out.println("Zone offset : " + zone.getOffset());
    }

    public abstract void createCalendar();
}
