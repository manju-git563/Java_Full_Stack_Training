package week2assignment;

public class JavaNestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				System.out.println(i+" "+j);
			}
		}
		System.out.println("***********");
		for(int i=4;i>=1;i--) {
			for(int j=4;j>=1;j--) {
				System.out.println(i+" "+j);
			}
		}
	}

}
