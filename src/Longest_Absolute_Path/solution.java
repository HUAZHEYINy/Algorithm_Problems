package Longest_Absolute_Path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class solution {
	
	public static void main(String[] args){
		String str = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext\ndir2\n\tsubdir2\n\tfile22.ext";
		System.out.println("Longest Length:"+findLongestPath(str));
	}
	public static int findLongestPath(String input){
		
		ArrayList<String> list = new ArrayList<String>();
        Map<Integer, String> levels = new HashMap<>();
        int firstIndex = 0, lastIndex = 1, strLength = input.length(), maxLength, levelCount = 0, currentLevelCount;

        String maxPath, levelStr, filePath;

        while (input.charAt(lastIndex) != '\n' && lastIndex < strLength){
            lastIndex++;
        }

        levels.put(levelCount, input.substring(firstIndex, lastIndex));

        maxLength = 0;
        maxPath = "";

        while(lastIndex < strLength){
            lastIndex++;

            currentLevelCount = 0;

            while (input.charAt(lastIndex) == '\t'){
                currentLevelCount++;
                lastIndex++;
            }

            firstIndex = lastIndex;

            while (lastIndex < strLength && input.charAt(lastIndex) != '\n' ){
                lastIndex++;
            }

            levelStr = input.substring(firstIndex, lastIndex);
            
            if(isFileName(levelStr)){
                filePath = "";

                for(int i = 0; i < currentLevelCount; i++)
                    filePath += levels.get(i) + "/";

                filePath += levelStr;

                list.add(filePath);
                if(filePath.length() > maxLength){
                    maxLength = filePath.length();
                    maxPath = filePath;
                }
            }
            else {
                levelCount = currentLevelCount;
                levels.put(levelCount, levelStr);
            }
        }
       
        for(String str:list){
        	System.out.println(str);
        }
        
        System.out.println("The longest path: "+maxPath);
        return maxPath.length();
    }

    public static boolean isFileName(String input){

        for(int i = 0; i < input.length(); i++)
            if(input.charAt(i) == '.') return true;

        return false;
    }
}
