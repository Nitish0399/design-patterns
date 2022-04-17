package nitish.learn.designpatterns.behavioral.observer;

public class Logger implements Observer {
    private Weather weather;
    private Subject weatherStation;

    public Logger(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public void update(Weather weather) {
        this.weather = weather;
        log();
    }

    public void log() {
        System.out.println("------ Logger ------");
        System.out.println("Temperature : " + weather.getTemperature());
        System.out.println("Wind Speed : " + weather.getWindSpeed());
        System.out.println();
    }
}