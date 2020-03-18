package ObservablePattern;

import java.util.Timer;

import interfaces.Observer;

public class WeatherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherStation station = new WeatherStation();
		WeatherData weatherData = new WeatherData(station);
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		// simulate the weatherStation receiving a new measurement every 5 seconds

	}
}
