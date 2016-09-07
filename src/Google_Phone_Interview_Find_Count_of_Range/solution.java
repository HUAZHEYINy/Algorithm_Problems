package Google_Phone_Interview_Find_Count_of_Range;

import java.util.ArrayList;

public class solution {
	public static void main(String[] args){
		int[][] p = {{1,3},{2,4}};
		for(int l:find_counts(p,5)){
			System.out.println(l);
		}
		
	}
	/**
	 * for example: 
	 * 	1 - 3 range, the count of 1,2,3 is the same, so we can only just record the count of 1.
	 * 				and also we should set 4 which is one more step than 3 to -1, if for the further number,
	 * 				it is greater than 3, it is out of range 1 - 3. so we should deduct 1 count from it.
	 * 
	 * */
	
	public static ArrayList<Integer> find_counts(int [][] ranges, int k){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int max = 0;
		int [] arr;
		for(int[] range:ranges){
			max = Math.max(max, range[1]);
		}
		
		arr = new int[max+2];
		for(int[] range:ranges){
			arr[range[0]] ++;
			arr[range[1] + 1] --;
		}
		for(int i = 0 ; i < k; i++){
			int curr = 0;
			for(int j = 0 ; j <= i; j++)
			{
				curr += arr[j];
			}
			list.add(curr);
		}
		return list;
		
		
		
	}

}
