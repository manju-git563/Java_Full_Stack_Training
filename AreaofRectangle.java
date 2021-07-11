package week2assignment;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		double length=sc.nextDouble();
		
		System.out.println("Enter the width of Rectangle");
		double width=sc.nextDouble();
		
		double area=length*width;
		System.out.println("Area of Rectangle:"+area);
	}

}
