package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/23 20:49
 */
public class _1232_缀点成线 {
    public boolean checkStraightLine(int[][] coordinates) {
        double a,b,c,d;
        a=coordinates[0][0];
        b=coordinates[0][1];
        c=coordinates[1][0];
        d=coordinates[1][1];
        for(int[] i:coordinates){
            if((i[1]-b)*(c-a)!=(i[0]-a)*(d-b)) {
                return false;
            }
        }
        return true;
    }
}
