// Watch video for reference -> https://youtu.be/bRs6E_SL2Tk?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&t=1231

package queenN_problem;

import java.util.ArrayList;
import java.util.List;

public class QueenNSolve {
	// N-Quenns=> N * N chessboard, N queens, print all solution where queen is safe

	public static boolean isSafe(int row, int col, char[][] board) {
		// horizontal
		for (int j = 0; j < board.length; j++) {
			if (board[row][j] == 'Q') {
				return false;
			}
		}
		// vertical
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}
		// diagonal upper-left
		int r = row;
		for (int c = col; c >= 0 && r >= 0; c--, r--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// diagonal upper-right
		r = row;
		for (int c = col; c < board.length && r >= 0; r--, c++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// diagonal lower-left
		r = row;
		for (int c = col; c >= 0 && r < board.length; r++, c--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// diagonal lower-right
		for (int c = col; c < board.length && r < board.length; c++, r++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		return true;
	}

	public static void saveBoard(char[][] board, List<List<String>> allBoards) {
		// TODO Auto-generated method stub
		String row = "";
		List<String> newboard = new ArrayList<>();

		for (int i = 0; i < board.length; i++) {
			row = "";
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'Q') {
					row += 'Q';
				} else {
					row += ".";
				}
			}
			newboard.add(row);
		}
		allBoards.add(newboard);
	}

	public static void helper(char[][] board, List<List<String>> allBoards, int col) {
		if (col == board.length) {
			saveBoard(board, allBoards);
			return;
		}

		for (int row = 0; row < board.length; row++) {
			if (isSafe(row, col, board)) {
				board[row][col] = 'Q';
				helper(board, allBoards, col + 1);
				board[row][col] = '.';
			}
		}
	}

	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];

		helper(board, allBoards, 0);
		return allBoards;
	}



	public static void main(String[] args) {

		int n=4;
		System.out.print(solveNQueens(n));
		
	}
}
