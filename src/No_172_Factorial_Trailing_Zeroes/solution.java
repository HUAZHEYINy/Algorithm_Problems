package No_172_Factorial_Trailing_Zeroes;

public class solution {
	public static void main (String[] args) {
		System.out.println(trailingZeroes(26));
	}
	/**
	 * we only care about the number of the divisor of 5. 
	 * 
	 * one more thing is for 25 contains two 5s. So after divide by 5 we have to divide by 25. as well
	 * 
	 * and so on for 125...
	 * */
	public static int trailingZeroes (int n) {
		if ( n == 0) { return 0; }
		int count = 0;
		while (n != 0) {
			 n /= 5;
			 count += n;
		}
		
		return count;
	}
}
