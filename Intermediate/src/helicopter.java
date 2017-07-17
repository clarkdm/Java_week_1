public class helicopter extends Vehicle{
	
	
	public helicopter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	int wheel = 3;
	int totalRotors = 1;
	int totalDoors = 1;
	//String name,int wheel,String transmission,int totalDoors
	

	public void get_wheel(int wheel) {
		this.wheel =wheel;
		
	
	}
	public int set_wheel() {

		return wheel;
	
	}
	public void get_totalRotors(int totalRotors) {
		this.totalRotors =totalRotors;
		
	
	}
	public int set_totalRotors() {

		return totalRotors;
	
	}
	public void get_totalDoors(int totalDoors) {
		this.totalDoors =totalDoors;
		
	
	}
	public int set_totalDoors() {

		return totalDoors;
	
	}
	
	
	

	public String toString() {

		return name+" wheel "+wheel+ " totalDoors "+ totalDoors+" totalRotors "+totalRotors;
	
	}
}