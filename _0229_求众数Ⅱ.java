package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0229_求众数Ⅱ {

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
//        首先可以明确的一点是，这样的元素可能有0个、1个、或者2个，再没有别的情况了. 
//        然后，求众数I 里的 Boyer-Moore 算法思路在这里依然可用，但需要些改动：
//        1) 满足条件的元素最多有两个，那么需要两组变量. count, major变成了
//           count1, major1; count2, major2;
//        2) 选出的两个元素，需要验证它们的出现次数是否真的满足条件.
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