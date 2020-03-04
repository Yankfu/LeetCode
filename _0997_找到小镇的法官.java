package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/4 下午11:42
 * @Version 1.0
 */
public class _0997_找到小镇的法官 {
	public static void main(String[] args) {

	}
	public static int findJudge(int N, int[][] trust) {
		int[] cnt = new int[N+1];//统计出入度
		for (int[] index : trust) {
			cnt[index[0]]--;//出度--
			cnt[index[1]]++;//入度++
		}
		for ( int i = 1; i <= N; i++ ) {
			if ( cnt[i] == N-1 ) return i;
		}
		return -1;
	}
}
