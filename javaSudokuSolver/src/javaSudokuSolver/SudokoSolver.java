package javaSudokuSolver;

public class SudokoSolver {
	
	private static void printSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean helper(char[][] board, int row, int col) {
		if (row == board.length) {
			return true;
		}
		
		// Move to next row when current row is fully filled
        if (col == board[0].length) {
            return helper(board, row + 1, 0);
        }
		
		if (board[row][col] != '.') {
			return (helper(board, row, col+1));
		}
		
        // Try different numbers in current cell

		for (char i = '1'; i <= '9'; i++) {
			if (isSafe(board, row, col, i)) {
				board[row][col] = i;

				if (helper(board, row, col+1)) {
					return true;
				}
				board[row][col] = '.';
			}
			
		}
		return false;
	}

	private static boolean isSafe(char[][] board, int row, int col, int number) {
		// row & column
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == number) {
				return false;
			}
			if (board[row][i] == number) {
				return false;
			}
		
		// grid 3*3

		int sr = (row / 3) * 3 + i/3;
		int sc = (col / 3) * 3 + i%3;

		if (board[sr][sc] == number) {
				return false;
			}
		}

		return true;
	}

	

	public static void solveSudoku(char[][] board) {
		helper(board, 0, 0);

	}

	public static void main(String[] args) {

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		solveSudoku(board);
		printSudoku(board);
	}

}
