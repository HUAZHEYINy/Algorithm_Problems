package Compress_String;

public class Solution {
	public static void main(String[] args){
		
	}
	public static String cstr(String a){
		if(a.length() < 2)return a;
		if(a.length() == 2){
			if(a.charAt(0) == a.charAt(1))return a.charAt(0) + "2";
		}else return a;
		
		for(int i = 0; i < a.length(); i++){
			int next = i + 1;
			while(next < a.length() && a.charAt(next) ==a.charAt(i)){
				next ++;
			}
			if(next - 1 != 1){
				a = a.substring(0,i+1) +(next-i) + a.substring(next);
				i++;
			}
		}
		return a;
		
	}

}
