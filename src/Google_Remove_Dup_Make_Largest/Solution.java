package Google_Remove_Dup_Make_Largest;

public class Solution {
	public static void main(String[] args){
	System.out.println(removeDup(223336226));	
	}
	
	public static int removeDup(int nums){
		String temp = Integer.toString(nums);
		int[] arr = new int[temp.length()];
		
		//initialize int array
		for(int i = 0; i < arr.length; i++){
			arr[i] = temp.charAt(i) - '0';
		}
		
		int index = 0;
		boolean isTwins = false;
		for(int i = 0; i < arr.length; i++){
			//the number behind is greater than twins.
			//remove one from twins
			if(isTwins && i + 1 < arr.length && arr[i] < arr[i+1]){
				index = i;
				break;
			}
			//assign twins to false
			isTwins = false;
			//find twins
			//assign index to current twins.
			if(i + 1 < arr.length && arr[i] == arr[i+1]){
				isTwins = true;
				index = i;
			}
		}
		
		temp = temp.substring(0,index)+temp.substring(index+1);
		return Integer.parseInt(temp);
	}

}
