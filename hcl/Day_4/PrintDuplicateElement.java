package hcl.Day_4;

public class PrintDuplicateElement {
	public static void main(String[] args) {
		int arr[] = {25,36,25,45,45};
//	for(int i =0;i<arr.length;i++) 
//	{
//		System.out.println(" "+arr[i]);
//	}
		int temp[] =new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(" "+arr[i]);
				}
			}
		}
	}
}
