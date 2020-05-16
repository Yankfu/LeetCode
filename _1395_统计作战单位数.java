package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/16 17:13
 */
public class _1395_统计作战单位数 {
    public static void main(String[] args) {
        int[] rating = {2,1,3};
        System.out.println(numTeams(rating));
    }
    public static int numTeams(int[] rating) {
        if (rating.length <= 2){
            return 0;
        }
        int res = 0;
        for (int i = 0; i < rating.length-2; i++) {
            for (int j = i + 1; j < rating.length-1; j++) {
                if (rating[i] < rating[j]){
                    int right = rating.length-1;
                    while (right > j){
                        if (rating[j] < rating[right]){
                            res++;
                        }
                        right--;
                    }
                } else if (rating[i] > rating[j]) {
                    int right = rating.length-1;
                    while (right > j){
                        if (rating[j] > rating[right]){
                            res++;
                        }
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
