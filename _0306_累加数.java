package com.LeetCode;

public class _0306_累加数 {
    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("111"));
    }
    public static boolean isAdditiveNumber(String num) {
        if(num.length()<3){
            return false;
        }
        return backTrack(0,1,0,num);
    }
    //验证前两个数相加是否等于第三个数
    //等于的话
    public static boolean backTrack(int start,int hour,int min,String num){
        for(int i = hour;i<((num.length()*0.7)>10?10:num.length()*0.7);i++){
            for(int j = min;j<i;j++){
                if(add(Integer.parseInt(num.substring(0,j+1)),Integer.parseInt(num.substring(j+1,i+1)),num)){
                    return true;
                }
            }
        }
        return false;
    }
    //输入了两个数，现在就是要一直加到最后确保是正确的
    public static boolean add(int first,int last,String num){
        System.out.println("this is a: "+first+" this is b: "+last);
        int a = first;
        int b = last;
        num = num.substring(nextLen(a));
        num = num.substring(nextLen(b));
        int len = nextLen(a+b);
        if(len>num.length()){
            return false;
        }
        int c = Integer.parseInt(num.substring(0,len));
        num = num.substring(nextLen(c));
        while(num.length()>0){
            if(a+b == c){
                a=b;
                b=c;
                len = nextLen(a+b);
                if(len>num.length()){
                    return false;
                }else{
                    c = Integer.parseInt(num.substring(0,len));
                    num = num.substring(nextLen(c));
                }
            }else{
                return false;
            }
        }
        if(a+b == c){
            return true;
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

class Solution_306 {
    public boolean isAdditiveNumber(String num) {
        return backtrack(num,0,0,0,0);//第一个0：从num的0号位置开始计算
        //第二个0：前面两个数的总和初始为0
        //第三个0：前面一个数的值初始为0
        //第四个0：当前搜索的数字是第几个数（需要先找到前两个再对第三个及以后进行分析，所以需要这个k）
    }
    private boolean backtrack(String num,int index,long presum,long prenum,int k)
    {
        if(k>2&&index>=num.length()) return true;//index是当前数字的开始处
        for(int len=1;len+index<=num.length();len++) {//len是当前数字的长度
            long f=isSum(presum,num,index,index+len-1,k) ;//presum是之前二者的和，（num index，index+len-1）是当前数字
            if(f>=0){
                if (backtrack(num,index+len,f+prenum,f,k+1)) return true;
                //f>0时表示当前匹配成功进入递归，此时f变成prenum，f+prenum变成当前数的前两个数字之和（一开始的prenum就是f的前一个数）
            }
        }
        return false;
    }
    private long isSum(long sum,String num,int l,int h,int k) {
        if(num.charAt(l)=='0'&&l<h) return -1;
        long s=0;
        while(l<=h)
        {
            s=s*10+num.charAt(l)-'0';
            l++;
        }//num的从l到h的这一段字符串对应的数值
        if(k<2) return s;//前两个数直接返回isSum=1的情况
        return sum==s?s:-1;//后面就需判断二者和是否为sum（之前两个数二者的和）
    }
}