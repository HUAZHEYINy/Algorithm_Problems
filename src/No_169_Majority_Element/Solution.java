package No_169_Majority_Element;

import java.util.HashSet;
import java.util.Hashtable;

public class Solution {
	public static void main(String[] args){
		
	}
	
	public int majorityElement(int[] nums){
		int limit = nums.length / 2;
		
		Hashtable<Integer,Integer> hash = new Hashtable<Integer,Integer>();
		for(int num : nums){
			if(hash.containsKey(num)){
				int pre = Integer.parseInt(hash.get(num).toString());
				if(( pre + 1 )> limit)
				{
					return num;
				}
					
				hash.put(num, pre+1);
			}
			else
				hash.put(num,1);
		}
		return nums[0];
	}

}
