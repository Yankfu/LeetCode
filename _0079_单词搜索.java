package com.LeetCode;

public class _0079_单词搜索 {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
//        System.out.println(exist(board,word));
//        System.out.println(exist(board,"SEE"));
        System.out.println(exist(board, "ABCB"));
    }

    public static boolean exist(char[][] board, String word) {
        return findWord(board, word);
    }

    public static boolean findWord(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    char temp = board[i][j];
                    board[i][j] = '.';
                    if (backTrack(board, i, j, word, 1)) {
                        return true;
                    }
                    board[i][j] = temp;
                }
            }
        }
        return false;
    }

    private static int[][] direction = {
            {-1, 0},
            {0, 1},
            {1, 0},
            {0, -1}
    };

    public static boolean backTrack(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        for (int k = 0; k < 4; k++) {
            i = i + direction[k][0];
            j = j + direction[k][1];
            if (i < 0 || i >= board.length) {
                i = i - direction[k][0];
                j = j - direction[k][1];
                continue;
            }
            if (j < 0 || j >= board[0].length) {
                i = i - direction[k][0];
                j = j - direction[k][1];
                continue;
            }
            if (board[i][j] == word.charAt(index)) {
                char temp = board[i][j];
                board[i][j] = '.';
                if (backTrack(board, i, j, word, index + 1)) {
                    return true;
                }
                board[i][j] = temp;
            }
            i = i - direction[k][0];
            j = j - direction[k][1];
        }
        return false;
    }
}
