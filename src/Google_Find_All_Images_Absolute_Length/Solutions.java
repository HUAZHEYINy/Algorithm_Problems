package Google_Find_All_Images_Absolute_Length;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solutions {
	
	/**
	 * find all of the absolute path which contain image files(without looking in their subdirectories)
	 * 
	 * */
	public static void main(String[] args){
		String str = "dir\n\tsubdir1\n\t\tfile1.gif\n\t\tsubsubdir1\n\t\t\tfile3.png\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext\nafter.png\ndir2\n\tsubdir2\n\tfile22.jpeg";
		String str1 = "dir1\n\tdir11\n\tdir12\n\t\tpicture.jpeg\n\t\tdir121\n\t\tfile1.txt\ndir2\n\tfile2.gif";
		System.out.println("\n\nresult"+findLongestPath(str));
	}
	
public static String findLongestPath(String input){
		
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

            if(levelStr.contains(".jpeg") || levelStr.contains(".png")|| levelStr.contains(".gif")){
                filePath = "";

                for(int i = 0; i < currentLevelCount; i++){
                	filePath += levels.get(i) + "/";

                }
                    
                //filePath += levelStr;
                //dont count empty...
                if(!(filePath == "")){
                list.add(filePath);
                }
                for(String str:list){
                	if(filePath.contains(str)){
                		break;
                	}
                }
                
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
        System.out.println("Above is previous...");
//        //find the shortest path
        for(int i = list.size() -1; i >= 1; i--){
    		if(list.get(i).contains(list.get(i-1))){
    			list.remove(i);
    			}
    		}
        System.out.println("after\n");
        int max = 0;
        for(String str:list){
        	System.out.println(str);
        	max += str.length();
        }
        
        System.out.println(max);
        return maxPath;
    }

 

}
