package No_13_Roman_to_Integer;

import java.util.HashMap;

public class Solutions {
	public static void main(String[] args){
		System.out.println(romanToInt("VII"));
	}
	
	public static int romanToInt(String s){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('I',1);
		map.put('V', 5);
		map.put('X',10);
		map.put('L',50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		//last digits we have to plus.
		int value = map.get(s.toCharArray()[s.length()-1]);
		for(int i = 0; i < s.length()-1; i++){
			//VII
			if(map.get(s.toCharArray()[i]) >= map.get(s.toCharArray()[i+1])){
				value += map.get(s.toCharArray()[i]);
			}else{
				value -= map.get(s.toCharArray()[i]);
			}
		}
		return value;
	}

}
