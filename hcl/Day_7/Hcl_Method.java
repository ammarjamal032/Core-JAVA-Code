package hcl.Day_7;
import java.util.*;
public class Hcl_Method {
		String con1;
		int age;
		
		
	//parameter with no return
	 public void elig1(int a, String c) {
		 Hcl_Method obj1 = new Hcl_Method();
		if(a >= 18) {
			System.out.println("Your Constituency is "+con1+" You are eligable for vote.");
		}
		else {
			System.out.println("Your Constituency is "+con1+" but You are not eligable."+obj1.info(a));
			 
		}
	}
	//return and parameter
	public String info(int age) {
			String inf="You will eligable after"+(18-age)+" years";
			return inf;
		}
	//no return no parameter
	public void ThankYouNote() {
		System.out.println("Thank you");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hcl_Method obj = new Hcl_Method();
		System.out.println("Enter the age and Constituency:");
		obj.age= input.nextInt();
		
		obj.con1= input.next();
		
		obj.elig1(obj.age,obj.con1);
		
		obj.ThankYouNote();
		
	}
}
