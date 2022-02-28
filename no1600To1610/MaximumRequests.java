package no1600To1610;

import java.util.*;
public class MaximumRequests {

    public static void main(String[] args) {
        int n = 3;
        int[][] requests = {
            {0,0},
            {1,2},
            {2,1}
        };
        System.out.println(maximumRequests(n, requests));
    }

    public static int maximumRequests(int n, int[][] requests) {
        int res = 0;
        for (int i = 0; i < requests.length; i++) {
            res = res << 1;
            res = (res ^ 1);
        }
        int[] house = new int[n];
        int trueRes = 0;
        while (res != 0) {
            int moveIn = res;
            for (int i = 0; i < requests.length; i++) {
                if (((moveIn >> i) & 1) == 1) {
                    house[requests[i][0]]--;
                    house[requests[i][1]]++;
                }
            }
            int tempTrueRes = 0;
            if (checkHouse(house)) {
                moveIn = res;
                System.out.println(moveIn+" "+res);
                while (moveIn != 0) {
                    if ((moveIn & 1) == 1) {
                        tempTrueRes++;
                    }
                    moveIn = moveIn >>> 1;
                }
                trueRes = Math.max(trueRes, tempTrueRes);
                System.out.println(trueRes);
            }
            Arrays.fill(house, 0);
            res--;
        }
        return trueRes;
    }
    public static boolean checkHouse(int[] house) {
        for (int i = 0; i < house.length; i++) {
            if (house[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
