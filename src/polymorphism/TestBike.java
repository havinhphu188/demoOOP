package polymorphism;

public class TestBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Honda("HD1");
		bike.brake();
		
		Honda bike1 = (Honda)bike;
		bike1.run();
		bike1.brake();
		
		Honda honda = new Honda("HD2");
		Bike bike2 = honda;
		
		bike2.brake();
		
		System.out.println("bike2: " + bike2.type);
		System.out.println("honda2: " + honda.type);
		
		

	}

}
