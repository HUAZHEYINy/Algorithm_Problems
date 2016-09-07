package No_357_Count_Numbers_with_Unique_Digits;

public class Solutions {
	/**
	 * 找出各个位上都是不一样的数的个数
	 * 
	 * */
	public static void main(String[] args){
		System.out.println(countNumbersWithUniqueDigits(3));
	}
	
	public static int countNumbersWithUniqueDigits(int n){
		if(n == 0) return 1;
		int count = 9, total = 10;
		
		for(int i = 2; i <= n; i++){
			count *= (11-i);
			total += count;
		}
		
		return total;
		
		
	}


}
