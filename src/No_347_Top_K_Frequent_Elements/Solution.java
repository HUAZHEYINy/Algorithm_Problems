package No_347_Top_K_Frequent_Elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args){
	
//	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//	pq.add(1);
//	pq.add(2);
//	pq.add(3);
//	pq.add(4);
//	pq.add(1);
//	pq.add(2);
//	pq.add(2);
//	System.out.print(pq.poll()+"\n");
//	System.out.print(pq.poll()+"\n");	
//	System.out.print(pq.poll()+"\n");
//	System.out.print(pq.poll()+"\n");
//	System.out.print(pq.poll()+"\n");
//	int [] d = new int[-2];
//	for(int i : d)
//	System.out.println(i);
		int[] nums = {1,1,1,2,2,3};
		topKFrequent(nums,2);
		
	}
	
	
	public static List<Integer> topKFrequent(int[] nums, int k){
		List<Integer> list = new ArrayList<Integer>();

		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i = 0; i < nums.length; i++){
			if(table.containsKey(nums[i])){
				int pre = table.get(nums[i]);
				table.put(nums[i], ++pre);
			}else 
				table.put(nums[i], 1);
		}//counting...
		List<Map.Entry<?,Integer>> l = new ArrayList<Map.Entry<?, Integer>>(table.entrySet());
		Collections.sort(l,new Comparator<Map.Entry<?, Integer>>(){
			public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2){
				if(o1.getValue() > o2.getValue()){
					return -1;
				}
				else return 1;
			}
		});
		int count = 0;
		for(Map.Entry<?, Integer> map : l){
			if(count == k)break;
			list.add((Integer) map.getKey());
			System.out.printf("key: %d   value: %d\n", map.getKey(),map.getValue());
			count ++;
		}
		
		return list;
	}
	
}
