package No_167_Two_Sum_II;

public class Solution {
	public static void main(String[] args){
		int[] numbers = {3, 24, 50, 79, 88, 150, 345};
		int[] numbers2 = {2,3,4};
		int[] numbers3 = {0,0,3,4};
		int[] numbers4 = {1,2,3,4,4,9,56,90};
		int[] result = new int[2];
		result = twoSum(numbers3,0);
		for(int index = 0; index < 2; index++){
			System.out.println(numbers2[result[index]-1]);
		}
		
	}
	
	public static int[] twoSum(int[] numbers, int target){
		int[] result = new int[2];
		int index = 0;
		for(int i = 0 ; i < numbers.length-1; i++){
			if(numbers[i] <= target){
				result[index] = i+1;
				int temp = find(numbers, target - numbers[i], i+1, numbers.length-1);
				//the number is not one of the answer
				if(temp == -1){
					index = 0;
					continue;
				}else{
					result[index+1] = temp+1;
					break;
				}
			}else
				break;
		}
		return result;
	}
	
	public static int find(int[] numbers, int target, int low, int high){
		int result = -1;
		if(low > high)return result;
		int mid = (low + high) / 2;
		//the target is under the right side of middle.
		if(numbers[mid] > target){
			result = find(numbers, target, low, mid-1);
		}else if(numbers[mid] < target){
			result = find(numbers, target, mid+1, high);
		}else{
			return mid;
		}
		return result;
			
	}

}
