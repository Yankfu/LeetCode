package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/5 上午8:37
 * @Version 1.0
 */
public class _1103_分糖果II {
	public static void main(String[] args) {
		int[] res = distributeCandies(7,4);
		for(int a:res){
			System.out.print(a+" ");
		}
	}
	public static int[] distributeCandies(int candies, int num_people) {
		int[] res = new int[num_people];
		int temp = 0;
		int count = 0;
		while(temp<=candies){
			temp = 0;
			count++;
			temp = (1+(count*num_people))*(count*num_people)/2;
		}
		count--;
		for (int i = 0; i < res.length; i++) {
			res[i] =(i+1)*(count)  + (num_people*(((0+(count-1))*count)/2));
		}
		candies -= (1+(count*num_people))*(count*num_people)/2;
		for (int i = 0; i < res.length; i++) {
			if(candies >= num_people*count + (i + 1)){
				res[i] += num_people*count + (i + 1);
				candies -= num_people*count + (i + 1);
			}else{
				res[i] += candies;
				break;
			}
		}
		return res;
	}
}
