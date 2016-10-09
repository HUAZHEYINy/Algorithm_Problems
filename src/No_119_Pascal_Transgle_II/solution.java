package No_119_Pascal_Transgle_II;

import java.util.*;

public class solution {
	public static void main (String[] args) {
		
		for (int temp : getRow(3)) {
			System.out.print(temp + "  ");
		}
	}

	/**
	 * 			1
	 * 		   1  1
	 *        1  2  1
	 *       1  3  3  1
	 *      1 4  6  4  1 
	 *      
	 *      3 [ 1 3  3 1]
	 * */
	public static List<Integer> getRow (int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[rowIndex + 1];
		int index = 0;
		
		while (index <= rowIndex) {
			if (index == 0) {
				arr[index] = 1;
			} else {
				int diff = 0;
				for (int i = 0; i <= index; i++) {
					if (i == 0 || i == index) {
						arr[i] = 1;
						continue;
					}
					/**
					 * 当前点的值等于
					 * 		当前点的值 ＋ 当前点的前一个点的值 － 当前点的前一个点的值与它的更新前的值的差
					 * 
					 * 
					 * */
					int newValue = arr[i-1] + arr[i] - diff;
					diff = newValue - arr[i];
					arr[i] = newValue;
				}
			}
			index ++;
		}
		
		for (int temp : arr) {
			list.add(temp);
		}
		
		return list;
	}

}
