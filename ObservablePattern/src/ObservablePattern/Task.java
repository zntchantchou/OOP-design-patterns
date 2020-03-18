package ObservablePattern;
import java.util.TimerTask;

public class Task extends TimerTask {
	private WeatherStation station;
	
	public Task(WeatherStation weatherStation) {
		station = weatherStation;
	};
	
	public void run(){
		station.updateRandomValue();
	}
}
