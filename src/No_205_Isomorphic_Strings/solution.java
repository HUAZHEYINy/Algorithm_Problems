package No_205_Isomorphic_Strings;

public class solution {
	public static void main (String[] args) {
		System.out.println(isIsomorphic ("abba", "abab"));
	}
	
	public static boolean isIsomorphic (String s, String t) {
		int [] S = new int[s.length()];
		int [] T = new int[t.length()];

		/**
		 * 利用相同的pattern来解决。 建立数组，数组的值是
		 * 	和当前字符在字符串中首次出现的位置。
		 * 
		 * */
		for (int i = 0; i < s.length(); i++) {
			
			int index = -1;
			index = s.indexOf(s.charAt(i));
			S[i] = index;
			index = t.indexOf(t.charAt(i));
			T[i] = index;
			
		}
		
		for (int i = 0; i < t.length(); i++) {
			if (S[i] != T[i]) {
				return false;
			}
		}
		
		return true;
	}

}
