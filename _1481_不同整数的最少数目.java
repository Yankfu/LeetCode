package com.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/15 22:50
 */
public class _1481_不同整数的最少数目 {
    //不同整数的最少数目
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int[] temp = new int[map.size()];
        int i = 0;
        for (int num:map.keySet()){
            temp[i++] = map.get(num);
        }

        Arrays.sort(temp);
//        System.out.println(temp.length);

        for (int j = 0; j < temp.length; j++) {
            k -= temp[j];
//            System.out.println(temp[j]+" "+k+"  aaa");
            if (k < 0){
                return temp.length-j;
            }else if (k == 0){
                return temp.length-j-1;
            }
        }
        return 0;
    }
}
