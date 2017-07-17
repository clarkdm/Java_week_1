import java.util.ArrayList;

public class Intermediate {

	public static void main(String[] args) {

		System.out.println(blackjack(23, 45));
		System.out.println(blackjack(23, 4));
		System.out.println(blackjack(6, 45));
		System.out.println(blackjack(21, 7));
		System.out.println(blackjack(8, 20));

		System.out.println();
		System.out.println(unique_Sum(1, 2, 3));
		System.out.println(unique_Sum(3, 3, 3));
		System.out.println(unique_Sum(1, 1, 2));
		
		System.out.println();
		System.out.println(too_Hot(111,true));
		System.out.println(too_Hot(30,true));
		System.out.println(too_Hot(77,true));
		System.out.println(too_Hot(94,true));
		System.out.println(too_Hot(111,false));
		System.out.println(too_Hot(77,false));
		System.out.println(too_Hot(33,false));
		System.out.println(too_Hot(94,false));
		People();

	}
	
	
	
	
	public static void People() {
		
		Person bob = new Person("bob",10, "ArrayList");
		Person bo = new Person("bob2",11, "ArrayList");
		Person b = new Person("bob3",12, "ArrayList");
		
		 ArrayList<Person> bobs = new ArrayList<Person>();
		 bobs.add(bob);
		 bobs.add(bo);
		 bobs.add(b);
		 
		 for (int i = 0; i < bobs.size(); i++) {
			 System.out.println(bobs.get(i));
		}
		
	}
	
	
	
	
	
	
	

	public static int blackjack(int a, int b) {
		if (b > 21 && a > 21) {

			return 0;
		}

		if (a == b) {
			if (a <= 21) {
				return a;
			}

			return 0;
		}

		if (a <= 21 && b > 21) {

			return a;

		}

		if (b <= 21 && a > 21) {

			return b;

		}
		if (a > b) {
			return a;

		} else {
			return b;
		}

	}

	public static int unique_Sum(int a, int b, int c) {
		int total = 0;
		if (a == b | a == c) {
			total = 0;
		} else {
			total = a;
		}
		if (a == b | b == c) {
			total = 0;
		} else {
			total = total + b;
		}

		if (a == c | b == c) {
			total = 0;
		} else {
			total = total + c;
		}
		return total;

	}

	public static boolean too_Hot(int temperature, Boolean isSummer) {

		if (isSummer) {
			if (temperature < 100 && temperature > 60) {
				return true;
			}else {
				return false;
			}

		}else {
			if (temperature < 90 && temperature > 60) {
				return true;
			}else {
				return false;
			}
		}

	}

}
