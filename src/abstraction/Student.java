package abstraction;

public abstract class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public abstract void rollCall();

}
