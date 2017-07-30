package polymorphism;

public abstract class Bike {
	private String plate;
	public String type = "bike";
	

	public Bike(String plate) {
		super();
		this.plate = plate;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	public void brake(){
		System.out.println(this.plate + ":Bike brake");
	}
}
