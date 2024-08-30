//package test;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double pi=3.14,area,circumference;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("enter the area of circle:"+ area);
		circumference=2*pi*r;
		System.out.println("enter the circumference of circle:"+circumference);
		

	}

}
