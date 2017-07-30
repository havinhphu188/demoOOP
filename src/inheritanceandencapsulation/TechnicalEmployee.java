package inheritanceandencapsulation;

import java.util.HashMap;
import java.util.Map;

public abstract class TechnicalEmployee extends Employee {
	private Map<String, Integer> technologyExperience = new HashMap();
	
	@Override
	public void messasge(){
		System.out.println("TechnicalEmployee");
	}
	
	public void addExperience(String techName, int yearOfExperience){
		technologyExperience.put(techName, yearOfExperience);
	}
	
	public void printExperience() {
		System.out.println(this.getName());
		for (Map.Entry<String, Integer> entry : technologyExperience.entrySet()) {
		    System.out.println("Tech = " + entry.getKey() + ", YearOfEx = " + entry.getValue());
		}
	}

}
