package com.LeetCode;

public class _test {

	public static void main(String[] args) {
		try {
			System.out.println("a");
			int i=100/0;
			System.out.println(i);
		}catch(RuntimeException e) {
			System.out.println("RuntimeException");
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Finally");
		}
		System.out.println("计算完应该会打印这里，不过给的答案不打印");
	}
}
