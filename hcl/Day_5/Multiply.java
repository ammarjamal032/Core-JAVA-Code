package hcl.Day_5;

public class Multiply {
	public static void main(String[] args) {
		int arr1[][]= {{2,2,2},{3,3,3},{4,4,4}};
		int arr2[][]= {{2,2,2},{3,3,3},{4,4,4}};
		int sum[][] = new int[arr1.length][arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				sum[i][j] = 0;
				for(int c=0;c<arr1.length;c++) {
					sum[i][j] = arr1[i][c]*arr2[c][j];
				}
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
