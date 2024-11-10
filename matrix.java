package github;
//search number from given 2d matrix
public class matrix {
	 public static boolean searchMatrix(int[][] matrix, int target) { 
		 for (int i = 0; i < matrix.length; i++) {
			 for (int j = 0; j < matrix[i].length; j++) { 
				 if (matrix[i][j] == target) { 
					 return true;
					 }
				 }
			 } 
		 return false;
	}
	 public static void main(String[] args) { 
		 int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; 
		 int number = 5; 
		 boolean result = searchMatrix(matrix, number);
		 if(searchMatrix(matrix,number)) {
			 System.out.println("number is search");
		 }else {
			 System.out.println("number is not search");
		 }
	 }
}
