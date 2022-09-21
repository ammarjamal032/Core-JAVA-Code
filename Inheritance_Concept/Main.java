package Inheritance_Concept;

public class Main {

	public static void main(String[] args) {
		//Creating object of child class.
		Android ob = new Android();
		ob.setVersion("version 1.1");
		
		System.out.println(ob.getVersion());
		
		OnePlus op = new OnePlus();
		Nokia nk = new Nokia();
//		
		//passing the value for OnePlus class;
	op.setName("Nord 2");
		op.setCost(25555);
		op.setRam(4);
		op.setVersion("Android 1.01");
//		
//		//passing the value for Nokia class;
		nk.setName("C01 Plus");
		nk.setCost(10000);
		nk.setRam(3);
		nk.setVersion("Android 10");
		
//		//accessing the values from super via child class
		System.out.println("-------Oneplus-------");
		System.out.println("Name :"+op.getName());
		System.out.println("Version :"+op.getVersion());
		System.out.println("Cost :"+op.getCost());
		System.out.println("Ram :"+op.getRam()+" GB");
		
		
		//calling the overriden method;
		op.year();
		
		
		//accessing the values from super via child class
		System.out.println("-------Nokia-------");
		System.out.println("Name :"+nk.getName());
		System.out.println("Version :"+nk.getVersion());
		System.out.println("Cost :"+nk.getCost());
		System.out.println("Ram :"+nk.getRam()+" GB");
		
		//calling the overriden method;
		nk.year();
	}
}
