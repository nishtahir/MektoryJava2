package ee.ttu;

@SuppressWarnings("unused")
public class Student {

	private String name;
	private int id;

	public Student(String _name, int _id) {
		super();
		String name = _name;
		int id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
