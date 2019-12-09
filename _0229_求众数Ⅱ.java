package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0229_求众数Ⅱ{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution so=new Solution();
		int[] nums= {1,2,3};
		System.out.println(so.majorityElement(nums));
	}

}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count_1;
        int count_2;
        int result_1=0;
        int result_2=0;
        List<Integer> ret = new ArrayList<>();
        if (nums.length>=1) {
        	result_1=nums[0];
        	result_2=nums[0];
        	count_1=0;
        	count_2=0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == result_1) {
					count_1++;
				} else if (nums[i] == result_2) {
					count_2++;
				} else if (count_1 == 0) {
					result_1 = nums[i];
					count_1 = 1;
				} else if (count_2 == 0) {
					result_2 = nums[i];
					count_2 = 1;
				} else{
					count_1--;
					count_2--;
				}
			} 
			count_1=0;
			count_2=0;
			for(int i=0;i<nums.length;i++)
			{
				if(result_1==nums[i])
				{
					count_1++;
				}
				if(result_2==nums[i])
				{
					count_2++;
				}
			}
			if(count_1>nums.length/3)
			{
				ret.add(result_1);
			}
			if(result_1!=result_2 && count_2>nums.length/3)
			{
				ret.add(result_2);
			}
			return ret;
		}
        else
        {
        	return ret;
        }
    }
}

//class Solution {
//    public List<Integer> majorityElement(int[] nums) {
//        /**
//        ���ȿ�����ȷ��һ���ǣ�������Ԫ�ؿ�����0����1��������2������û�б�������. 
//        Ȼ��������I ��� Boyer-Moore �㷨˼·��������Ȼ���ã�����ҪЩ�Ķ���
//        1) ����������Ԫ���������������ô��Ҫ�������. count, major�����
//           count1, major1; count2, major2;
//        2) ѡ��������Ԫ�أ���Ҫ��֤���ǵĳ��ִ����Ƿ������������.
//        **/
//        List<Integer> ret = new ArrayList<>();
//        if(nums.length < 1) return ret;
//        int count1 = 0, count2 = 0;
//        int major1 = nums[0], major2 = nums[0];
//        
//        for(int num : nums) {
//            if(num == major1)
//                count1++;
//            else if(num == major2)
//                count2++;
//            else if(count1 == 0) {
//                count1 = 1;
//                major1 = num;
//            }
//            else if(count2 == 0) {
//                count2 = 1;
//                major2 = num;
//            }
//            else {
//                count1--;
//                count2--;
//            }
//        }
//        count1 = 0;
//        count2 = 0;
//        for(int num : nums) {
//            if(num == major1)
//                count1++;
//            else if(num == major2)
//                count2++;
//        }
//        if(count1 > nums.length/3)
//            ret.add(major1);
//        if(major1 != major2 && count2 > nums.length/3)
//            ret.add(major2);
//        return ret;
//    }
//}