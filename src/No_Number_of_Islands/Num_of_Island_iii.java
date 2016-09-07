package No_Number_of_Islands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num_of_Island_iii {
	public static void main(String[] args){
		int[][] pos = {{0,0},{0,1},{2,1},{2,2},{1,1}};
		for(int num:numberOfIsland2(3,3,pos)){
			System.out.println(num);
		}
	}
	
	public static ArrayList<Integer> numberOfIsland2(int m, int n, int [][] positions){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int [][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};	//for each point the four positions
		int[] id = new int[m*n];	//to store index
		Arrays.fill(id, -1);		//fill the water as -1
		
		int count = 0;
		for(int i = 0; i < positions.length; i++){
			count ++;
			int index = positions[i][0] * n + positions[i][1];
			id[index] = index;
			
			for(int j = 0; j < dirs.length; j++){
				int x = positions[i][0] + dirs[j][0];
				int y = positions[i][1] + dirs[j][1];
				//the adjacent position
				if(x >= 0 && x < m && y >= 0 && y < n && id[x*n + y] != -1){
					int root = id[x*n+y];
					if(root != index){
						id[root] = index;
						count --;
					}
				}
			}
			list.add(count);
		}
		return list;
	}
}
