package No_412_Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

public class solution {
	
	public static void main(String[] args) {
		for(String i : fizz_buzz(15)) {
			System.out.println(i);
		}
	}
	public static List<String> fizz_buzz(int n) {
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 1; i <= n; i++) {
			StringBuilder str = new StringBuilder();
			if(i % 3 == 0) {
				str.append("Fizz");
				if(i % 5 == 0) {
					str.append("Buzz");
				}
			}else if(i % 5 == 0) {
				str.append("Buzz");
			}else{
				str.append(i);
			}
			list.add(str.toString());
		}
		
		return list;
		
	}
}
