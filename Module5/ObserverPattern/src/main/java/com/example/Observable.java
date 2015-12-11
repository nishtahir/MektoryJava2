
public interface Observable {
	public void notifyObserver(Observer observer, String data);
	public void notifyAllObservers(String data);
	
	public void registerObserver(Observer observer);
	public void unregisterObserver(Observer observer);
}
