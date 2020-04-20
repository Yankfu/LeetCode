package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/20 9:29
 */
public class _LCP_08_剧情触发时间 {
    public static void main(String[] args) {
        int[][] relation = {
                {2,8,4},{2,5,0},{10,9,8}
        };
        int[][] requirements = {
                {2,11,3},{15,10,7},{9,17,12},{8,1,14}
        };
        _LCP_08_剧情触发时间 test = new _LCP_08_剧情触发时间();
        int[] res = test.getTriggerTime(relation,requirements);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int[] res = new int[requirements.length];
        //特判
        for (int j = 0; j < requirements.length; j++) {
            if (requirements[j][0] == 0 && requirements[j][1] == 0 && requirements[j][2] == 0){
                res[j] = 0;
            }else {
                res[j] = -1;
            }
        }
        //累加
        for (int i = 1; i < increase.length; i++) {
            increase[i][0] += increase[i-1][0];
            increase[i][1] += increase[i-1][1];
            increase[i][2] += increase[i-1][2];
        }
        //从第一个开始使用二分搜索
        for (int i = 0; i < requirements.length; i++) {
            //二分搜索
            int left = 0;
            int right = increase.length-1;
            if(!(increase[right][0]>=requirements[i][0]&&increase[right][1]>=requirements[i][1]&&increase[right][2]>=requirements[i][2])){
                continue;
            }
            while (left < right) {
                int mid = left + (right - left)/2;
                if (!(increase[mid][0] >= requirements[i][0] && increase[mid][1] >= requirements[i][1] && increase[mid][2] >= requirements[i][2])){
                    left = mid + 1;
                }else {
                    right = mid;
                }
                res[i] = left+1;
            }
        }
        return res;
    }
}
