package com.LeetCode;

public class _1111_有效括号的嵌套深度 {
    public static void main(String[] args) {
        String seq = "()(())()";
        int[] res = maxDepthAfterSplit(seq);
        for (int i:res){
            System.out.print(i+" ");
        }
    }
    public static int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int deep = 0;
        int index = 0;
        for (char ch:seq.toCharArray()){
            if (ch == '(') {
                res[index++] = deep++;
            }else if (ch == ')') {
                res[index++] = --deep;
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i]%2==0) res[i] = 0;
            else res[i] = 1;
        }
        return res;
    }
}
