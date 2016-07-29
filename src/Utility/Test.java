package Utility;

import java.util.ArrayList;
import java.util.Hashtable;

public class Test {
	public static void main(String[] args){
		String str = "12.12";
		String [] arr;
		arr = str.split("\\.");


		
		ArrayList<String> list = new ArrayList<String>();
		list.add("dir/subdir1");
		list.add("dir/subdir1/subsubdir1");
		list.add("dir2/file22.jpeg");
		for(String srt:list){
			System.out.println(srt);
		}
		for(int i = list.size() -1; i >= 1; i--){
		if(list.get(i).contains(list.get(i--))){
			list.remove(i);
			System.out.println("cotain");
			}
		}
		
		for(String srt:list){
			System.out.println(srt);
		}
		
		if("dir2/".contains("dir1/dir12/")){
			System.out.println("true");
		}
	}

}
