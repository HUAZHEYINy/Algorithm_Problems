package No_413_Arithmetic_Slices;

public class solutions {
	public static void main (String[] args) {
		int[] A = {1, 2, 3, 4, 6, 8, 10};
		System.out.println(numberOfArithmeticSlices(A));
	}
	
	/**
	 * for this question, we are finding there is a tricky point.
	 * 		If the length of arithmetic sequence is 3, then there is 1 possible sequence. 
	 * 					.........					4, 		.....    3....
	 * 					........					5, ........      6....
	 * 					.....						6,...			10
	 * 
	 * So that the difference of the number of possible sequence is also arithmetic sequence 
	 * 				which start from 1.
	 * 
	 * 
	 * */
	public static int numberOfArithmeticSlices(int[] A) {
		if (A.length <= 2) {
			return 0;
		}
		
		int count = 0;
		int count_diff = 1;
		int diff = A[1] - A[0];
		
		for (int i = 1; i < A.length - 1; i++) {
			int temp = A[i+1] - A[i];
			if (temp == diff) {
				count += count_diff;
				count_diff ++;
			} else {
				diff = A[i+1] - A[i];
				count_diff = 1;
			}
		}
		
		return count;
	}
}
