package OverRiding;

// Super class

class Bank{
	double intRate(double i) {
		return i;
	}
}

//child class
class Sbi extends Bank{
	@Override
	double intRate(double i) {
		return i;
	}
}
//child class
class ICICI extends  Bank{
	@Override
	double intRate(double i) {
		return i;
	}
}
//Main Class
public class Main {
	public static void main(String[] args) {
		//object of super class;
		Bank bk = new Bank();
		System.out.println("Max offer Interest Rate by Bank :"+bk.intRate(9.0)+" %");
		//object of child class
		ICICI ic = new ICICI();
		System.out.println("Max offer Interest Rate by ICICI :"+ic.intRate(8.5)+" %");
		//object of child class
		Sbi sbi = new Sbi();
		System.out.println("Max offer Interest Rate by SBI :"+sbi.intRate(7.5)+" %");
	}
}
