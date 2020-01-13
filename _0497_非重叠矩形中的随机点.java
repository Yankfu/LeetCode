package com.LeetCode;

import java.util.Random;

public class _0497_非重叠矩形中的随机点 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] rects= {{82918473, -57180867, 82918476, -57180863},{83793579, 18088559, 83793580, 18088560},
				{66574245, 26243152, 66574246, 26243153},{72983930, 11921716, 72983934, 11921720}};
		Solution497 ss = new Solution497(rects);
		for(int i=1;i<1000;i++) {
			int[] a = ss.pick();
			System.out.print("("+a[0]+","+a[1]+")  ");
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}
class Solution497 {
	private int[][] rects;
	private int sum=0;
	private int[] duan;
	Random r = new Random();
    public Solution497(int[][] rects) {
        this.rects=rects;
        duan = new int[rects.length];
        for(int i=0;i<rects.length;i++) {
        	sum=sum+((rects[i][2]-rects[i][0]+1)*(rects[i][3]-rects[i][1]+1));
        	duan[i]=sum;
        }
    }
    
    public int[] pick() {
        int[] res = new int[2];
        int num=0;
        int a=r.nextInt(sum);
        int i=0;
        for(;i<duan.length;i++) {
        	if(a<duan[i]) {
        		break;
        	}else {
        		continue;
        	}
        }
        int chose = i;
        int len = rects[chose][2]-rects[chose][0];
        int high = rects[chose][3]-rects[chose][1];
        if(len==0) {
        	res[0]=rects[chose][0];
        }else {
        	res[0]=r.nextInt(len+1)+rects[chose][0];
        }
        if(high==0) {
        	res[1]=rects[chose][1];
        }else {
        	res[1]=r.nextInt(high+1)+rects[chose][1];
        }
        
    	return res;
    }
}