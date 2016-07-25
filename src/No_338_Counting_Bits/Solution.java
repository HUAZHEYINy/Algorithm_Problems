package No_338_Counting_Bits;

public class Solution {
	public static void main(String[] args){
		
		int [] test;
		test = countBits(5);
		for(int i : test)
			System.out.println(i);
	}
	
	public static int[] countBits(int num){
		int[] result = new int[num+1];
		
		for(int i = 0; i <= num; i++){
			if(i == 0){
				result[i] = 0;
				continue;
			}
			int temp = i;
			while(temp > 0){
				if(temp % 2 != 0){
					result[i] += 1;
					temp /= 2;
				}
				else temp /= 2;
			}
		}
		return result;
	}

}
