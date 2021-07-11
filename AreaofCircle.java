package week2assignment;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius =sc.nextDouble();
		
		double area=Math.PI*(radius*radius);
		System.out.println("Area of circle:"+area);
		
		double circum=Math.PI*2*radius;
		System.out.println("The Circumference of circle:"+circum);
	}

}
