package github;
/*given an array of integer array.Find the value Zero and Move it to the end of the array 
while Maintaining the relative order of non-zero elements*/

public class integerArray {
	public static void moveZeros(int[] nums) { 
		int index = 0;  
		for (int i = 0; i < nums.length; i++) { 
			if (nums[i] != 0) { 
				nums[index++] = nums[i]; 
		} 
	} 
		while (index < nums.length) {
			nums[index++] = 0; 
		} 
	}
	public static void main(String[] args) {
		int[] nums = {0, 1, 5, 3, 12,0}; 
		moveZeros(nums);
	    for (int num : nums) {
	    	System.out.print(num + " "); 
	    } 
	  }
}

