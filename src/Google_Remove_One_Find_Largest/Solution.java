package Google_Remove_One_Find_Largest;

public class Solution {
	/**
	 * 删除其中的一个数，使结果最大。
	 * */
	public static void main(String[] args){
		System.out.println(findLar(83455753));
	}
	
	public static int findLar(int nums){
		String temp = Integer.toString(nums);
		int[] arr = new int[temp.length()];
		
		//intialize the array 
		for(int i = 0; i < arr.length; i++){
			arr[i] = temp.charAt(i) - '0';
		}
		
		int index = arr.length-1; //the remove element index.
		for(int i = 0; i < arr.length - 1; i++){
			if(i + 1 <= arr.length - 1 && arr[i] < arr[i+1]){
				index = i;
				break;
			}
		}
		
		temp = temp.substring(0,index)+temp.substring(index+1);
		System.out.println("result:"+temp);
		return Integer.parseInt(temp);
		
	}

}
