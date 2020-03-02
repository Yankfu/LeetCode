package com.LeetCode;

public class _1299_将每个元素替换为右侧最大元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {17,1};
		arr=replaceElements(arr);
		for(int a:arr) {
			System.out.print(a+"  ");
		}
	}
	public static int[] replaceElements(int[] arr) {
        if(arr.length==1) {
        	arr[0]=-1;
        	return arr;
        }else if(arr.length==2) {
        	arr[0]=arr[1];
        	arr[1]=-1;
        	return arr;
        }
        for(int i=0;i<arr.length-2;i++) {
        	int best=Integer.MIN_VALUE;
        	for(int j=i+1;j<arr.length;j++) {
        		//System.out.print(arr[j]+"  ");
        		if(arr[j]>best) {
        			best=arr[j];
        		}
        	}
        	//System.out.println();
        	arr[i]=best;
        }
        arr[arr.length-2]=arr[arr.length-1];
    	arr[arr.length-1]=-1;
		return arr;
    }
}
