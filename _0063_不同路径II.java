package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/19 下午9:09
 * @Version 1.0
 */
public class _0063_不同路径II {
    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0,0,0,0,0},
                {0,0,0,0,1},
                {0,0,0,1,0},
                {0,0,1,0,0}
        };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 1) {
            for (int i = 0; i < obstacleGrid[0].length; i++) {
                if (obstacleGrid[0][i] == 1) {
                    return 0;
                }
            }
        }
        if (obstacleGrid[0].length == 1) {
            for (int i = 0; i < obstacleGrid.length; i++) {
                if (obstacleGrid[i][0] == 1) {
                    return 0;
                }
            }
        }
        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) {
            return 0;
        }
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = -1;
                }
            }
        }
        obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] = 1;
        for (int i = obstacleGrid.length - 1; i >= 0; i--) {
            for (int j = obstacleGrid[0].length - 1; j >= 0; j--) {
                if (obstacleGrid[i][j] == -1 || (i == obstacleGrid.length - 1 && j == obstacleGrid[0].length - 1)) {
                    continue;
                } else if (i == obstacleGrid.length - 1) {
                    obstacleGrid[i][j] = obstacleGrid[i][j + 1];
                } else if (j == obstacleGrid[0].length - 1) {
                    obstacleGrid[i][j] = obstacleGrid[i + 1][j];
                } else {
                    if (obstacleGrid[i][j + 1] == -1 && obstacleGrid[i + 1][j] >= 0) {
                        obstacleGrid[i][j] = obstacleGrid[i + 1][j];
                    } else if (obstacleGrid[i][j + 1] >= 0 && obstacleGrid[i + 1][j] == -1) {
                        obstacleGrid[i][j] = obstacleGrid[i][j + 1];
                    } else if (obstacleGrid[i][j + 1] == -1 && obstacleGrid[i + 1][j] == -1) {
                        obstacleGrid[i][j] = 0;
                    } else {
                        obstacleGrid[i][j] = obstacleGrid[i][j + 1] + obstacleGrid[i + 1][j];
                    }
                }
            }
        }
        for(int[] aa:obstacleGrid){
            for(int aaa:aa){
                System.out.print(aaa+" ");
            }
            System.out.println();
        }
        return obstacleGrid[0][0];
    }
}
