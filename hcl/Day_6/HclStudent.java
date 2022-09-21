package hcl.Day_6;
import java.util.*;
public class HclStudent {
	String name;
	String className;
	public static Scanner input = new Scanner(System.in);
	
	void display() {
		System.out.println("Name is "+name);
		System.out.println("Class is "+className);
	}
	
	//by reference
	public static void main(String[] args) {
		HclStudent obj = new HclStudent();
		System.out.println("Enter Name :");
		obj.name=input.nextLine();
		System.out.println("Enter the class :");
		obj.className =input.nextLine();

		obj.display();
		}
}
