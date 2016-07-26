package No_26_Remove_Duplicates_from_Sorted_Array;

public class Solution {
	public static void main(String[] args){
		int[] arr = {1,1,2,3,3,4,5};
		System.out.println(removeDuplicates(arr));
	}
	
	//only check the number of  single digit
	public static int removeDuplicates(int[] nums){
		
		if(nums == null || nums.length == 0)return 0;
		
		int count = 0;
		for(int i = 0; i <= nums.length - 1;){
			count ++;
			int next = i + 1;
			while(next <= nums.length - 1 && nums[i] == nums[next]){
				next++;
			}
			System.out.println("next"+next);
			i = next;
		}
		return count;
	}
	
	//check the number of single digit and also replace 
	public static int removeDuplicates_2(int[] nums){
		int i = 0; 
		int k = 0;
		if(nums.length == 0)return 0;
		for(i = 1; i < nums.length; i++){
			if(nums[i] > nums[k]){
				k++;
				nums[k] = nums[i];
			}
		}
		return k + 1;
	}

}
