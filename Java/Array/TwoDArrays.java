import java.util.*;
 
public class TwoDArrays{
   public static void main(String args[]) {

       Scanner in = new Scanner(System.in);
       int row = in.nextInt();
       int col = in.nextInt();
       int[][] marks = new int[row][col];

       // input

       for (int i =0;i<row ;i++ ) {
       		for (int j =0;j<col ;j++ ) {
       			marks[i][j] = in.nextInt();
       		}
       }

       // output
       for (int i =0;i<row ;i++ ) {
       		for (int j =0;j<col ;j++ ) {
       			System.out.print(marks[i][j] + " ");
       		}
       		System.out.println();
       	}
    }
}