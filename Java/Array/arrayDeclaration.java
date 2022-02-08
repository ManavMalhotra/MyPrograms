public class arrayDeclaration{
	public static void main(String[] args) {
		int[] StudentMarks = new int[2];
		StudentMarks[0] = 100;
		StudentMarks[1] = 32;
		for (int i= 0; i< StudentMarks.length ;i++ ) {
			System.out.println(StudentMarks[i]);
		}
	}
}