package hcl.Day_4;
import java.util.Scanner;
public class CharValue {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter of the length of array : ");
	int l= input.nextInt();
	char arr[] = new char[l];
	System.out.println("Enter the element of Array :");
	for(int i =0;i<arr.length;i++) {
		arr[i]=input.next().charAt(0);
	}
	
	for(char i:arr) {
		System.out.print(" "+i+" ");
	}
	
}
}
