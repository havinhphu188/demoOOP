package inheritanceandencapsulation;

import java.util.HashMap;
import java.util.Map;

public abstract class NonTechnical extends Employee {
	private Map<String, Integer> jobExperience = new HashMap();

	@Override
	public void messasge(){
		System.out.println("Employee");
	}
	
	public void addExperience(String techName, int yearOfExperience) {
		jobExperience.put(techName, yearOfExperience);
	}

	public void printExperience() {
		System.out.println(this.getName());
		for (Map.Entry<String, Integer> entry : jobExperience.entrySet()) {
			System.out.println("Tech = " + entry.getKey() + ", YearOfEx = " + entry.getValue());
		}
	}

}
