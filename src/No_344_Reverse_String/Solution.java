package No_344_Reverse_String;

public class Solution {
	public static void main(String[] args){
		System.out.println(reverserString3("lkjhfdsakjhfdsakjhfdskjh"));
	}
	
	public static String reverserString1(String s){
		StringBuilder s_new = new StringBuilder(); 
		
		for(int i = s.toCharArray().length - 1; i >= 0; i--)
			s_new.append(s.toCharArray()[i]);
		
		return s_new.toString();
		
	}
	
	public static String reverserString2(String s){
		String s_new = ""; 
		char [] ar = s.toCharArray();
		for(int i = s.toCharArray().length - 1; i >= 0; i--)
			s_new+=ar[i];
		
		return s_new;
		
	}
	
	/**
	 * switch the first and last till they met in the middle.
	 * 
	 * */
	public static String reverserString3(String s){
		if(s == null) return null;
		if(s.equals("")) return s;
		
		char [] arrChar = s.toCharArray();
		for(int i = 0, j = arrChar.length - 1; i <= j; i++, j--){
			char temp = arrChar[i];
			arrChar[i] = arrChar[j];
			arrChar[j] = temp;
		}
		
		return new String(arrChar);
		
	}

}
