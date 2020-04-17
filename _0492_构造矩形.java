package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/17 23:11
 */
public class _0492_构造矩形 {
    public static void main(String[] args) {
        int[] res = constructRectangle(5);
        System.out.println(res[0] +"  "+ res[1]);
    }
    public static int[] constructRectangle(int area) {
        if (area == 0){
            return new int[0];
        }
        int x = (int)Math.sqrt(area);
        int y = 1;
        for (; x < area; x++) {
            y = area / x;
            if (x*y == area){
                break;
            }
        }
        return new int[]{Math.max(x,y),Math.min(x,y)};
    }
}
