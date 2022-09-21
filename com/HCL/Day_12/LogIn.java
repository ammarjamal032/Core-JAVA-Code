package com.HCL.Day_12;
import java.util.Scanner;
public class LogIn {
	final static int pass = 4411;
	public static Scanner input = new Scanner(System.in);
	
	static void display(int n) {
		if(pass == n) {
			System.out.println("Logged in");
	
		}
		else {
			System.out.println("Incorrect password");
		}
		
	}
	public static void main(String[] args) {
		try {
			System.out.println("Enter your pin:");
			int n = input.nextInt();
			display(n);
			
		}
		catch(Exception ex) {
			System.out.println("Error :Enter number Only");
		}
		
	}
	
}
