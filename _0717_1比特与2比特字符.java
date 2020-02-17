package com.LeetCode;

public class _0717_1比特与2比特字符 {
    public static void main(String[] args) {

    }
    public static boolean isOneBitCharacter(int[] bits) {
        int count=0;
        for(int i = bits.length-2;i>=0;i--){
            if(bits[i]==0){
                break;
            }else if(bits[i] == 1){
                count++;
            }
        }
        return count%2 == 0;
    }
}
