package No_24_Swap_Nodes_in_Pairs;


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
}
