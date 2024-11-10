package github;
//find the minimum and maximum element with their index number from given array.
public class array 
{

	public static void main(String[] args) 
	{
		int[] array = {10, 4, 2, 30, 5, 6, 28, 1};
		int min = array[0]; 
		int max = array[0];
		int minIndex = 0;
		int maxIndex = 0; 
		for (int i = 1; i < array.length; i++) 
		{ 
			if (array[i] < min) 
			{
				min = array[i];
				minIndex = i;
			} 
			else if (array[i] > max) 
			{
				max = array[i]; 
				maxIndex = i;
			} 
		}
	  System.out.println("Minimum value: " + min + " at index: " + minIndex); 
	  System.out.println("Maximum value: " + max + " at index: " + maxIndex); 
   }
}



