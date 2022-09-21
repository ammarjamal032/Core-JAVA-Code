package hcl.Day_4;
import java.util.Scanner;
public class ConcateTest {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);		
		System.out.println("Enter the Size of first array :");
		int size1 = input.nextInt();
		int array1[]= new int[size1];
		System.out.println("Enter the First Element of Array :");
		for(int i =0;i<array1.length;i++) {
			array1[i] = input.nextInt();
		}
		
		System.out.println("Enter the Size of Second array :");
		int size2 = input.nextInt();
		int array2[]= new int[size2];
		System.out.println("Enter the Second Element of Array :");
		for(int i =0;i<array2.length;i++) {
			array2[i] = input.nextInt();
		}
		
		int l = size1+size2;
		int arrCopy[]= new int[l];
		for(int i =0;i<array1.length;i++) {
			arrCopy[i] =array1[i];
		}
		for(int i=0;i<array2.length;i++) {
			arrCopy[size1+i]=array2[i];
			
		}
		
		for(int i =0;i<l;i++) {
			System.out.print(" "+arrCopy[i]);
		}
		
	}
}
