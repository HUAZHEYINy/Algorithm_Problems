package No_21_Merge_Two_Sorted_Lists;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x){ val = x;}
	
	public static ListNode Sorted_List(int seed){
		ListNode [] list = new ListNode[5];
		for(int i = 0; i < list.length; i++)
		{
			list[i] = new ListNode(seed);
			seed ++;
		}
		for(int i = 0; i < list.length - 1; i++){
			list[i].next = list[i+1];
		}
		return list[0];
	}

}
