package Lab;

import java.util.Scanner;

public class NQueensBacktracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard (N): ");
        int N = scanner.nextInt();
        scanner.close();

        int[][] board = new int[N][N];
        if (solveNQueens(board, 0, N)) {
            printSolution(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    static boolean solveNQueens(int[][] board, int col, int N) {
        if (col >= N) {
            return true;
        }

        for (int row = 0; row < N; row++) {
            if (isSafe(board, row, col, N)) {
                board[row][col] = 1;
                if (solveNQueens(board, col + 1, N)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int N) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static void printSolution(int[][] board) {
        int N = board.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

