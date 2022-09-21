package hcl.Day_4;
import java.util.Scanner;
public class ObjectArray {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter of the length of array : ");
		int l= input.nextInt();
		Object arr[] = new Object[l];
		System.out.println("Enter the element of Array :");
		for(int i =0;i<arr.length;i++) {
			arr[i]=input.next();
		}
		
		for(Object i:arr) {
			System.out.print(" "+i+" ");
		}
	}
}
