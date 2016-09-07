package No_389_Find_the_Difference;

public class Solutions {
	public static void main(String[] args){
		System.out.println(findTheDifference("abcde","abcdef"));
	}
	
	public static char findTheDifference(String s, String t){
		char [] s_array = s.toCharArray();
		char [] t_array = t.toCharArray();
		int sum_s = 0, sum_t = 0;
		for(char c : s_array){
			sum_s += (int)c;
		}
		for(char c : t_array){
			sum_t += (int)c;
		}
		
		int d = sum_t - sum_s;
		return (char)d;
	}

}
