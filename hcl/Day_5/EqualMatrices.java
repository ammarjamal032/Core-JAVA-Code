package hcl.Day_5;

public class EqualMatrices {
	public static void main(String[] args) {
		int arr1[][]= {{2,2,2},{3,3,3},{4,4,4}};
		int arr2[][]= {{2,2,2},{3,3,3},{4,4,4}};

		int row1 = arr1.length;
		int col1 = arr1[0].length;
		
		int row2 = arr2.length;
		int col2 = arr2[0].length;
		int f=1;
		if(row1 !=row2 || col1 != col2) {
			System.out.println("Matrices are not Equal.");
			System.exit(0);
		}
		else {
			for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(arr1[i][j] != arr2[i][j]){    
                	  f=0;        
                  }
             }    
		}
		
	}
		if(f==1) {
			System.out.println("Matrices are equal.");
		}
		else {
			System.out.println("Matrices are not equal");
		}
	}	
}
