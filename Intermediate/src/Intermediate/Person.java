package Intermediate;

public class Person {
	String name = "";
	int age = 0;
	String job_Title = "";

	public  Person(String name, int age, String job_Title) {
		this.name = name;
		this.age = age;
		this.job_Title = job_Title;
	}

	public String toString() {

	return name + " is age "+age+" and is a " + job_Title;

}




}