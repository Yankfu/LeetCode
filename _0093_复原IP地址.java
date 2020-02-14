package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0093_复原IP地址 {
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        res = restoreIpAddresses("25525511135");
        for(String str:res){
            System.out.println(str);
        }
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int a = 1;a<4;a++){
            for(int b = 1;b<4;b++){
                for(int c = 1;c<4;c++){
                    for(int d = 1;d<4;d++){
                        if(a+b+c+d == s.length()){
                            int n1 = Integer.parseInt(s.substring(0,a));
                            int n2 = Integer.parseInt(s.substring(a,a+b));
                            int n3 = Integer.parseInt(s.substring(a+b,a+b+c));
                            int n4 = Integer.parseInt(s.substring(a+b+c));
                            if(n1<=255 && n2<=255 && n3<=255 && n4<=255){
                                sb.append(n1).append('.').append(n2).append('.').append(n3).append('.').append(n4);
                            }
                            if(sb.length() == s.length()+3){
                                list.add(sb.toString());
                            }
                            sb.delete(0,sb.length());
                        }
                    }
                }
            }
        }
        return list;
    }
}
