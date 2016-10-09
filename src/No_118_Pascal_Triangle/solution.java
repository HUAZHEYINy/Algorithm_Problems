package No_118_Pascal_Triangle;

import java.util.*;

public class solution {
	public static void main(String[] args) {
		List<List<Integer>> temp = new ArrayList<List<Integer>> ();
		temp = generate(9);
		
		for (int i = 0; i < temp.size(); i++) {
			for (int j = 0; j < temp.get(i).size(); j++) {
				System.out.print(temp.get(i).get(j) + " , ");
			}
			System.out.println("\n");
		}
	}
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> parentList = new ArrayList<List<Integer>> ();//parent list
		
		for (int i = 0; i <= numRows; i++) {
			List<Integer> childList = new ArrayList<Integer> (); //each row must new an arraylist
			
			if (i == 0) {	//first row
				childList.add(1);
			} else {
				for (int j = 0; j <= i; j++) {	//for each row
					if (j == 0 || j == i) {	//for the first and last element from each row
						childList.add(1);
					} else {	//except the first and last element
						//the value of current element should be the value of 
						//index - 1 plus the value of index from last arraylist
						childList.add(parentList.get(i-1).get(j-1) + 
								parentList.get(i-1).get(j));
					}
				}
			}
			
			parentList.add(childList);
		}
		
		return parentList;
	}
}
