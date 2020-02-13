package com.LeetCode;

public class _0037_解数独 {


    //    static char[][] res = new char[9][9];
    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '9', '7', '4', '8', '.', '.', '.'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '2', '.', '1', '.', '9', '.', '.', '.'},
                {'.', '.', '7', '.', '.', '.', '2', '4', '.'},
                {'.', '6', '4', '.', '1', '.', '5', '9', '.'},
                {'.', '9', '8', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '8', '.', '3', '.', '2', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '2', '7', '5', '9', '.', '.'}
        };
        solveSudoku(board);
        System.out.println("这是运行完的结果------------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
                if ((j + 1) % 3 == 0 && j != 8) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i != 8) {
                System.out.println("-------------------");
            }
        }
    }

    static boolean flag = false;
    static char[][] res = new char[9][9];

    public static void solveSudoku(char[][] board) {
        backTrack(board, 0, 0);
        for (int k = 0; k < res.length; k++) {
            for (int l = 0; l < res.length; l++) {
                board[k][l] = res[k][l];
            }
        }
    }

    public static void backTrack(char[][] board, int i, int j) {
//        System.out.println(i+" "+j+"---------------------------");
//        for (int k = 0; k < board.length; k++) {
//            for (int l = 0; l < board[0].length; l++) {
//                System.out.print(board[k][l] + " ");
//                if ((l + 1) % 3 == 0 && l != 8) {
//                    System.out.print("|");
//                }
//            }
//            System.out.println();
//            if ((k + 1) % 3 == 0 && k != 8) {
//                System.out.println("-------------------");
//            }
//        }

        if (i == board.length && j == 0 && !flag) {
            flag = true;
            for (int k = 0; k < res.length; k++) {
                for (int l = 0; l < res.length; l++) {
                    res[k][l] = board[k][l];
                }
            }
        } else if (board[i][j] != '.' && !flag) {
            if (j == 8) {
                backTrack(board, i + 1, 0);
            } else {
                backTrack(board, i, j + 1);
            }
        } else if (board[i][j] == '.' && !flag) {
            for (int count = 1; count < 10; count++) {
                //System.out.println(legal(board, i, j)+" "+count);
                board[i][j] = (char) (count + 48);
                if (legal(board, i, j) && !flag) {
                    if (j == 8) {
                        backTrack(board, i + 1, 0);
                    } else {
                        backTrack(board, i, j + 1);
                    }
                    board[i][j] = '.';
                } else {
                    board[i][j] = '.';
                }
            }
        }
    }

    //检验是否合法
    /*
    1.横行不冲突
    2.竖行不冲突
    3.3*3行内不冲突
     */
    public static boolean legal(char[][] board, int i, int j) {
        //行不冲突
        for (int k = 0; k < board.length; k++) {
            if (k == j) {

            } else {
                if (board[i][k] == board[i][j]) {
                    return false;
                }
            }
        }
        // System.out.println("     行没问题  ");
        //列不冲突
        for (int k = 0; k < board.length; k++) {
            if (k == i) {

            } else {
                if (board[k][j] == board[i][j]) {
                    return false;
                }
            }
        }
        //System.out.println("     列没问题");
        //单元格内不冲突
        for (int k = (i / 3) * 3; k < ((i / 3) * 3) + 3; k++) {
            for (int l = (j / 3) * 3; l < ((j / 3) * 3) + 3; l++) {
                if (k == i && l == j) {

                } else {
                    //System.out.println(k+" "+l);
                    if (board[k][l] == board[i][j]) {
                        return false;
                    }
                }
            }
        }
        //System.out.println("     单元格没问题");
        return true;
    }
}
