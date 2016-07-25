package No_258_Add_Digits;

public class Solution {
	public static void main(String[] args){
		System.out.print(addDigits(65536));
	}
	
	
	public static int addDigits(int num){
		/**
		 * digital root 
		 * can be used to calculate modular arithmetic
		 * also can be used to checksum: the digital root of the sum of the given numbers will equal the digital root of the sum of the digital root of the given numbers
		 * è¿˜å?¯ä»¥ç”¨æ?¥åˆ¤æ–­æ•´é™¤
		 * */
		return num - 9 * ((num -1)/9);
	}

}
