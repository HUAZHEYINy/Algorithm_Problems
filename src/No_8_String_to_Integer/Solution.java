package No_8_String_to_Integer;

public class Solution {
	public static void main(String[] args){
		
	}
	public static int atoi(String str){
		if(str == null || str.length() < 1){
			return 0;
		}
		
		str = str.trim();
		
		boolean positive = true;
		
		int i = 0;
		if(str.charAt(0) == '-'){
			positive = false;
			i++;
		}
		else if(str.charAt(0) == '+'){
			i++;
		}
		
		double result = 0;
		
		while(str.length() > i&& str.charAt(i) >= '0' && str.charAt(i) <= '9'){
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}
		
		if(!positive){
			result = -result;
		}
		
		if(result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return (int)result;
		
		
	}

}
