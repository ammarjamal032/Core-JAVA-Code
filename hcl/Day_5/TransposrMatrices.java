package hcl.Day_5;

public class TransposrMatrices {
	public static void main(String[] args) {
		int arr1[][]= {{2,2,2},{3,3,3},{4,4,4}};
		
		int copy[][] = new int[arr1.length][arr1[0].length];
		
		System.out.println("Before Transpose....");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print(" "+arr1[i][j]);
				
			}
			System.out.println();
		}
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				copy[i][j] = arr1[j][i];
			}
		}
		
		System.out.println("After Transpose....");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print(" "+copy[i][j]);
				
			}
			System.out.println();
		}
	}
}
