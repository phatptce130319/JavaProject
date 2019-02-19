/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueensapplication;

/**
 *
 * @author Steven
 */
import java.util.Arrays;

class NQueen
{
	// N x N chessboard
	public static int N;
        public static int count = 0;
        public static char[][] state; 
        public static boolean isPrint = false;
        

	// Function to check if two queens threaten each other or not
	private static boolean isSafe(char mat[][], int r, int c)
	{
		// return false if two queens share the same column
		for (int i = 0; i < r; i++)
			if (mat[i][c] == 'Q')
				return false;

		// return false if two queens share the same \ diagonal
		for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
			if (mat[i][j] == 'Q')
				return false;

		// return false if two queens share the same / diagonal
		for (int i = r, j = c; i >= 0 && j < N; i--, j++)
			if (mat[i][j] == 'Q')
				return false;

		return true;
	}

	private static void nQueen(char mat[][], int r)
	{
		// if N queens are placed successfully, print the solution
		if (r == N)
		{
			for (int i = 0; i < N; i++)
			{
				for (int j = 0; j < N; j++) {
                                    if (!isPrint) state[i][j] = mat[i][j];
                                }	
			}
                        isPrint = true;
                        count++;
			return;
		}

		// place Queen at every square in current row r
		// and recurse for each valid movement
		for (int i = 0; i < N; i++)
		{
			// if no two queens threaten each other
			if (isSafe(mat, r, i))
			{
				// place queen on current square
				mat[r][i] = 'Q';

				// recurse for next row
				nQueen(mat, r + 1);

				// backtrack and remove queen from current square
				mat[r][i] = '-';
			}
		}
	}

	public static void runSolution()
	{
		// mat[][] keeps track of position of Queens in
		// the current configuration
		char[][] mat = new char[N][N];

		// initialize mat[][] by '-'
		for (int i = 0; i < N; i++) {
			Arrays.fill(mat[i], '-');
		}

		nQueen(mat, 0);
               
	}
}