package hcl.Day_6;
import java.util.*;
public class ClassAndObject {
	String name;
	int modelNum;
	
	void display(String name, int modelNum) {
		System.out.println("Bike Name is " +name+" and Model is "+modelNum);
	}
	//by method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClassAndObject obj1 = new ClassAndObject();
		System.out.println("Enter bike name :");
		String n = input.nextLine();
		System.out.println("Enter bike Model :");
		int m = input.nextInt();
		obj1.display(n,m);
	}
}
