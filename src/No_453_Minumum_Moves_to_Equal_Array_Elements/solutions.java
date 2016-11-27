package No_453_Minumum_Moves_to_Equal_Array_Elements;

import java.util.Arrays;

public class solutions {
	public static void main(String[] args) {
		int[] a = {1, 2, 3,4};
		System.out.println(minMoves(a));
	}
	
	/**
	 * Give a non-empty integer array of size n, find the minimum number of moves 
	 * 		required to make all array elements equal, where a move is incrementing n - 1 elements by 1
					 * 题目大意：
				给定一个长度为n的非空整数数组，计算最少需要多少次移动可以使所有元素相等，一次移动是指将n - 1个元素加1。
				
				解题思路：
				一次移动将n - 1个元素加1，等价于将剩下的1个元素减1。
				
				因此累加数组中各元素与最小值之差即可。


	 * */
	public static int minMoves (int[] nums) {
		Arrays.sort(nums);
		int small = nums[0];
		int sum = 0;
		
		for(int i = 1; i < nums.length; i++) {
			sum += nums[i] - small;
		}
		
		return sum;
	}

}
