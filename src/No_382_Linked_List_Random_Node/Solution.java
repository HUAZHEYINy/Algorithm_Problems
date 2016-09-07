package No_382_Linked_List_Random_Node;

import java.util.ArrayList;
import java.util.Random;

import Utility.ListNode;

public class Solution {
	
	ListNode head;
	public Solution(ListNode head){
		this.head = head;
	}
	
	public int getRandom(){
		ListNode temp = this.head;
		int result;
		Random random = new Random();
		result = temp.val;
		temp = temp.next;
		int count = 1;
		while(temp != null){
			count ++;
			if(random.nextInt(count)==0){
				result = temp.val;
			}
			temp = temp.next;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5};
		
		ListNode.printList(ListNode.intialize(nums));
		Solution s = new Solution(ListNode.intialize(nums));
		System.out.println(s.getRandom());
		s.getRandom();
		s.getRandom();
	}

}
