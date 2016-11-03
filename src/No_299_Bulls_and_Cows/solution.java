package No_299_Bulls_and_Cows;

import java.util.*;

public class solution {
	public static void main (String[] args) {
		StringBuilder str = new StringBuilder();
		System.out.println(getHint("1100","0011"));
	}
	/**
	 * se: 1123
	 * gu: 0111
	 * 
	 * */
	public static String getHint (String secret, String guess) {
		int bulls = 0;
		int cows = 0;
		int[] count = new int[10];
		
		for (int i = 0; i < guess.length(); i++) {
			
			if (secret.charAt(i) == guess.charAt(i)) {
				bulls++;
			} else {
				//count[secret.charAt] 记录的是在secret中char出现的次数
				int se = count[secret.charAt(i)-'0'];
				if (se < 0) {
					cows ++;
				}
				int gu = count[guess.charAt(i)-'0'];
				 if (gu > 0) {
					 cows++;
				 }
				 
				 count[secret.charAt(i)-'0'] ++;
				 count[guess.charAt(i)-'0']--;
			}
		}
		
		StringBuilder str = new StringBuilder();
		str.append(bulls);
		str.append("A");
		str.append(cows);
		str.append("B");
		return str.toString();
	}

}
