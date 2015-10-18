package ee.ttu.solution;

//@SuppressWarnings("unused")
// Avoid using @SuppressWarnings annotations
// It prevents eclipse from letting you know of
// potential problems
public class Student {

	private String name;
	private int id;

	public Student(String _name, int _id) {
		super();
//		String name = _name; // This creates a new local variable with the
		                     // It does not assign it to the field 
		this.name = _name;
		
//		int id = _id;
		this.id = _id;
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
