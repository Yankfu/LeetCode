package com.LeetCode;

import java.util.Map;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/1 上午10:53
 * @Version 1.0
 */
public class _1366_通过投票对团队排名 {
	public static void main(String[] args) {
		String[] votes = {"WXYZ","XYZW"};
		System.out.println(rankTeams(votes));
	}
	public static String rankTeams(String[] votes) {
		StringBuilder sb  = new StringBuilder();
		int[] count = new int[26];
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < votes.length; j++) {
				count[i] += votes[j].indexOf((char)('A'+i));
			}
		}
		for(int a:count){
			System.out.print(a+" ");
		}
		return sb.toString();
	}
}
