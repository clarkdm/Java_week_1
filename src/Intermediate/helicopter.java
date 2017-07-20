package Intermediate;

public class helicopter extends Vehicle{


	int wheel = 3;
	int totalRotors = 2;
	int totalDoors = 1;




	public helicopter(String name,int up_Keep,int age) {
		super(name,up_Keep,age);
	}

	public int get_Bill() {
		return (wheel*totalDoors+up_Keep)*totalRotors*age;
	}

	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUp_Keep() {
		return up_Keep;
	}

	public void setUp_Keep(int up_Keep) {
		this.up_Keep = up_Keep;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getTotalRotors() {
		return totalRotors;
	}

	public void setTotalRotors(int totalRotors) {
		this.totalRotors = totalRotors;
	}

	public int getTotalDoors() {
		return totalDoors;
	}

	public void setTotalDoors(int totalDoors) {
		this.totalDoors = totalDoors;
	}
	

	public String toString() {

		return name+" wheel "+wheel+ " totalDoors "+ totalDoors+" totalRotors "+totalRotors;
	
	}
}