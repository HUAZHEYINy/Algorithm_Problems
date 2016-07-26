package No_371_Sum_of_Two_Integers;

public class Solution {
	public static void main(String[] args){
/**
 * 
 * 			& and 			| or		^ xor
 * T T		 T				 T			  F
 * T F		 F				 T			  T
 * F T		 F				 T			  T
 * F F		 F				 F			  F
 * */
	
	}
	
	public int getSum(int a, int b){
			if(a == 0)return b;
			if(b == 0)return a;
			while(b != 0){
				int carry = a & b;
				a = a ^ b;
				b = carry << 1;
			}
			return a;
	}
}
