package No_24_Swap_Nodes_in_Pairs;

public class Solutions {
	public static void main(String[] args){
		int[] nums = {1,2};
		ListNode l = ListNode.intialize(nums);
		swapPairs(l);
	}
	
	public static ListNode swapPairs(ListNode head){
		if(head == null || head.next == null)return head; 
		ListNode dummy = new ListNode(0);
		ListNode l = head.next;
		dummy.next = head;
		while(dummy.next != null && dummy.next.next != null){
			ListNode first = dummy.next;
			ListNode second = dummy.next.next;
			
			first.next = second.next;
			second.next = first;
			dummy.next = second;
			
			dummy = dummy.next.next;
		}
		
		return l;
	}

}
