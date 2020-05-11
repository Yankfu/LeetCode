package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/7 8:27
 */
public class _0029_两数相除 {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,2));
    }
    //递归？
    public static int divide(int dividend, int divisor) {
        if (dividend == 0){
            return 0;
        }
        if (divisor == 1){
            return dividend;
        }
        if (divisor == -1){
            //实际上不能直接除 -1 ，复数会越界
            if(dividend>Integer.MIN_VALUE) return -dividend;// 只要不是最小的那个整数，都是直接返回相反数就好啦
            return Integer.MAX_VALUE;// 是最小的那个，那就返回最大的整数啦
        }

        Boolean isFu = false;
        if ((dividend<0 && divisor>0) || (dividend>0 && divisor<0)){
            isFu = true;
        }
        long tempDend = dividend;
        long tempSor = divisor;
        tempDend = tempDend>0?tempDend:-tempDend;
        tempSor = tempSor>0?tempSor:-tempSor;
        long res = divideHelp(tempDend,tempSor);
        if (!isFu){
            return res>Integer.MAX_VALUE?Integer.MAX_VALUE:(int)res;
        }
        return (int)-res;
    }
    public static long divideHelp(long dividend,long divisor){
        if (dividend<divisor){
            return 0;
        }
        long res = 1;
        long tempDivisor = divisor;
        while (tempDivisor + tempDivisor < dividend){
            tempDivisor += tempDivisor;
            res = res + res;
        }
        return res + divideHelp(dividend - tempDivisor,divisor);
    }
}
