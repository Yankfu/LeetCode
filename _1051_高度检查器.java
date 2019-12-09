package com.LeetCode;

import java.util.Arrays;

public class _1051_高度检查器 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] heights= {1,1,4,2,1,3};
		System.out.println(heightChecker(heights));
	}

	/*
	 * ��ʵ�Ǹ���ӣ��ȵ��������ٶȡ�
	 * ����        1 1 4 2 1 3
	 *�ź���     1 1 1 2 3 4
	 *�����Ƚ���������������û����ȷ��λ���ϣ�������򵥵ķ������ǰ����ź�������鰤���Ƚϲ�������
	 */
	public static int heightChecker(int[] heights) {
        int count=0;
        int[] right=heights.clone();
        Arrays.parallelSort(right);
        for(int i=0;i<heights.length;i++)
        {
        	if(heights[i]!=right[i])
        	{
        		count++;
        	}
        }
        return count;
    }
}
