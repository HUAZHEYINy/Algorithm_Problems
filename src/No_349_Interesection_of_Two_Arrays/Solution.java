package No_349_Interesection_of_Two_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public static void main(String[] args){
		int[] arr1 = {1,2,2,3,1};
		int[] arr2 = {2,2,3};
		System.out.println(intersection(arr1,arr2)[1]);
	}
	
	public static int[] intersection(int[] num1, int[] num2){
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int num:num1){
			set1.add(num);
		}
		for(int num:num2){
			set2.add(num);
		}
		for(int num:set1){
			if(set2.contains(num)){
				list.add(num);
			}
		}
		int[] result = new int[list.size()];
		int i = 0;
		for(int num:list){
			result[i++] = num;
		}
		return result;
	}
}
