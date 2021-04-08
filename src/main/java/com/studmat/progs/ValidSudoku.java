package com.studmat.progs;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    class Solution {
        public boolean isValidSudoku(char[][] board) {
            Set<String> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    int value = board[i][j];
                    if (value != '.') {
                        if (!set.add(value + " in row " + i)
                                || !set.add(value + " in col " + j)
                                || !set.add(value + " in block " + i / 3 + j / 3)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
