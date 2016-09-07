package No_Number_of_Islands;

import java.util.ArrayList;

public class Num_of_Island_ii {
	public static void main(String[] args){
		char[][] grid = {{'1','1','1','1','0'},{'1','0','1','1','0'},{'1','0','0','0','0'},{'0','0','0','0','0'}};
		
		int[][] dir = {{0,0},{0,1},{1,2},{2,1}};
		for(int num:solution(3,3,dir))
		System.out.println("num of island: "+ num);
		
		
	}
	
	public static ArrayList<Integer> solution(int m, int n, int[][] dir){
		char[][] grid = new char[m][n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//initialize the grid
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n ; j++){
				grid[i][j] = '0';
			}

		for(int i = 0 ; i < dir.length; i++){
			grid[dir[i][0]][dir[i][1]] = '1';
			
			list.add(numOfIsland(grid));
		}
		
		return list;
	}
	
	
	
	public static int numOfIsland(char[][] grid){
		
		//recover the array
		for(int i = 0; i < grid.length; i++)
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] == '2') grid[i][j] = '1'; 
			}
		
		int numOfIsland = 0;
		
		for(int i = 0; i < grid.length; i++)
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] != '1') continue;
				
				numOfIsland ++;
				dfs(grid,i,j);
			}
		
		return numOfIsland;
	}
	
	public static void dfs(char[][] grid, int i, int j){
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
		
		if(grid[i][j] == '1'){
			grid[i][j] = '2';
			dfs(grid,i+1,j);
			dfs(grid,i-1,j);
			dfs(grid,i,j+1);
			dfs(grid,i,j-1);
		}
	}

}
