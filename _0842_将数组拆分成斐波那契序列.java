package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/20 上午11:03
 * @Version 1.0
 */
public class _0842_将数组拆分成斐波那契序列 {
	public static void main(String[] args) {
		String S = "3611537383985343591834441270352104793375145479938855071433500231900737525076071514982402115895535257195564161509167334647108949738176284385285234123461518508746752631120827113919550237703163294909";
		String s = "3611537383985343591834441270352104793375145479938855071433500231900737525076071514982402115895535257195564161509167334647108949738176284385285234123461518508746752631120827113919550237703163294909";
		System.out.println(splitIntoFibonacci(s));
	}
	public static List<Integer> splitIntoFibonacci(String S) {
		List<Integer> li = new ArrayList<>();
		if(S.length()<3){
			return li;
		}
		for(int i = 2;i<S.length() && i<=20;i++){ //长度小于7 2^32-1
			for (int j = 1; j < i; j++) {
				//根据分段把ab两个数提取出来
				Long a = Long.parseLong(S.substring(0,j));
				Long b = Long.parseLong(S.substring(j,i));
				li.add(a.intValue());
				li.add(b.intValue());
				if(a>=Integer.MAX_VALUE || b>=Integer.MAX_VALUE){
					li.clear();
					continue;
				}else if(nextLen(a.intValue())!=j || nextLen(b.intValue())!=(i-j)){
					li.clear();
					continue;
				}else if(add(a.intValue(),b.intValue(),S.substring(i),li)){
					return li;
				}
				li.clear();
			}
		}
		return li;
	}
	public static boolean add(int a,int b,String s,List<Integer> li){
		//执行加操作，然后进入递归
		if(s.length() == 0){
			return true;
		}
		int len = nextLen(a+b);
		Long c = 0L;
		if(len<=s.length()){
			c = Long.parseLong(s.substring(0,len));
			if(nextLen(c.intValue())!=len){
				return false;
			}
		} else{
			return false;
		}
		if(c>Integer.MAX_VALUE || a+b >Integer.MAX_VALUE){
			return false;
		}
		if(a+b == c.intValue()){
			li.add(c.intValue());
			return add(b,c.intValue(),s.substring(len),li);
		}else{

			return false;
		}
	}
	public static int nextLen(int num){
		if(num == 0){
			return 1;
		}
		int count = 0;
		while(num!=0){
			num = num/10;
			count++;
		}
		return count;
	}
}
