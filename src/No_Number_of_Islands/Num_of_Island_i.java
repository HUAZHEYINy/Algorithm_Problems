package No_Number_of_Islands;

public class Num_of_Island_i {
	public static void main(String[] args){
		char[][] grid = {{'1','1','1','1','0'},{'1','0','1','1','0'},{'1','0','0','0','0'},{'0','0','0','0','0'}};
		
		char[][] grid2 = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
		System.out.println(numIsland(grid2));
	}
	
	public static int numIsland(char[][] grid){
		int numIsland = 0;
		
		for(int i = 0; i< grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if( grid[i][j] != '1'){ continue;}
				
				numIsland++;
				dfs(grid,i,j);
			}
		}
		return numIsland;
	}
	
	public static void dfs(char[][] grid, int i, int j){
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
		
		if(grid[i][j] == '1'){
			grid[i][j] = '2';
			dfs(grid,i-1,j);
			dfs(grid,i+1,j);
			dfs(grid,i,j-1);
			dfs(grid,i,j+1);
		}
		
	}
		

}
