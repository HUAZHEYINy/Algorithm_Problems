package No_392_Is_Subsequence;

import java.util.*;

public class solution {
	public static void main (String[] args) {
		
	}
	
	public static boolean isSubsequence(String s, String t) {
		  Queue<Character> queue = new LinkedList<Character>();
		  
		  for (char temp : s.toCharArray()) {
			  //put the s string into queue
			  queue.add(temp);
		  }
		  
		  for (int i = 0; i < t.length(); i++) {
			  if (queue.isEmpty()) { return true; }
			  if (t.charAt(i) == queue.peek()) {
				  //poll the char in order.
				  queue.poll();
			  }
		  }
		  
		  if (queue.isEmpty()) {
			  return true;
		  } else {
			  return false;
		  }
	}
}
