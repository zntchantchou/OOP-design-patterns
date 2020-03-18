package ObservablePattern;
import interfaces.Observer;
import interfaces.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private int temperature;
	private float pressure;
	private float humidity;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
	}
	
	public void update(int temp, float press, float hum) {
		temperature = temp;
		pressure = press;
		humidity = hum;
		display();
	}
	
	private void display() {
		System.out.println("[CurrentConditions]");
		System.out.println(String.format("temperature: %d, pressure: %f, humidity: %f", temperature, pressure, humidity));
	}
}
