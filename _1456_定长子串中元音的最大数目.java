package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/31 23:13
 */
public class _1456_定长子串中元音的最大数目 {
    //5417. 定长子串中元音的最大数目
    public static int maxVowels(String s, int k) {
        int left = 0;
        int right = left+k-1;
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = left; i < right+1; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                count++;
            }
        }
        if (count == k){
            return k;
        }
        //头k个字符判断完成
        right++;
        int max = count;
        while (right < ch.length){
            if (ch[left] == 'a' || ch[left] == 'e' || ch[left] == 'i' || ch[left] == 'o' || ch[left] == 'u'){
                count--;
            }
            left++;
            if (ch[right] == 'a' || ch[right] == 'e' || ch[right] == 'i' || ch[right] == 'o' || ch[right] == 'u'){
                count++;
            }
            if (count == k){
                max = k;
                break;
            } else if (count>max) {
                max = count;
            }
            right++;
        }
        return max;
    }
}
