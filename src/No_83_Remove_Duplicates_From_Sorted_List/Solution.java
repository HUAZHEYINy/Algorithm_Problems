package No_83_Remove_Duplicates_From_Sorted_List;

import Utility.ListNode;

public class Solution {
	public static void main(String[] args){
		int[] nums = {1,1,2,3,3};
		ListNode head = ListNode.intialize(nums);
		System.out.println(head.val);
		ListNode.printList(deleteDuplicates(head));
	}
	
	public static ListNode deleteDuplicates(ListNode head){
		if(head == null)return head;
		
		ListNode temp = head;
		while(temp.next != null){
			if(temp.val == temp.next.val){
				if(temp.next.next == null){
					temp.next = null;
					break;
				}
				temp.next = temp.next.next;
			}else{
				temp = temp.next;
			}
		}
		
		return head;
	}

}
