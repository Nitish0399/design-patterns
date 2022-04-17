package nitish.learn.designpatterns.behavioral.observer;

public class UserInterface implements Observer {
    private Weather weather;
    private Subject weatherStation;

    public UserInterface(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public void update(Weather weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("------ User Interface ------");
        System.out.println("Temperature : " + weather.getTemperature());
        System.out.println("Wind Speed : " + weather.getWindSpeed());
        System.out.println();
    }
}