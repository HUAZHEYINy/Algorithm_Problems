package No_347_Top_K_Frequent_Elements;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args){
	
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	pq.add(1);
	pq.add(2);
	pq.add(3);
	pq.add(4);
	pq.add(1);
	pq.add(2);
	pq.add(2);
	System.out.print(pq.poll()+"\n");
	System.out.print(pq.poll()+"\n");	
	System.out.print(pq.poll()+"\n");
	System.out.print(pq.poll()+"\n");
	System.out.print(pq.poll()+"\n");
	int [] d = new int[-2];
	for(int i : d)
	System.out.println(i);
	
		
	}
	
	
	
	public List<Integer> topKFrequent(int[] nums, int k){
		List<Integer> list = new ArrayList<Integer>();

		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i = 0; i < nums.length; i++){
			if(table.containsKey(nums[i])){
				int pre = table.get(nums[i]);
				table.put(nums[i], pre++);
			}
		}
		return null;
	}
}
