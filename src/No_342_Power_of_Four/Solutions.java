package No_342_Power_of_Four;

public class Solutions {
	public static void main(String[] args){
		System.out.println(Math.log10(0));
	}
	
	public static boolean isPowerOfFour(int num){
		//based on the principle 
		// log(b) a = log(10)a/ log(10)b;
		if(num == 0)return false;
		int power = (int)(Math.log10(num)/Math.log10(4));
		if(num == (int)Math.pow(4, power)){
			return true;
		}
		else return false;
	}

}
