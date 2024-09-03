//find the square root of given no

import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        System.out.println("The square root of " + num + " is: " + sqrt);     
    }
}
