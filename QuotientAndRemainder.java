package week2assignment;

import java.util.Scanner;
public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the dividend:");
		int dividend=reader.nextInt();
		System.out.println("Enter the divisor");
		int divisor=reader.nextInt();
		int quotient=dividend/divisor;
		int remainder=dividend%divisor;
		System.out.println("Quotient of your number is:"+quotient);
		System.out.println("Remainder of your number is:"+remainder);
	}

}
