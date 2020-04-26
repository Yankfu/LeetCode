package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/26 17:43
 */
public class _0498_对角线遍历 {
    public static void main(String[] args) {
        int[][] matrix = {

        };
        int[] res = new _0498_对角线遍历().findDiagonalOrder(matrix);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int[] res = new int[matrix.length*matrix[0].length];
        if (matrix.length == 0 || matrix[0].length == 0){
            return res;
        }
        int x = 0;
        int y = 0;
        int index = 0;
        boolean youXiaZuoShang = true;
        while (!(x==matrix.length-1 && y==matrix[0].length-1)){
            res[index++] = matrix[x][y];
            if (youXiaZuoShang){
                x--;
                y++;
                /**
                 * 左上有两种越界可能
                 * 1
                 * (0,0)→(-1,1) if(x==-1)
                 * 这种情况需要把标记变为false
                 * 然后 x = x + 1;
                 *
                 * 2
                 * (0,2)→(-1,3) if(x == -1 && y == matrix.length)
                 * 更换标记
                 * x = x + 2;y = y - 1;
                 */
                if (x == -1 && y == matrix[0].length) {
                    x = x + 2;
                    y = y - 1;
                    youXiaZuoShang = false;
                } else if (x == -1) {
                    x = x + 1;
                    youXiaZuoShang = false;
                } else if (y == matrix[0].length) {
                    x = x + 2;
                    y = y - 1;
                    youXiaZuoShang = false;
                }
            }else {
                x++;
                y--;
                if (y == -1 && x == matrix.length) {
                    x = x - 1;
                    y = y + 2;
                    youXiaZuoShang = true;
                } else if (y == -1) {
                    y = y + 1;
                    youXiaZuoShang = true;
                } else if (x == matrix.length) {
                    y = y + 2;
                    x = x - 1;
                    youXiaZuoShang = true;
                }
            }
        }
        res[res.length-1] = matrix[x][y];
        return res;
    }
}
