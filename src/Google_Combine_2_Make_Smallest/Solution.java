package Google_Combine_2_Make_Smallest;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println(combine(369852));
	}
	
	public static int combine(int nums){
		
	/**
	 * find the first number i follow the following equation.
	 * 
	 * i > i+1 > i+2
	 * 
	 * 
	 *    if(i > i + 1 but not i + 1 > i + 2) j = i + 1;
	 *    if(i > i + 1 > i + 2) j = i + 1 and break;
	 *    if(i < i + 1) j = i -1
	 * */
		String str = Integer.toString(nums);
		int [] arr = new int[str.length()];
		
		//split the digits to an array
		for(int i = 0; i < arr.length; i++){
			arr[i] = str.charAt(i) - '0';
		}
		
		int j = 0; // remove digit index
		for(int i = 0; i < arr.length ; i++)
		{
			if(i + 1 <= arr.length - 1 && arr[i] >= arr[i+1]){
		
				if(i + 2 <= arr.length - 1&& arr[i+1] >= arr[i+2]){
					j = i + 1;
					break;
				}
				else{
					j = i + 1;
					if(j == arr.length-1){
						break;
					}
				}
			}
			else{
				//nothing
				j = i - 1;
			}
		}
		
		System.out.println(str);
		str = str.substring(0,j) + str.substring(j+1);
		System.out.println("Result:"+str);
		
		return Integer.parseInt(str);
	}

}
