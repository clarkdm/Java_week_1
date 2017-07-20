package Intermediate;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> bobs;


	public Garage() {
		bobs = new ArrayList<Vehicle>();
		
	}


	public boolean add_Vehicle(Vehicle v) {

		return bobs.add(v);



	}

	public boolean remove_Vehicle(Vehicle v) {

		return bobs.remove(v);

	}

	public int calculating_bills() {
		int total = 0;
		for (int i =0;i<bobs.size();i++){
		total = total + bobs.get(i).get_Bill();

		}

		return total;

	}
	public String fix_index(int index) {
		Vehicle temp = bobs.get(index);
		bobs.remove(index);
		return temp.get_Bill()+" £";

	}
	public String fix_Vehicle(Vehicle temp) {
		if (bobs.contains(temp)) {
			bobs.remove(temp);
			return temp.get_Bill() + " £";
		}
		return "E";
	}

    public String fix_Text(String temp) {

	    for (int i =0;i<bobs.size();i++){

            if (bobs.get(i).getName().equals(temp)) {
                Vehicle temp_V = bobs.get(i);
                bobs.remove(i);
                return temp_V.get_Bill() + " £";
            }
	    }
        return "E";
    }

	public boolean remove_All(Vehicle v) {

		return bobs.remove(v);

	}



	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
