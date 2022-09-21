package hcl.Day_7;

import java.util.Scanner;

class Product{
	void skill() {
		System.out.println("learn Skill ");
	}
	void skill(String sk) {
		System.out.println("great to hear you, You have a skill.");
	}
	
	void skill(String sk , String skk) {
		System.out.println("great to hear you, You have Two skills.");
	}
	void skill(String sk , String skk,String skkk) {
		System.out.println("great to hear you, You have Three skills.");
	}
}

public class Hcl_MethodOverloading {
	public static Scanner input = new Scanner(System.in); 
	public static void main(String[] args) {
		
		Product product =  new Product();
		product.skill();
		product.skill("Java");
		product.skill("JAVA", "SQL");
		product.skill("Java","SQL","HTML");
	}
}
