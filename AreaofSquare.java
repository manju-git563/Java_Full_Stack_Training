package week2assignment;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side of Square");
		double side =sc.nextDouble();
		
		double area=side*side;
		System.out.println("The area of the square:"+area);
		
	}

}
