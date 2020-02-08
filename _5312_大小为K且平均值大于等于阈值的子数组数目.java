package com.LeetCode;

public class _5312_大小为K且平均值大于等于阈值的子数组数目 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.print(numOfSubarrays(arr,k,threshold));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        if(k>arr.length){
            return 0;
        }
        int res = 0;
        int first = 0; //上一个要减去的数字
        int last = k; //下一个要加的数字
        int temp=0;
        int len = k;
        while(k>0){
            temp = temp+arr[k-1];
            k--;
        }
//        System.out.println(temp+" "+len);
        do{
            if(temp/len>=threshold){
                res++;
            }
            if(first<arr.length){
                temp = temp - arr[first];
                first++;
            }else{
                break;
            }
            if(last<arr.length) {
                temp = temp + arr[last];
                last++;
            }else{
                break;
            }
        }while(first<=arr.length-k);
        return res;
    }
}
