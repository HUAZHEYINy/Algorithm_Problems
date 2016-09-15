package No_66_Plus_One;

public class Solutions {
	public static void main(String[] args){
		int [] nums = {1,2,3,4,5,9};
		System.out.println();
	}
	
	public static int[] plusOne(int[] digits){
		for(int i = digits.length - 1; i >= 0; i--){
			if(digits[i] == 9){
				//if current digit is 9, we have to assign current to 0
				//and add one more to its next digit.
				digits[i] = 0;
			}else{
				digits[i] ++;
				break;
			}
		}
		
		if(digits[0] == 0){
			//the most significant digit is 0
			//means the number is 999....
			int [] res = new int[digits.length + 1];
			res[0] = 1;
			return res;
		}
		return digits;
	}

}
