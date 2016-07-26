package No_171_Excel_Sheet_Column_Number;

public class Solution {
	public static void main(String[] args){
		System.out.println(titleToNumber("AAA"));
	}
	
	public static int titleToNumber(String s){
		char [] arr = s.toCharArray();
		int sum = 0;
		for(int i = 0;i < arr.length; i++){
			int temp = (int)Math.pow(26.0, (arr.length - i - 1)*1.0 ) * (arr[i] - 'A' + 1);
			sum += temp;
		}
		
		return sum;
	}

}
