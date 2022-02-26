package no1700To1710;

/**
 * @PROJECT_NAME: LeetCode
 * @PACKAGE_NAME：No1700To1710
 * @DESCRIPTION: Perhaps, that has been the story of life
 * MOD = 1000000007
 * @AUTHOR: Yankfu
 * @DATE: 2022/2/24 21:33
 */
public class WhereWillTheBallFall_1706 {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}};
        int[] res = findBall(grid);
        for (int re : res) {
            System.out.print(re+" ");
        }
    }

    public static int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i] = i;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (res[j] == -1) {
                    continue;
                }
                int tend = grid[i][res[j]];
                if (tend == 1) {
                    if (res[j] + 1 >= grid[0].length ||
                            grid[i][res[j] + 1] == -1) {
                        res[j] = -1;
                        continue;
                    }
                    if (grid[i][res[j] + 1] == 1) {
                        res[j]++;
                    }
                } else if (tend == -1) {
                    if (res[j] == 0 ||
                            grid[i][res[j] - 1] == 1) {
                        res[j] = -1;
                        continue;
                    }
                    if (grid[i][res[j] - 1] == -1) {
                        res[j]--;
                    }
                }
            }
        }

        return res;
    }
}