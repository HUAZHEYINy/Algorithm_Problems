package No_5_Longest_Palindrome;

import java.util.*;

public class solution {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abccccdd"));
	}
	
	public static String longestPalindrome (String s) {
		StringBuilder newS = new StringBuilder();
		newS.append("#");
		
		for (int i = 0; i < s.length(); i++) {
			newS.append(s.charAt(i));
			newS.append("#");
		}
		int[] Radius = new int[newS.length()];
		int maxRight = -1;
		int position = -1;
		
		for (int i = 0; i < newS.length(); i++) {
			int tempRadius = 1;
			
			if (i <= maxRight) {
				tempRadius = Math.min(maxRight - i, Radius[2*position - i]);
			}
			
			while (i - tempRadius >= 0 && i + tempRadius < newS.length() 
					&& newS.charAt(i-tempRadius) == newS.charAt(i+tempRadius)) {
				tempRadius ++;
			}
			
			Radius[i] = tempRadius;
			//update the max right 
			if (i + tempRadius - 1 > maxRight) {
				maxRight = i + tempRadius - 1;
				position = i;
			}
				
		}
		int MaxR = 0;
		int pivot = 0;
		for (int i = 0; i < Radius.length; i++) {
			if (Radius[i] > MaxR) {
				MaxR = Radius[i];
				pivot = i;
			}
			
		}
		return newS.substring(pivot - MaxR + 1, pivot + MaxR).replace("#", "");
	}

}
