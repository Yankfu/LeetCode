package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/28 10:11
 */
public class _0400_第N个数字 {
    public int findNthDigit(int n) {
        long num=n;
        long size=1;
        long max=9;

        while(n>0){
            //判断不在当前位数内
            if(num-max*size>0){
                num=num-max*size;
                size++;
                max=max*10;
            }else{
                long count=num/size;
                long left=num%size;
                if(left==0){
                    return (int) (((long)Math.pow(10, size-1)+count-1)%10);
                }else{
                    return (int) (((long)Math.pow(10, size-1)+count)/((long)Math.pow(10, (size-left)))%10);
                }
            }
        }

        return 0;
    }
}
