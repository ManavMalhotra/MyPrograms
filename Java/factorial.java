import java.util.*;

public class factorial{
	static void facto(int num){
		int fact = 1;
		for (int i=1;i<=num ;i++ ) {
			fact = fact * i ;
		}
			System.out.println("Factorial of "+ num + " is "+ fact);
	
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = in.nextInt();
		facto(num);

	}
}