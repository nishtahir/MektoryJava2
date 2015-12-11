
public class App {

	public static void main(String[] args) {
		Office theOffice = new Office();
		Person p1 = new Person("p1");
		Person p2 = new Person("p2");
		Person p3 = new Person("p3");
		theOffice.registerObserver(p1);
		theOffice.registerObserver(p2);
		theOffice.registerObserver(p3);
		theOffice.notifyAllObservers("Hello world");
	}

}
