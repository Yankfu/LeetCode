package com.LeetCode;

public class _1219_黄金矿工 {
    public static void main(String[] args) {
        int[][] grid = {
                {0,6,0},
                {5,8,7},
                {0,9,0},
        };
        System.out.print(getMaximumGold(grid));
    }

    static int res = 0;
    static int[][] direction = {
            {0, -1},
            {-1, 0},
            {0, 1},
            {1, 0}
    };

    /**
     * 记得写个带浏览记录的剪枝版本
     * @param grid
     * @return
     */
    public static int getMaximumGold(int[][] grid) {
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] > 0)
                    backTrack(grid, i, j, 0);
        return res;
    }

    public static void backTrack(int[][] grid, int x, int y, int total) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) {
            if (total > res)
                res = total;
        } else {
            int temp = grid[x][y];
            total += temp;
            grid[x][y] = 0;
            for (int i = 0; i < 4; i++)
                backTrack(grid, x + direction[i][0], y + direction[i][1], total);
            grid[x][y] = temp;
            total -= temp;
        }
    }
}
