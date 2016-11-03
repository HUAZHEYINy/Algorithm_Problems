package No_343_Integer_Break;

public class solution {
	public static void main (String[] args) {
		System.out.print(integerBreak(7));
	}
	
	public static int integerBreak (int n) {
		/**
		 * n = 2 = 1 + 1 ==> 1
		 * n = 3 = 1 + 2 ==> 2
		 * n = 4 = 2 + 2 ==> 4
		 * n = 5 = 2 + 3 ==> 6
		 * n = 6 = 3 + 3 ==> 9
		 * so on
		 * 	we can get the pattern with 3
		 * 
		 * */
		
		if (n == 2) { return 1; }
		if (n == 3) { return 2; }
		if (n % 3 == 0) {
			return (int) Math.pow(3, n/3); 
		} else if (n%3 == 1) {
			return ((int) Math.pow(3, n/3) / 3 * 4);
		} else {
			return ((int) Math.pow(3, n/3) * 2);
		}
	}

}
