package Algorithm_Sorting;

import java.util.Arrays;

public class Algorithm_Quick_Sort {
	
	public static void main(String[] args){
	int[] x = { 9, 2, 4, 7, 3, 7, 10};
	
	System.out.println(Arrays.toString(x));
	
	quickSort(x,0,x.length-1);
	System.out.println(Arrays.toString(x));
	}
		
	public static void quickSort(int[] arr, int low, int high){
		if(arr == null || arr.length == 0)
			return ;
		if(low >= high)
			return;
		
		//pick the pivot 
		int pivot = arr[low + (high - low)/2];
		int i = low;
		int j = high;
		
		while(i <= j){
			while(arr[i] < pivot)
			{
				i++;
			}
			while(arr[j] > pivot)
			{
				j--;
			}
			
			if(i <= j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		//recursively
		if(low < j)
			quickSort(arr, low, j);
		if(i < high)
			quickSort(arr, i, high);
		
		
	}
}
