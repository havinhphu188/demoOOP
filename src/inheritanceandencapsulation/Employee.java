package inheritanceandencapsulation;

public abstract class Employee {
	private String name;
	private int age;
	
	public abstract void getTitle();
	
	public void messasge(){
		System.out.println("Employee");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 18 || age > 65) throw new IllegalArgumentException("Age must be from 18 to 65");
		else
			this.age = age;
	}

}
