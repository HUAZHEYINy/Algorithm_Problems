package No_260_Single_Number_III;

import java.util.Hashtable;

public class Solution {
	public static void main(String[] args){
		
	}
	
	
	
	//use hashtable
	public static int[] singleNumber(int[] nums){
		int[] result = new int[2];
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int num : nums){
			if(table.containsKey(num)){
				table.put(num, table.get(num)+1);
			}
			else table.put(num, 1);
		}
		int i = 0;
		for(int num : nums){
			if(table.get(num) == 1){
				result[i] = num;
				i++;
			}
		}
		return result;
	}
	

}
