package No_138_Copy_List_With_Random_Pointer;

import java.util.HashMap;

public class solution {
	public static void main (String[] args) {
		
	}
	
	public static RandomListNode copyRandomList (RandomListNode head) {
		if (head == null) { return head; }
		RandomListNode newHead = new RandomListNode (head.label);
		RandomListNode result = newHead;
		HashMap<RandomListNode, RandomListNode> map = new HashMap <RandomListNode, RandomListNode> ();
		
		map.put(head, newHead);
		head = head.next;
		
		//constructing hashmap
		while (head != null) {
			RandomListNode temp = new RandomListNode (head.label);
			newHead.next = temp;
			newHead = newHead.next;
			
			map.put(head, newHead);
			
			head = head.next;
		}
		//contruct arbitrary node
		for (RandomListNode temp : map.keySet()) {
			if (temp.random != null) {
				map.get(temp).random = map.get(temp.random);
			}
		}
		return result;
		
	}

}
