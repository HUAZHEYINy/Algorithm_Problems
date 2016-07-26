package No_137_Single_Number_II;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args){
		int[] arr = {1,2,4,1,1,2,2,4,3};
		System.out.println(singleNumber(arr));
	}
	
	//3s pattern after sorted. 
	public static int singleNumber(int[] nums){
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length - 1; i++){
			int sum = 0;
			int j = i;
			while(i <= j + 2 && i < nums.length){
				sum += nums[i];
				i++;
			}
			i--;
			if(sum == 3*nums[i]) {
				continue;
				}
			else{
				return nums[i-2];
			}
			
		}
		return nums[nums.length-1];
		
	}
}