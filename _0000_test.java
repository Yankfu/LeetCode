package com.LeetCode;


import java.util.*;

public class _0000_test {
    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        _0000_test test = new _0000_test();
        String v1 = "01.0";
    }
    //给房子涂色 III
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        return 0;
    }

    //数组中的 k 个最强值
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int mid = arr[(arr.length-1)/2];
        int[] res = new int[k];
        int left = 0;
        int right = arr.length-1;
        int index = 0;
        while (k>0){
            int temp = 0;
            if (Math.abs(arr[right]-mid) >= Math.abs(arr[left]-mid)){
                temp = arr[right--];
            } else if (Math.abs(arr[right]-mid) < Math.abs(arr[left]-mid)) {
                temp = arr[left++];
            }
            res[index++] = temp;
            k--;
        }
        return res;
    }

    //设计浏览器历史记录
    /**
     * Your BrowserHistory object will be instantiated and called as such:
     * BrowserHistory obj = new BrowserHistory(homepage);
     * obj.visit(url);
     * String param_2 = obj.back(steps);
     * String param_3 = obj.forward(steps);
     */
    static class BrowserHistory {
        List<String> list;
        int index;
        public BrowserHistory(String homepage) {
            list = new ArrayList<>();
            list.add(homepage);
            index = 0;
        }

        public void visit(String url) {
//            System.out.println("visit:  ");
//            System.out.print(list);
//            System.out.println("   "+index+"  visit:"+url);
            if (list.size() == 0){
                list.add(url);
                index = 0;
                return;
            }
            if (index != list.size()-1){
                List<String> temp = list.subList(index+1,list.size());
                list.removeAll(temp);
            }
            list.add(url);
            index = list.size()-1;
        }

        public String back(int steps) {
//            System.out.println("back:  ");
//            System.out.print(list);
//            System.out.println("   "+index);
            index -= steps;
            if (index < 0){
                index = 0;
//                System.out.println(list.get(0));
                return list.get(0);
            }
//            System.out.println(list.get(index));
            return list.get(index);
        }

        public String forward(int steps) {
//            System.out.println("forward:  ");
//            System.out.print(list);
//            System.out.println("   "+index);
            index += steps;
            if (index >= list.size()){
                index = list.size()-1;
//                System.out.println(list.get(list.size()-1)+" "+index);
                return list.get(list.size()-1);
            }
//            System.out.println(list.get(index));
            return list.get(index);
        }
    }


    //重新排列数组
    public int[] shuffle(int[] nums, int n) {
        int x = 0;
        int y = n;
        int index = 0;
        int[] res = new int[nums.length];
        while (y < nums.length){
            res[index++] = nums[x++];
            res[index++] = nums[y++];
        }
        return res;
    }

}