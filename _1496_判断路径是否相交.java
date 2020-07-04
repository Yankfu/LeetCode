package com.LeetCode;

import java.util.HashSet;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/3 23:12
 */
public class _1496_判断路径是否相交 {
    //判断路径是否相交
    public boolean isPathCrossing(String path) {
        HashSet<int[]> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(new int[]{x,y});
        char[] ch = path.toCharArray();
        for (char c:ch){
            //System.out.println(x+"  "+y);
            if (c == 'N'){
                y++;
                for (int[] i:set){
                    if (x == i[0] && y == i[1]){
                        return true;
                    }
                }
                set.add(new int[]{x,y});
            }else if (c == 'S'){
                y--;
                for (int[] i:set){
                    if (x == i[0] && y == i[1]){
                        return true;
                    }
                }
                set.add(new int[]{x,y});
            }else if (c == 'E'){
                x++;
                for (int[] i:set){
                    if (x == i[0] && y == i[1]){
                        return true;
                    }
                }
                set.add(new int[]{x,y});
            }else if (c == 'W'){
                x--;
                for (int[] i:set){
                    if (x == i[0] && y == i[1]){
                        return true;
                    }
                }
                set.add(new int[]{x,y});
            }
        }
        return false;
    }
}
