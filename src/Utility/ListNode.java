package Utility;

public class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x){val = x;}
	
	public static ListNode intialize(int[] nums){
		ListNode[] l = new ListNode[nums.length];
		for(int i = 0; i < nums.length; i++)
		{
			l[i] = new ListNode(nums[i]);
		}
		
		for(int i = 0; i < nums.length - 1; i++){
			l[i].next = l[i+1];
		}
		
		return l[0];
	}
	
	public static void printList(ListNode head){
		while(head.next != null){
			System.out.println(head.val+"   ");
			head = head.next;
		}
		System.out.println(head.val);
	}

}
