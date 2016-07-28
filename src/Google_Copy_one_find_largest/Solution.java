package Google_Copy_one_find_largest;

public class Solution {
	public static void main(String[] args){
		System.out.println(doSome(1121));
	}
	/**
	 * copy one and make the number largest among all of the generated number
	 * 
	 * solution: find the first number which is bigger than its following.
	 * 
	 * */
	public static int doSome(int nums){
		String temp = Integer.toString(nums);
		int[] arr = new int[temp.length()];
		System.out.println(temp);
		for(int i = 0; i < arr.length; i++){
			arr[i] = temp.charAt(i) - '0';
		}
		
		int j = 0;
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] > arr[i+1]){
				j = i;
				break;
			}
			j = i+1;
		}
		
		System.out.println("temp:"+ temp);
		temp = temp.substring(0,j) + Integer.toString(arr[j])+temp.substring(j);
		System.out.println("result:"+temp);
		
		return Integer.parseInt(temp);
//		
//		String rs = "";
//		for(int i = 0; i < arr.length; i++){
//			if(i == j){
//				rs += Integer.toString(arr[i]);
//			}
//			rs += Integer.toString(arr[i]);
//			
//		}
//		return Integer.parseInt(rs);
	}

}
