package No_36_Valid_Sudoku;

import java.util.*;

public class solution {
	public static void main (String[] args) {
		HashSet<Character> column = new HashSet<Character> ();
		System.out.println(column.add('d'));
		System.out.println(column.add('d'));
		
	}
	public static boolean isValidSudoku (char[][] board) {
		
		
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> column = new HashSet<Character> ();
			HashSet<Character> row = new HashSet<Character> ();
			HashSet<Character> cube = new HashSet<Character> ();
			for (int j = 0; j < board[0].length; j++) {
				//HashSet.add will return true, if the set does not contain the character.
				if (board[i][j] != '.' && !column.add(board[i][j])) {
					return false;
				}
				if (board[j][i] != '.' && !row.add(board[j][i])) {
					return false;
				}
				
				int rowIndex = 3 * (i/3);
				int columnIndex = 3 * (i%3);
				if (board[rowIndex + j/3][columnIndex + j%3] == '.' 
						&& !cube.add(board[rowIndex + j/3][columnIndex + j%3])) {
					return false;
				}
			}
		}
		
		return true;
	}

}
