//find the maximum and minimum value of a given number
import java.util.Scanner;
public class max 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for (int i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            {
                max=a[i];
            }
            System.out.println("maximum number is:"+ max);
            System.out.println("minimum number is:"+ min);
        }
    }    
}
