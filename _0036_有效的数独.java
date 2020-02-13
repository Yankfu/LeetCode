package com.LeetCode;

public class _0036_有效的数独 {
    public static void main(String[] args) {
        char[][] board = {
                {'.','.','9','7','4','8','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'.','2','.','1','.','9','.','.','.'},
                {'.','.','7','.','.','.','2','4','.'},
                {'.','6','4','.','1','.','5','9','.'},
                {'.','9','8','.','.','.','3','.','.'},
                {'.','.','.','8','.','3','.','2','.'},
                {'.','.','.','.','.','.','.','.','6'},
                {'.','.','.','2','7','5','9','6','.'}
        };
        System.out.print(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]!='.' && !legal(board,i,j)){
                   return false;
                }
            }
        }
        return true;
    }
    public static boolean legal(char[][] board, int i, int j) {
        //行不冲突
        for (int k = 0; k < board.length; k++) {
            if(k==j){

            }else{
                if(board[i][k] == board[i][j]){
                    return false;
                }
            }
        }
        // System.out.println("     行没问题  ");
        //列不冲突
        for (int k = 0; k < board.length; k++) {
            if(k==i){

            }else{
                if(board[k][j] == board[i][j]){
                    return false;
                }
            }
        }
        //System.out.println("     列没问题");
        //单元格内不冲突
        for (int k = (i / 3) * 3; k < ((i / 3) * 3) + 3; k++) {
            for (int l = (j / 3) * 3; l < ((j / 3) * 3) + 3; l++) {
                if(k==i && l == j){

                }else{
                    //System.out.println(k+" "+l);
                    if(board[k][l] == board[i][j]){
                        return false;
                    }
                }
            }
        }
        //System.out.println("     单元格没问题");
        return true;
    }
}
