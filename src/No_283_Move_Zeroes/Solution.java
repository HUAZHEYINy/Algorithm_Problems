package No_283_Move_Zeroes;

public class Solution {
	public static void main(String[] args){
		int [] nums = {1,2,3,4};
		int oops = 0;
		System.out.println(nums[oops++]);
		System.out.println(oops);
	}
	/**
	 * insert non-zero number from beginning as long as we found. 
	 * set the value to zero which are behind the oops position. 
	 * 
	 * */
	public void moveZeroes(int[] nums){
		if(nums == null || nums.length == 0)
			return ;
		
		int oops = 0;
		for(int num:nums){
			if(num != 0) nums[oops++] = num;
		}
		for(;oops < nums.length;){
			nums[oops++] = 0;
		}
	}

}
