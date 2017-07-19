public class Motorcycle extends Vehicle{

	int wheel = 2;
	String transmission = "?";


	public Motorcycle(String name,int up_Keep,int age) {

		super(name,up_Keep,age);
	}
	public int get_Bill() {
		return (wheel+up_Keep)*age;
	}
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}





	
	
	

	public String toString() {

		return name+" wheel "+wheel +" transmission "+transmission;
	
	}
}