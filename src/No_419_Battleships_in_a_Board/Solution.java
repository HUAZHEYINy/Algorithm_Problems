package No_419_Battleships_in_a_Board;

public class Solution {
	public static void main(String[] args) {
		char[][] board = {{'X', '.','.','X'}, {'.', 'X', '.','X'}, {'.', '.', '.','X'}, {'.', '.', '.','X'}};
		System.out.println(countBattleShips(board));
	}
	
	/**
	 * This function is using DFS method. 
	 * 			we recursively modify the slot that is adjacent to another value X. 
	 * 				BTW, we start from target value.
	 * 
	 * */
	public static int countBattleShips(char[][] board) {
		int battle_ships = 0;
		
		for (int i = 0; i < board.length; i ++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'X') {
					battle_ships += 1;
					dfs(i,j,board);
					//System.out.print("X");
				} else {
					continue;
					//System.out.print(".");
				}
			}
			
		}
		
		return battle_ships;
	}
	
	public static void dfs(int i, int j, char[][] board) {
		if (i < 0 || i >= board.length 
				|| j < 0 || j >= board[0].length) {
			return;
		} 
		if (board[i][j] == 'X'){
			board[i][j] = 'x';
			dfs(i - 1, j , board);
			dfs(i + 1, j, board);
			dfs(i, j - 1, board);
			dfs(i, j + 1, board);
		}
	}
	
	/**
	 * 这种方法的核心是这样的。
	 * 			因为根据题目的要求来看，valid ship必须是一行或者 一列 － 1xN or  Nx1，并且不能有两个相邻的船
	 * 				也就是说不能有 NxM 这样的船，这样不能被算作两个船.
	 * 
	 * 		根据以上我们可以利用它的性质，即只计算一个船的第一个cell, 转化成程序就是观察各个cell的同一行的上一列和
	 * 				同一列的上一行是否是X，如何是则忽略. 
	 * 
	 * 
	 * 
	 * */
	
	public static int countBattleShips_2(char[][] board) {
		int battle_ships = 0;
		
		for (int i = 0; i < board.length; i ++) {
			for (int j = 0; j < board[0].length; j++) {

				if (board[i][j] == '.') continue; 
				if (i > 0 && board[i-1][j] == 'X') continue;
				if (j > 0 && board[i][j-1] == 'X') continue;
				
				battle_ships ++;
			}
		}
		
		return battle_ships;
	}
}
