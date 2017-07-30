package abstraction2;

public class ChemistryStudent implements Student {

	private String name;
	
	@Override
	public void printSubject() {
		System.out.println(this.name + ": Chemistry");
	}

	public ChemistryStudent(String name) {
		super();
		this.name = name;
	}
	
	

}
