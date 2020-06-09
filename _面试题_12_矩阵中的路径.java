package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/9 21:36
 */
public class _面试题_12_矩阵中的路径 {
    /**
     * 遍历每个char，如果有word.charAt(0) 就进行dfs
     * @param board
     * @param word
     * @return
     */
    int[][] newXY = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1},
    };
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)){
                    if (dfs(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 开始进行dfs
     * 刚开始停在指定的位置，现在要开始搜索下一个位置
     * 先把自身设置为不存在的字符（不会被检测到即可）
     * 然后通过上下左右进行搜索第二个字符是否存在，如果存在进入dfs。
     * 结束条件，index == word.length()
     * @param board 棋盘
     * @param word  要搜索的单词
     * @param x     现在所处的位置
     * @param y     现在所处的位置
     * @index index 要搜索的字符
     * @return      下一个是否合法，如果word.length()==0直接返回true
     */
    public boolean dfs(char[][] board,String word,int x,int y,int index){
        //如果是要搜索的地方等于了字符串的长度就可以直接返回对的，因为搜索完了。
        if (++index == word.length()){
            return true;
        }

        int newX = x;
        int newY = y;
        char a = board[x][y];
        board[x][y] = '1';
        boolean flag = false;
        for (int i = 0; i < 4; i++) {
            newX = newX + newXY[i][0];
            newY = newY + newXY[i][1];

            //边界判断
            if (!(newX<0 || newX>=board.length ||newY<0 || newY>=board[0].length)){
                if (word.charAt(index) == board[newX][newY]){
                    flag = (flag || dfs(board,word,newX,newY,index));
                }
            }

            newX = newX - newXY[i][0];
            newY = newY - newXY[i][1];
        }

        //需不需要还原........
        board[x][y] = a;

        return flag;
    }
}
