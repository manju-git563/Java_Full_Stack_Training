package week2assignment;
import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1:");
		int num1=sc.nextInt();
		System.out.println("Enter the number2:");
		int num2=sc.nextInt();
		int product=num1*num2;
		System.out.println("The Multiplication of two number is:"+product);
	}

}
