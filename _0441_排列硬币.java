package com.LeetCode;

public class _0441_排列硬币 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangeCoins(2147483647));
		//System.out.println(arrangeCoins(7));
	}

	public static int arrangeCoins(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
        int i=0;//每层硬币个数，也就相当于层数
        int sum=0;//硬币总数
        while(sum+i<=n && sum<=Integer.MAX_VALUE-i){//当硬币总数小于要求的时候
            sum=sum+i;//硬币总数加上下一层
            i++;//下一层数量加1
            //System.out.println("i:"+i+"   sum:  "+sum);
        }
        return (int)(Math.sqrt(2)*Math.sqrt(n+0.125)-0.5);
    }
}
