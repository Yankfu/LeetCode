package com.LeetCode;

import java.util.Stack;

public class _0682_棒球比赛{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ops= {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(ops));
	}

//	public static int calPoints(String[] ops) {
//		int result=0;
//		int pre=0;
//		int predepre=0;
//		int predepredepre=0;
//		for(String op : ops)
//		{
//			char a=op.charAt(0);
//			if(a=='+')
//			{
//				result=result+pre+predepre;
//				int temp_pre=pre;
//				pre=pre+predepre;
//				predepredepre=predepre;
//				predepre=temp_pre;
//				
//			}
//			else if(a=='D')
//			{
//				result=result+pre+pre;
//				predepredepre=predepre;
//				predepre=pre;
//				pre=pre+pre;
//			}
//			else if(a=='C')
//			{
//				result=result-pre;
//				pre=predepre;
//				predepre=predepredepre;
//			}//�������ȡ����һ�ֵ÷ֵ�����¾ͻ�������¼����Ŀ��ܣ����Բ���������
//			else
//			{
//				int fen=Integer.parseInt( op );
//				predepredepre=predepre;
//				predepre=pre;
//				pre=fen;
//				result+=pre;
//			}
////			System.out.println(result+" "+pre+" "+predepre+" "+predepredepre);
//		}
//		return result;
//  }
	public static int calPoints(String[] ops) {
		int result=0;
		Stack<Integer> st=new Stack();
		for(String op : ops)
		{
			char a=op.charAt(0);
			if(a=='+')
			{
				int temp=st.pop();
				int fen=temp+st.peek();
				st.push(temp);
				st.push(fen);
				result+=st.peek();
			}
			else if(a=='D')
			{
				st.push(st.peek()*2);
				result+=st.peek();
			}
			else if(a=='C')
			{
				result-=st.peek();
				st.pop();
			}//�������ȡ����һ�ֵ÷ֵ�����¾ͻ�������¼����Ŀ��ܣ����Բ���������
			else
			{
				int fen=Integer.parseInt( op );//�ַ���ת����
				st.push(fen);
				result+=st.peek();
			}
		}
		return result;
    }
}
