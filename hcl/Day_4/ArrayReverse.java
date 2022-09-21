package hcl.Day_4;

public class ArrayReverse {
public static void main(String[] args) {
	int arr[] = {10,20,30};
	for(int i =0;i<arr.length;i++) 
	{
		System.out.println(" "+arr[i]);
	}
	int n =arr.length;
	int[] temp = new int[n];
    int j = n;
    for (int i = 0; i < n; i++) {
        temp[j - 1] = arr[i];
        j = j - 1;
    }
    System.out.println("Reverse array \n");
    for(int k =0 ;k<n;k++) {
    	System.out.println(" "+temp[k]);
    }
}
}
