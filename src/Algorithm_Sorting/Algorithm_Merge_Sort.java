package Algorithm_Sorting;

import java.util.Arrays;

public class Algorithm_Merge_Sort {
	public static void main(String[] args){
		int[] a = {26, 5, 98, 108, 28, 99, 100, 56, 34, 1 };
		MergeSort(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void MergeSort(int[] a){
		Sort(a, 0, a.length - 1);
	}
	
	public static void Sort(int[] a, int left, int right){
		if(left >= right)
			return;
		int mid = (left + right)/2;
		
		Sort(a, left, mid);
		Sort(a, mid + 1, right);
		Merge(a, left, mid, right);
	}
	
	public static void Merge(int[] a, int left, int mid, int right){
		
		int[] temp = new int[a.length];
		int r1 = mid + 1;
		int tIndex = left;
		int cIndex = left;
		
		while(left <= mid && r1 <= right){
			if(a[left] < a[r1])
				temp[tIndex++] = a[left++];
			else
				temp[tIndex++] = a[r1++];
		}
		
		//将左边的剩余的归并
		while(left <= mid)
		{
			temp[tIndex++] = a[left++];
		}
		
		//将右边的剩余的归并
		while(r1 <= right)
		{
			temp[tIndex++] = a[r1++];
		}
		
		while(cIndex<=right)
		{
			a[cIndex] = temp[cIndex];
			cIndex++;
		}
	
	}

}
