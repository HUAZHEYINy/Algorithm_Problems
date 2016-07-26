package No_165_Compare_Version_Numbers;

public class Solution {
	public static void main(String[] args){
		System.out.println(compareVersion("1","1.0"));
		System.out.println(Integer.valueOf("123"));
	}
	
	public static int compareVersion_1(String version1, String version2){
		String[] arr_1 = version1.split("\\.");
		String[] arr_2 = version2.split("\\.");
		
		for(int i = 0, j = 0; i < arr_1.length || j < arr_2.length; i++, j++){
			int a = i < arr_1.length ? Integer.valueOf(arr_1[i]) : 0;
			int b = j < arr_2.length ? Integer.valueOf(arr_2[j]) : 0;
			if(a > b)return 1;
			else if (a < b) return -1;
		}
		return 0;
	}
	
	
	
	//wrong...
	public static int compareVersion(String version1, String version2){
		double result1 = 0;
		double result2 = 0;
		if(version1.contains(".") && version2.contains(".")){
			result1 = calWithDot(version1);
			result2 = calWithDot(version2);
		}else if(version1.contains(".") && !version2.contains(".")){
			//version1 is not integer.
			result1 = calWithDot(version1);
			result2 = Integer.parseInt(version2);
		}else if(!version1.contains(".") && version2.contains(".")){
			result2 = calWithDot(version2);
			result1 = Integer.parseInt(version1);
		}else{
			result1 = Integer.parseInt(version1);
			result2 = Integer.parseInt(version2);
		}
		
		
		
		if(result1 > result2){
			return 1;
		}else if(result1 < result2){
			return -1;
		}else
			return 0;
		
		
	}
	
	public static double calWithDot(String version1){
		String[] arr_1 = version1.split("\\.");
		char[] arr_1_1 = arr_1[0].toCharArray();
		char[] arr_1_2 = arr_1[1].toCharArray();
		
		int reuslt_1_1 = 0;
		for(int i = 0;  i < arr_1_1.length; i++){
			reuslt_1_1 = reuslt_1_1 + (int)Math.pow(10, arr_1_1.length - 1 - i)*arr_1_1[i];
		}
		
		int result_1_2 = 0;
		for(int i = 0;  i < arr_1_2.length; i++){
			result_1_2 = result_1_2 + (int)Math.pow(10, arr_1_2.length - 1 - i)*arr_1_2[i];
		}
		
		return reuslt_1_1 + result_1_2*0.1;
	}

}
