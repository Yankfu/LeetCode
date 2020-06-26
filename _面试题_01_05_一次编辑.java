package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/26 11:58
 */
public class _面试题_01_05_一次编辑 {
    /**
     * 插入删除或替换
     * 其实插入或者删除是一个操作
     * 把长的放前面，短的放后面，然后双指针扫一遍，碰到不同的长的给后跳一个看是否相同
     * 如果相同到最后就是true，如果还有不同就返回false
     * 如果是替换首先要保证长度相等
     * 在长度相等的前提下扫一遍，标记每一位不同的点，如果大于1就返回false
     * @param first
     * @param second
     * @return
     */
    public boolean oneEditAway(String first, String second) {

        //确保first一定是最长的
        String myFirst = first.length()>=second.length()?first:second;
        String mySecond = first.length()>=second.length()?second:first;

        if (myFirst.length()==mySecond.length()){
            int count = 0;
            for (int i = 0; i < myFirst.length(); i++) {
                if (myFirst.charAt(i)!=mySecond.charAt(i)){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }else {
            if (myFirst.length()-1!=mySecond.length()){
                return false;
            }
            int count = 0;
            for (int i = 0,j = 0; i < myFirst.length() && j<mySecond.length(); i++,j++) {
                if (myFirst.charAt(i)!=mySecond.charAt(j)){
                    j--;
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }


        return true;
    }
}
