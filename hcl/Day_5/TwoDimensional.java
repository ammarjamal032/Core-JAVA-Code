package hcl.Day_5;

public class TwoDimensional {
	public static void main(String[] args) {
		int arr1[][]= {{2,2,2},{3,3,3},{4,4,4}};
		int arr2[][]= {{2,2,2},{3,3,3},{4,4,4}};
		int sum[][] = new int[arr1.length][arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.print(" "+sum[i][j]);
				
			}
			System.out.println();
		}
	}
}
