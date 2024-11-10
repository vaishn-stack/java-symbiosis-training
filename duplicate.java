package github;
//find duplicates in a array
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 1, 2, 4, 5}; 
		for (int i = 0; i < array.length; i++) { 
			for (int j = i + 1; j < array.length; j++) { 
				if (array[i] == array[j]) {
					System.out.println("Duplicate found: " + array[i]);
			}
		}
	}
 }
}
