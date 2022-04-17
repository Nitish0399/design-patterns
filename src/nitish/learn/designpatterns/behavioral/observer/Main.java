package nitish.learn.designpatterns.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        Weather weather1 = new Weather(24.7, 8.2);
        Weather weather2 = new Weather(36.12, 9.06);

        WeatherStation weatherStation = new WeatherStation();

        UserInterface userInterface = new UserInterface(weatherStation);
        Logger logger = new Logger(weatherStation);

        weatherStation.updateWeather(weather1);
        weatherStation.updateWeather(weather2);

    }
}