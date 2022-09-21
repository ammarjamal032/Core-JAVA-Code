import java.util.Scanner;
public class Int_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("-----------Program number 1----------");
		System.out.println("Enter A number :");
		int num = input.nextInt();
		System.out.println("Number is :"+num);
		
		// add two number
		System.out.println("-----------Program number 2----------");
		
		System.out.println("Enter A number :");
		int num1 = input.nextInt();
		System.out.println("Ist Number is :"+num1);
		System.out.println("Enter Second Number :");
		int num2=input.nextInt();
		System.out.println("2nd Number is :"+num2);
		
		System.out.println("Sum of two number "+(num1+num2));
		
		
	}

}
