package nitish.learn.designpatterns.creational.factory_method;

public class ZoneFactory {

    public Zone createZone(String zoneId) {
        if(zoneId == "US/Pacific"){
            return new ZonePacific();
        }
        else if(zoneId == "US/Eastern"){
            return new ZoneEastern();
        }
        else if(zoneId == "US/Central"){
            return new ZoneCentral();
        }
        else {
            return null;
        }
    }
}
