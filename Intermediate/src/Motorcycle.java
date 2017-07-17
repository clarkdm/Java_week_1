public class Motorcycle extends Vehicle{
	
	
	public Motorcycle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	int wheel = 2;
	String transmission;
	//int totalDoors = 0;
	//String name,int wheel,String transmission,int totalDoors
	

	public void get_transmission(String transmission) {
		this.transmission =transmission;
		
	
	}
	public String set_transmission() {

		return transmission;
	
	}
	
	
	

	public String toString() {

		return name+" wheel "+wheel +" transmission "+transmission;
	
	}
}