package Google_Combine_2_Make_Largest;

public class Solution {
	public static void main(String[] args){
		System.out.println(combine(91));
	}
	
	public static int combine(int nums){
		String temp = Integer.toString(nums);
		int[] arr = new int[temp.length()];
		for(int i = 0; i < arr.length; i++){
			arr[i] = temp.charAt(i) - '0';
		}
		int index = arr.length - 1;//index of removed element
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > arr[i-1]){
				index = i - 1;
				break;
			}
		}
		
		temp = temp.substring(0,index) + temp.substring(index+1);
		
		return Integer.parseInt(temp);
	}
}
