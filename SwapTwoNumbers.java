package week2assignment;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=24;
		int num2=64;
		System.out.println("Before Swapping");
		System.out.println(num1);
		System.out.println(num2);
		
		int temp=0;
		
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping");
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
