package No_383_Ransom_Note;

public class Solutions {
	public static void main(String[] args){
		System.out.println(canConstruct("ed","eaabd"));
	}
	
	public static boolean canConstruct(String ransomNote, String magazine){
		int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
	}

}
