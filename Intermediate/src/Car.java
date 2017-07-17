public class Car extends Vehicle{
	
	
	public Car(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	int wheel = 4;
	String transmission;
	int totalDoors = 1;
	
	

	public void get_transmission(String transmission) {
		this.transmission =transmission;
		
	
	}
	public String set_transmission() {

		return transmission;
	
	}
	public void get_totalDoors(int totalDoors) {
		this.totalDoors =totalDoors;
		
	
	}
	public int set_totalDoors() {

		return totalDoors;
	
	}
	
	
	

	public String toString() {

		return name+" wheel "+wheel +" transmission "+transmission+ " totalDoors "+ totalDoors;
	
	}
}