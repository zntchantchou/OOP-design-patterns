package ObservablePattern;

import java.util.*;

import interfaces.Observer;
import interfaces.Subject;

public class WeatherData implements Subject, Observer {
	private int temperature;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	public WeatherData(WeatherStation weatherStation) {
		weatherStation.addObserver(this);
	}
	
	public void update(int temp, float press, float hum) {
		
		temperature = temp;
		pressure = press;
		humidity = hum;
		// we print messages to display the updates to our local variables every 5 seconds
		/* System.out.println("[update] Weatherdata");
		System.out.println(String.format("weatherdata temperature %d", temperature));
		System.out.println(String.format("weatherdata humidity %f", humidity));
		System.out.println(String.format("weatherdata pressure %f", pressure));*/
		notifyObservers();
	};
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()) {
			Observer currentObs = iterator.next();
			currentObs.update(temperature, pressure, humidity);
		}
	}
}
