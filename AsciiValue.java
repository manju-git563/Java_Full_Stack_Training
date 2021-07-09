package week2assignment;
import java.util.Scanner;
public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char ch=sc.next().charAt(0);
		int j=ch;
		System.out.println("The ASCII value of your Character is:"+j);
	}

}
