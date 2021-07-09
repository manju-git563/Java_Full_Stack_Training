package week2assignment;

import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=sc.nextInt();
		if(i%2==0) {
			System.out.println("The given number is Even");
		}
		else {
			System.out.println("The given number is Odd");
		}
	}

}
