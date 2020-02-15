package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0401_二进制手表 {
    public static void main(String[] args) {
        List<String> li = readBinaryWatch(2);
        for(String str:li){
            System.out.println(str);
        }
    }
    //1.正正经经的递归用dfs求，层数代表点，到一定层数计算添加即可
    //2.两个for循环，一层确定hour，一个确定min，两个加起来的1的个数等于n就添加进去，因为数据量不大，12*60
    //3.暴力穷举
    public static List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for(int i = 0;i<=11;i++){
            for(int j=0;j<60;j++){
                if(hammingWeight(i)+hammingWeight(j)==num){
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(':');
                    if(j<10){
                        sb.append('0').append(j);
                    }else{
                        sb.append(j);
                    }
                    res.add(sb.toString());
                }
            }
        }
        return res;
    }
    public static int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}