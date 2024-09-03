//calculate area of rectangle

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        int l;
        int b;
        int h;
        int area;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the length:");
        l=sc.nextInt();
       
        System.out.println("enter the breadth:");
        b=sc.nextInt();
       
        System.out.println("enter the height:");
        h=sc.nextInt();

        area =(l*b*h );

        System.out.println("areaofrectangle:"+area);
        

    }    
}
