package No_20_Valid_Parentheses;
import java.util.Stack;

public class isValid {
	public static boolean isValid(String s) {
		if (s == null || s.length() <= 0) {
			return true;
		}
		
		Stack<Character> stack = new Stack<Character> ();
		for (char item : s.toCharArray()) {
			//if stack is empty
			if (stack.isEmpty()) {
				stack.push(item);
			} else {
				//the char from the top of the stack
				//equals to the current one
				if ((stack.peek() - item) == -1 || 
						(stack.peek() - item) == -2) {
					stack.pop();
				} else {
					stack.push(item);
				}
			}
		}
		return stack.isEmpty() ? true : false;
	}
	
	public static void main (String[] args) {
		String str = "{[(()]}";
		System.out.println(isValid(str));
	}
}
