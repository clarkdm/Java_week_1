package Intermediate;

public abstract class Vehicle {
	
	String name = "";
	int range = 0;
	int up_Keep = 0;
	int age = 0;
	public int getUp_Keep() {
		return up_Keep;
	}

    public String getName() {
        return name;
    }

    //int wheel = 0;
	//String transmission = "";
	//int totalDoors = 0;
	//String name,int wheel,String transmission,int totalDoors
	public  Vehicle(String name,int up_Keep,int age) {
		this.up_Keep = up_Keep;
		this.name = name;
		this.age = age;
	}
	public  Vehicle() {

	}

	public int get_Bill() {

		return up_Keep;

	}


	public String toString() {

		return name;

	}
}

