package nitish.learn.designpatterns.behavioral.observer;

public class Weather {
    private double temperature;
    private double windSpeed;

    public Weather(double temperature, double windSpeed) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
}