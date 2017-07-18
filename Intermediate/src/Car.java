public class Car extends Vehicle{



    private int wheel = 4;
    private String transmission = "?";
    private int totalDoors = 1;
	
	public Car(String name,int up_Keep, String transmission,int totalDoors, int wheel,int age) {

        super(name,up_Keep,age);
        this.wheel = wheel;
        this.transmission = transmission;
        this.totalDoors = totalDoors;
    }

    public int get_Bill() {
        if (wheel==0){
            return (1*totalDoors+up_Keep)*age;
        }
        if (totalDoors==0){
            return (wheel*1+up_Keep)*age;
        }
        if (age==0){
            return (wheel*totalDoors+up_Keep)*1;
        }

        return (wheel*totalDoors+up_Keep)*age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
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

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getTotalDoors() {
        return totalDoors;
    }

    public void setTotalDoors(int totalDoors) {
        this.totalDoors = totalDoors;
    }

	
	
	

	public String toString() {

		return name+" wheel "+wheel +" transmission "+transmission+ " totalDoors "+ totalDoors;
	
	}
}