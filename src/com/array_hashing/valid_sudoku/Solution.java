package com.array_hashing.valid_sudoku;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        char[][] board = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean isValidSudoku = isValidSudoku(board);
        System.out.println(isValidSudoku);
    }

    public static boolean isValidSudoku(char[][] board) {
        // Arrays of sets to keep track of seen numbers in rows, columns, and 3x3 boxes
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        // Initialize each set
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse each cell of the board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];

                // Skip empty cells
                if (val == '.') continue;

                // Calculate box index (0 to 8) for current cell
                int boxIndex = (r / 3) * 3 + (c / 3);

                // Check if the value already exists in the row, column or box
                if (rows[r].contains(val)) return false;
                if (cols[c].contains(val)) return false;
                if (boxes[boxIndex].contains(val)) return false;

                // Add the value to respective sets
                rows[r].add(val);
                cols[c].add(val);
                boxes[boxIndex].add(val);
            }
        }

        // If no duplicates found, the board is valid
        return true;
    }
}
