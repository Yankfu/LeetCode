package com.LeetCode;

import java.util.Arrays;

public class _0517_超级洗衣机 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] machines={1,0,5};
		System.out.println(findMinMoves(machines));
	}

	public static int findMinMoves(int[] machines) {
        int max=Arrays.stream(machines).max().getAsInt();
        int sum=0;
        for(int num:machines){
            sum+=num;
        }
        if(sum%machines.length!=0)
        {
        	return -1;
        }
        int pingjun=sum/machines.length;
        
        int[] newNum=new int[machines.length];
        int i=0;
        for(int num:machines)
        {
            newNum[i]=num-pingjun;
            i++;
        }
        int temp=0;
        
        int best=0;
        
        for(int num:newNum)
        {
            if(num>best)
            {
            	best=num;
            }
        }
        
        for(int num:newNum)
        {
            temp+=num;
            if(Math.abs(temp)>best)
            {
                best=Math.abs(temp);
            }
        }
        return best;
    }
}