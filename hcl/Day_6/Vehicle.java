package hcl.Day_6;
import java.util.*;
public class Vehicle {
	int year;
	String name;
	Vehicle(int y,String n){
		year=y;
		name=n;
	}
	void display() {
		System.out.println("Vehicle is "+name+" and year is "+year);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Bike name :");
		String n= input.nextLine();
		System.out.println("Enter the year:");
		int y = input.nextInt();
		//by constructor
		Vehicle obj = new Vehicle(y,n);
		obj.display();
	}
}
