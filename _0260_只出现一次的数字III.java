package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/25 下午9:34
 * @Version 1.0
 */
public class _0260_只出现一次的数字III {
	public static void main(String[] args) {

	}
	public int[] singleNumber(int[] nums) {
		int[] res = new int[2];                             //结果集
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			if (map.get(num) == null) {                     //如果是空意思是新碰到的
				map.put(num, 1);                            //放进去然后value设置成1
			} else {                                        //其他情况（遇到过一次不是空）
				map.put(num, 2);                            //重新放置，覆盖之前的value值
			}
		}
		int i = 0;
		for (Integer temp : map.keySet()) {                 //通过key遍历
			if (map.get(temp) == 1) {                       //如果value等于1就添加到结果集
				res[i++] = temp;
			}
		}
		return res;
	}
	public static int[] searchTwoUique2(int[] nums) {
		int[] res = new int[2];

		//全部异或，确定两个不相同的数的异或值，异或可以看成不带进位的加法
		int XOR = 0;
		for(int num:nums){
			XOR = XOR^num;
		}

		//从低位确定最小的1，1^0=1  0^1=1 这样就可以把原数组分成两部分，一部分是目标1和另外在index处为1的，另一部分是目标2和其他的
		int index = 0;
		while(((XOR & 1) == 0) && index < 32) {
			XOR >>= 1;
			index++;
		}

		//根据确定的分组异或即最终答案
		for(int num:nums){
			if(((num >> index) & 1) == 1){
				res[0] = res[0]^num;
			}else{
				res[1] = res[1]^num;
			}
		}

		return res;
	}
}
