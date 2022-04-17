package nitish.learn.designpatterns.behavioral.observer;

import java.util.*;

public class WeatherStation implements Subject {

    private Weather weather;
    private List<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(weather);
        }
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void updateWeather(Weather weather) {
        this.weather = weather;
        notifyObservers();
    }

}