package hcl.Day_4;

public class EvenPositionValue {
public static void main(String[] args) {
	int arr[] = {25,36,14,23,45,65,12,58};
	for (int i =0 ; i< arr.length;i++) {
		System.out.print(" "+arr[i]);
	}
	System.out.println("\nEven Position Elements :");
	for(int k =0; k<arr.length;k++) {
		if(k%2==0) {
			System.out.println(" "+arr[k]);
		}
	}
}
}
