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
    static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        backTrack(nums, 0, 0, target, new ArrayList<>(), 0);
        Set set = new HashSet();
        set.addAll(res);
        List<List<Integer>> resNew = new ArrayList<>();
        resNew.addAll(set);
        return resNew;
    }

    public static void backTrack(int[] nums, int now, int nowVal, int target, List<Integer> list, int point) {
        if (now == 4 && nowVal == target) {
            res.add(new ArrayList<>(list));
        }
        for (int i = point; i < nums.length; i++) {
            if(nums.length-i+now>=4){
                list.add(nums[i]);
                backTrack(nums, now + 1, nowVal + nums[i], target, list, i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}
