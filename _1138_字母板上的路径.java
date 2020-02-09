package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _1138_字母板上的路径 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_0000_test te=new _0000_test();
		String target="ez";
		System.out.println("���ƻ��Ǵ�������  "+alphabetBoardPath(target));
	}

	public static String alphabetBoardPath(String target) {
		char[] a=target.toCharArray();
		int j;
		int k;
		int[][] l=new int[2][2]; 
		l[0][0] = 0;//ǰһ���ĺ�����
		l[0][1] = 0;//ǰһ����������
		l[1][0] = 0;//ǰһ���ĺ�����
		l[1][1] = 0;//ǰһ����������
		List<String> b=new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
				l[0][0] = l[1][0];//ǰһ���ĺ�����
				l[0][1] = l[1][1];//ǰһ����������
				l[1][0] = (a[i] - 97) % 5;//����ĺ�����
				l[1][1] = (a[i] - 97) / 5;//�����������
				if ((l[1][0]==0 && l[1][1]==5) && (l[0][0]>0)) {
					j = l[1][0] - l[0][0];//�����߼���
					k = l[1][1] - l[0][1]-1;//�����߼���
					while (k > 0) {
						k--;
						b.add("D");
					}
					while (k < 0) {
						k++;
						b.add("U");
					}
					while (j > 0) {
						j--;
						b.add("R");
					}
					while (j < 0) {
						j++;
						b.add("L");
					}
					b.add("D");
					if (j == 0 && k == 0) {
						b.add("!");
					} 
				} 
				else
				{
					j=l[1][0]-l[0][0];
					k=l[1][1]-l[0][1];
					while(k > 0) {
						k--;
						b.add("D");
					}
					while(k < 0) {
						k++;
						b.add("U");
					}
					while (j > 0) {
						j--;
						b.add("R");
					}
					while(j < 0) {
						j++;
						b.add("L");
					}
					if (j == 0 && k == 0) {
						b.add("!");
					} 
				}
		}
		//�ڴ���z��ʱ��ǵ����⴦���£���Ϊ����ֱ�ӵ����Ҫ�ո��䣬�Ժ���д��
		
		String str= String.join("",b);
		return str;
    }

}
