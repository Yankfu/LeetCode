package com.LeetCode;

public class _0605_种花问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1,0,0,0,1};
		int n = 2;
		System.out.println(canPlaceFlowers(flowerbed,n));
	}

	/**
	 * 要统计的是含有三个0的问题
	 *
	 * @param flowerbed
	 * @param n
	 * @return
	 */
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int a = 0;
		int b = 0;
		int c = flowerbed[0];
		for (int i = 1; i < flowerbed.length; i++) {
			a = b;
			b = c;
			c = flowerbed[i];
			//如果有这种空地就“种”一朵花
			if (a == 0 && b == 0 && c == 0){
				flowerbed[i-1] = 1;
				b = 1;
				n--;
			}
			if (n == 0){
				return true;
			}
		}
		if (b == 0 && c == 0){
			n--;
		}
		if (n<=0){
			return true;
		}
		return false;
    }
}
