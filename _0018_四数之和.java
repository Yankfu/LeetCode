package com.LeetCode;

import java.util.*;

public class _0018_四数之和 {
    public static void main(String[] args) {
        int[] nums = {-493,-482,-482,-456,-427,-405,-392,-385,-351,-269,-259,-251,-235,-235,-202,-201,-194,-189,-187,-186,-180,-177,-175,-156,-150,-147,-140,-122,-112,-112,-105,-98,-49,-38,-35,-34,-18,20,52,53,57,76,124,126,128,132,142,147,157,180,207,227,274,296,311,334,336,337,339,349,354,363,372,378,383,413,431,471,474,481,492};
        List<List<Integer>> li = fourSum(nums, 6189);
        for (List<Integer> lis : li) {
            System.out.println(lis);
        }
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length<4){
            return res;
        }
        Arrays.sort(nums);
        int first;
        int second;
        int third;
        int four;
        for (first = 0; first < nums.length-3; first++) {
            if(first>0 && nums[first] == nums[first-1]){
                continue;
            }
            int min = nums[first]+nums[first+1]+nums[first+2]+nums[first+3];
            if(min>target){
                break;
            }
            int max1=nums[first]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
            if(max1<target){
                continue;
            }
            for (second = first+1; second < nums.length-2; second++) {
                if(second>first+1 && nums[second] == nums[second-1]){
                    continue;
                }
                third = second + 1;
                four = nums.length-1;
                int min2 = nums[first] + nums[second] + nums[third] + nums[third+1];
                if(min>target){
                    continue;//是不是可以改成break
                }
                int max2 = nums[first] + nums[second] + nums[four] + nums[four-1];
                if(max2<target){
                    continue;
                }
                while(third<four){
                    int curr = nums[first] + nums[second] + nums[third] + nums[four];
                    if(curr == target){
                        res.add(Arrays.asList(nums[first],nums[second],nums[third],nums[four]));
                        third++;
                        while(third<four && nums[third] == nums[third-1]){
                            third++;
                        }
                        four--;
                        while(third<four && second<four && nums[four] == nums[four+1]){
                            four--;
                        }
                    }else if(curr>target){
                        four--;
                    }else {
                        third++;
                    }
                }
            }
        }
        return res;
    }
}
