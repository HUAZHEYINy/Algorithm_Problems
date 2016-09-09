package No_387_First_Unique_Character_in_a_String;

import java.util.LinkedHashMap;

public class Solutions {
	public static void main(String[] args){
		System.out.println(firstUniqueChar("loveleetcode"));
	}
	
	public static int firstUniqueChar(String s){
		int[] l = new int[26];
		for(char c:s.toCharArray()){
			l[c-'a'] ++;
		}
		int index = 0;
		for(char c:s.toCharArray()){
			if(l[c-'a'] == 1){
				return index; 
			}
			index ++;
		}
		return -1;
	}

}
