package hcl.Day_8;

public class ContructorOverloading {
	
	ContructorOverloading(){
		System.out.println("Thank You ");
	}
	
	ContructorOverloading(int a){
		feedBack(a);
	}
	
	ContructorOverloading(int a, String b){
		feedBack(a);
		System.out.println("User Feedback : "+b);
	}
	
	
	static void feedBack(int a) {
		if(a>=5 && a<=10) {
			System.out.println("Thank you for your valuable feedback.");
		}
		else if(a<=4) {
			System.out.println("Thank you for your valuable feedback. We will Improve.");
		}
	}
	public static void main(String[] args) {
		ContructorOverloading User1= new ContructorOverloading();
		ContructorOverloading User2= new ContructorOverloading(3);
		ContructorOverloading User3= new ContructorOverloading(2);
		ContructorOverloading User4= new ContructorOverloading(9,"I will recommend.");
		 
		
	}
}
