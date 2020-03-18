package ObservablePattern;
import interfaces.Observer;
import interfaces.DisplayElement;
import java.util.ArrayList;
import java.util.Iterator;



public class StatisticsDisplay implements Observer, DisplayElement {
	
	private ArrayList<Integer> temperatureHistory = new ArrayList<Integer>();
	private ArrayList<Float> pressureHistory = new ArrayList<Float>();
	private ArrayList<Float> humidityHistory = new ArrayList<Float>();
	private int averageTemperature;
	private float averagePressure;
	private float averageHumidity;
	
	
	public StatisticsDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
	}
	
	public void update(int temp, float press, float hum) {
		temperatureHistory.add(temp);
		pressureHistory.add(press);
		humidityHistory.add(hum);
		calculateAllAverages();
	};
	
	private void calculateAllAverages() {
		averageTemperature = calculateIntAverage(temperatureHistory);
		averagePressure = calculateFloatAverage(pressureHistory);
		averageHumidity = calculateFloatAverage(humidityHistory);
		display();
	}
	
	private Float calculateFloatAverage(ArrayList<Float> values) {
		float numberOfValues = values.size();
		Iterator<Float> iter = values.iterator();
		float sum = 0;
		while(iter.hasNext()) {
			sum = sum + iter.next();
		}
		return sum / numberOfValues;
		
	}
	
	private int calculateIntAverage(ArrayList<Integer> values) {
		int numberOfValues = values.size();
		Iterator<Integer> iter = values.iterator();
		int sum = 0;
		while(iter.hasNext()) {
			sum = sum + iter.next();
		}
		return sum / numberOfValues;
	}
	
	private void display() {
		System.out.println("[Statistics]");
		System.out.println(String.format("Average temperature: %d, Average pressure: %f, Average humidity: %f", averageTemperature, averagePressure, averageHumidity ));
	}
}

