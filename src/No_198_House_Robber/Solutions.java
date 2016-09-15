package No_198_House_Robber;

public class Solutions {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(rob(nums));
	}
	
	public static int rob(int[] nums){
		/*
		 * This question is a dynamic programming...
		 * 
		 * 保证上一天都是前几天能偷钱，偷盗的最大值！
		 * **/
		if(nums.length == 0 || nums == null) return 0;
		
		for(int i = 1; i < nums.length; i++){
			if(i == 1){
				nums[i] = Math.max(nums[i], nums[i-1]);
			}else{
				nums[i] = Math.max(nums[i-1], nums[i] + nums[i-2]);
			}
		}
		
		return nums[nums.length-1];
	}

}
