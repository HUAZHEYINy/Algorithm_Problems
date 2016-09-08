package No_136_Single_Number;

public class Solution {
	public static void main(String[] args){
		int[] list = {1,1,2,3,4,3,4};
		System.out.println(singleNumber(list));
	}
	
	public static int singleNumber(int[] nums){
		/*
		 * xor 
		 *   1 xor 1 = 0
		 *   0 xor 0 = 0
		 *   1 xor 0 = 1
		 *   0 xor 1 = 1
		 * **/
		
		for(int i = 1; i < nums.length; i++){
			nums[0] ^= nums[i];
		}
		return nums[0];
		
	}

}
