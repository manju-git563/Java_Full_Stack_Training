package week2assignment;

import java.util.Scanner;

public class Sum_of_the_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number below 10:");
		number=sc.nextInt();
		sc.close();
		while(number<=10){
			sum=sum+number;
			number++;
		}
		System.out.format("The sum of the numbers:%d",sum);
	}

}
