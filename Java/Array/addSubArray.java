import java.util.*;
public class addSubArray{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number of Row: ");
		int row= in.nextInt();
		System.out.print("Enter Number of Column: ");
		int col= in.nextInt();
		int[][] marks1 = new int[row][col];

		//input // FIRST ARRAY

		for (int i = 0;i<row ;i++ ) {
			for (int j= 0;j<col ;j++ ) {
				System.out.print("Enter Data at "+i+","+j+" : ");
				marks1[i][j] = in.nextInt();
			}
		}

		//output // FIRST ARRAY
		System.out.println("FIRST ARRAY is: ");	

		for (int i = 0;i<row ;i++ ) {
			for (int j= 0;j<col ;j++ ) {
				System.out.print(marks1[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println();

		//input // SECOND ARRAY
		int[][] marks2 = new int[row][col];

		for (int i = 0;i<row ;i++ ) {
			for (int j= 0;j<col ;j++ ) {
				System.out.print("Enter Data at "+i+","+j+" : ");
				marks2[i][j] = in.nextInt();	
			}
		}

		//output // SECOND ARRAY

		System.out.println("SECOND ARRAY is: ");	

		for (int i = 0;i<row ;i++ ) {
			for (int j= 0;j<col ;j++ ) {
				System.out.print(marks2[i][j]+" ");	
			}
			System.out.println();
		}

		//ADDTION

		System.out.println("Addition of ARRAY is: ");	
		int[][] total = new int[row][col];
		for (int i = 0;i<row ;i++ ) {
			for (int j= 0;j<col ;j++ ) {
				total[i][j] = marks1[i][j] + marks2[i][j];
				System.out.print(total[i][j]+" ");	
			}
			System.out.println();
		}

		//Subtraction

		System.out.println("Subtraction of ARRAY is: ");

		for (int i = 0;i<row ;i++ ) {
			for (int j= 0;j<col ;j++ ) {
				total[i][j] = marks1[i][j] - marks2[i][j];
				System.out.print(total[i][j]+" ");	
			}
			System.out.println();
		}

	}
}