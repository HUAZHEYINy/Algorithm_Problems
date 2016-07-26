package No_350_Intersection_of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String[] args){
		int[] nums1 = {};
		int[] nums2 = {};
		intersect(nums1,nums2);
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		if(nums1.length == 0 || nums2.length == 0)return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> list = new ArrayList<Integer>();
        
        int i = 0, j = 0;
        do{
        	if(nums1[i] > nums2[j]){
        		//nums1 has bigger num
        		j++;
        	}
        	
        	else if(nums1[i] < nums2[j]){
        		//nums1 has sammler num
        		i++;
        	}
        	else{
        		list.add(nums1[i]);
        		i++;
        		j++;
        	}
        	
        }while(i < nums1.length && j < nums2.length);
        
        int[] resul = new int[list.size()];
    	for(int k = 0; k < resul.length; k++){
    		resul[k] = list.get(k);
    	}
    	return resul;
    }

}
