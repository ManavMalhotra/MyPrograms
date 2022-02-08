import java.util.*;


public class evenOdd{

	static void evenOddfunc(int num){

		if (num%2 == 0) {
			System.out.println(num + " is EVEN NUMBER.");	
		} else{
			System.out.println(num + "is ODD NUMBER.");
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = in.nextInt();

		evenOddfunc(num);
	}

}