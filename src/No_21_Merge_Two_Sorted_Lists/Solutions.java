package No_21_Merge_Two_Sorted_Lists;

public class Solutions {
	public static void main(String[] args){
		ListNode obj_1 = ListNode.Sorted_List(1);
		ListNode obj_2 =ListNode.Sorted_List(4);
		ListNode obj = mergeTwoLists(obj_1,obj_2);
		while(obj != null){
			System.out.println(obj.val);
			obj = obj.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if( l1 == null) return l2;
		if( l2 == null) return l1;
		
		ListNode head = new ListNode(0);
		ListNode temp = head;
		while( l1 != null && l2 != null){
			if( l1.val < l2.val){
				temp.next = new ListNode(l1.val);
				l1 = l1.next;
				temp = temp.next;
			}else{
				temp.next = new ListNode(l2.val);
				l2 = l2.next;
				temp = temp.next;
			}
		}
		if(l1 == null){
			temp.next = l2;
		}else{
			temp.next = l1;
		}
		
		return head.next;
		
	}
	
}
