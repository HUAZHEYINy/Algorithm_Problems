package No_151_Reverse_Words_in_a_String;

public class Solution {
	public static String reverseWords(String s){
		if(s.length() == 0 || s == null){
			return s;
		}
		//omit the head and tail space.
		s = s.trim();
		String result = "";
		int last_space_index = 0;
		while(true){
			last_space_index = s.lastIndexOf(" ");
			if(last_space_index == -1){
				result += s;
				break;
			}
			if(last_space_index + 1 == s.length()){
				s =s.substring(0, last_space_index);
				continue;
			}
			
			result += s.substring(last_space_index+1)+" ";
			s = s.substring(0, last_space_index);
		}
		
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(reverseWords(" "));
	}

}
