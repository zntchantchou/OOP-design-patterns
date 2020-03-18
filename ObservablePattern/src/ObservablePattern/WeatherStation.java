package ObservablePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;

import interfaces.Observer;
import interfaces.Subject;

public class WeatherStation implements Subject{
	
	// Subject implementation
	private int temperature;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public WeatherStation() {
		Timer timer = new Timer();
		Task task = new Task(this);
		timer.schedule(task, 5000, 5000);
	}
	
	// random values generation
	private void updateTemperature(){
		int randomTemperature = (int)(Math.random() * 30);
		temperature = randomTemperature;
	};
	private void updatePressure() {
		float randomPressure = (float)Math.random() * 2;
		pressure = randomPressure;
	};
	
	private void updateHumidity() {
		float randomHumidity = (float)Math.random() * 30;
		humidity = randomHumidity;
	};
	
	// updates ONE of the three metrics randomly (humidity, pressure, temperature) randomly, every 5 seconds
	public void updateRandomValue() {
		double randomNum = Math.random();
		if(randomNum < 0.33) {
			updatePressure();
			System.out.println("updatePressure");
		}else if(randomNum >= 0.33 && randomNum <= 0.66) {
			updateTemperature();
			System.out.println("updateTemperature");
		}else {
			updateHumidity();
			System.out.println("updateHumidity");
		}
		notifyObservers();
	}
	
	
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
