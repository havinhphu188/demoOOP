package abstraction2;

public class MathStudent implements Student {

	private String name;

	@Override
	public void printSubject() {
		System.out.println(this.name + ": Math");
	}
	public MathStudent(String name) {
		super();
		this.name = name;
	}
	
	

}
