package Utility;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	public static void main(String[] args){
	//System.out.println(LongestPalindrome("safasdffffffd"));	
	//ALNode.printALNode(deepCopy(ALNode.initialize()));
	char S = 0x20;
	System.out.println(S+1);
	}
	
	public static String LongestPalindrome (String str) {
		if (str == null || str.length() < 2) { return str; }
		
		int length = str.length();
		int left = 0;
		int right = 0;
		
		while (length >= 0) {
			for (int i = 0; i + length - 1 < str.length(); i++) {
				left = i;
				right = i + length - 1;
				while (left < right) {
					if (str.charAt(left) != str.charAt(right)) {
						break;
					}
					left ++;
					right --;
				}
				
				if (left >= right) {
					return str.substring(i, i + length );
				}
			}
			length --;
		}
		
		return "";
	}
	public static ALNode deepCopy (ALNode head) {
		ALNode oldHead = head;
		ALNode newHead = new ALNode (head.value);
		ALNode result = newHead;
		
		HashMap<ALNode,ALNode> map = new HashMap<ALNode,ALNode> ( );
		map.put(oldHead, newHead);

		oldHead = oldHead.next;
		//deep copy node without arbitrary node
		while (oldHead != null) {
			ALNode temp = new ALNode (oldHead.value);
			newHead.next = temp;
			newHead = newHead.next;
			map.put(oldHead, temp);
			oldHead = oldHead.next;
		 }

		for (ALNode temp : map.keySet() ) {
			//the old linked list node has an arbitrary node 
			if (temp.arbitrary != null) {
				//find the corresponding new node
				map.get(temp).arbitrary = map.get(temp.arbitrary);
				//new node arbitrary 	
			 }
		 }
		
		return result;
	 }
}
