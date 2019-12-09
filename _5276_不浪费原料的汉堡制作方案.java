package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _5276_不浪费原料的汉堡制作方案 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numOfBurgers(4,2));
	}
	public static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
		List<Integer> result=new ArrayList<Integer>();
		if(tomatoSlices < cheeseSlices)
		{
			return result;
		}
		else if(tomatoSlices == 0 && cheeseSlices == 0)
		{
			result.add(0);
			result.add(0);
			return result;
		}
		else if(tomatoSlices == 0 && cheeseSlices != 0)
		{
			return result;
		}
		else if(cheeseSlices == 0 && tomatoSlices != 0)
		{
			return result;
		}
		else if(tomatoSlices>(cheeseSlices*4))
		{
			return result;
		}
		else if(tomatoSlices-(cheeseSlices*2) < 0)
		{
			return result;
		}
		else if((tomatoSlices-(cheeseSlices*2) > 0) && (tomatoSlices-(cheeseSlices*2))%2==1)
		{
			return result;
		}
		else
		{
			int ju=(tomatoSlices-(cheeseSlices*2))/2;
			int huang=cheeseSlices-ju;
			result.add(ju);
			result.add(huang);
		}
		return result;
    }
}
