
public class No_345_Reverse_Vowels_of_a_String {
	public static void main(String[] args){
		System.out.println(reverseVowels("leetcode"));
	}
	
	public static String reverseVowels(String s){
		int start = 0, end = s.length() - 1;
		char[] arr = s.toCharArray();
		
		while(start < end){
			//if they both are vowel letter
			if(isVowels(arr[start]) && isVowels(arr[end])){
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start ++;
				end--;
			}
			if(!isVowels(arr[start])) start++;
			if(!isVowels(arr[end])) end--;
		}
		return new String(arr);
	}
	
	public static boolean isVowels(char c){
		c = Character.toLowerCase(c);
		if(c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u'){
			return true;
		}else
			return false;
	}
}
