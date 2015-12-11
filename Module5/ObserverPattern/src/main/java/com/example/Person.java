
public class Person implements Observer{
	String name;
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update(String data) {
		System.out.println(name + " got: " + data);
	}

}
