import java.util.ArrayList;
import java.util.List;

public class Office implements Observable{
	List<Observer> observers = new ArrayList<>();

	@Override
	public void notifyObserver(Observer observer, String data) {
		observer.update("Notified!");
	}

	@Override
	public void notifyAllObservers(String data) {
		for(Observer observer : observers){
			notifyObserver(observer, data);
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}

}
