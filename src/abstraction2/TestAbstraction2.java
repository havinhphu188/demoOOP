package abstraction2;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList();
		students.add(new MathStudent("pha1"));
		students.add(new MathStudent("pha2"));
		students.add(new ChemistryStudent("pha3"));
		students.add(new ChemistryStudent("pha4"));
		students.add(new MathStudent("pha5"));
		
		for (Student std:students){
			std.printSubject();
		}
	}

}
