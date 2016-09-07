package No_384_Shuffle_An_Array;

import java.util.Random;

public class Solution {

	public int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	Random random = new Random();
    	int[] index = new int[nums.length];
    	//initialize the index array
    	for(int i = 0; i < index.length; i++){
    		index[i] = i;
    	}
    	//swap 
    	for(int i = index.length - 1; i >= 0; i--){
    		int t = random.nextInt(i+1);
    		int swap = index[i];
    		index[i] = index[t];
    		index[t] = swap;
    	}
    	
    	for(int i = 0; i < index.length; i++){
    		index[i] = this.nums[index[i]];
    	}
        return index;
    }
    
    public static void main(String[] args){
    	
    }
}