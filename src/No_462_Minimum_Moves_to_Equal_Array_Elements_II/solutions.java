package No_462_Minimum_Moves_to_Equal_Array_Elements_II;

import java.util.Arrays;

public class solutions {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		System.out.println(minMoves2(a));
	}
	/**
	 * 该题的思路很简单，
	 * 		就是找到这组数中的中位数。然后判断所有的数到中位数的差。
	 * 
	 * */
	public static int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		int mid = len / 2;
		int sum = 0;
		
		for (int i : nums) {
			sum += Math.abs(i - nums[mid]);
		}
		
		return sum;
	}

}
