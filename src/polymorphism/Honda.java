package polymorphism;

public class Honda extends Bike {
	public String type = "Honda";

	public Honda(String plate) {
		super(plate);
		// TODO Auto-generated constructor stub
	}

	//inheritance method
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.getPlate() + ":Honda run");
		
	}
	
	@Override
	public void brake(){
		System.out.println(this.getPlate() + ":Honda brake");
	}
	

}
