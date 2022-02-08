import java.util.* ;

public class maxMin{

	static void maxMinfunc(int num1, int num2, int num3) {
		if (num1>num2 && num1>num3) {
			System.out.println("Maximum Number: " + num1);
			if (num2>num3) {
			System.out.println("Minimum Number: " + num3);
			} else{
			System.out.println("Minimum Number: " + num2);
			}
		} else if (num2>num1 && num2>num3) {
			System.out.println("Maximum Number: " + num2);
			if (num1 > num3) {
			System.out.println("Minimum Number: " + num3);
			} else{
			System.out.println("Minimum Number: " + num1);

			}
		} else if (num3> num1 && num3 > num2) {
			System.out.println("Maximum Number: " + num3);
			if (num1 > num2) {
			System.out.println("Minimum Number: " + num2);
			} else{
			System.out.println("Minimum Number: " + num1);

			}
		}

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num1 = in.nextInt();
		System.out.println("Enter Number: ");
		int num2 = in.nextInt();
		System.out.println("Enter Number: ");
		int num3 = in.nextInt();
		maxMinfunc(num1,num2,num3);
		
	}
}