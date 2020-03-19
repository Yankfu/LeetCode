package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _1352_最后K个数的乘积 {
    public static void main(String[] args) {
        ProductOfNumbers po = new ProductOfNumbers();
        po.add(3);
        po.add(0);
        po.add(2);
        po.add(5);
        po.add(4);
        System.out.println(po.getProduct(2));
        System.out.println(po.getProduct(3));
        System.out.println(po.getProduct(4));
        po.add(8);
        System.out.println(po.getProduct(2));
    }
    static class ProductOfNumbers {

        public ProductOfNumbers() {

        }
        List<Integer> li = new ArrayList<>();
        public void add(int num) {
            li.add(num);
        }

        public int getProduct(int k) {
            int res = 1;
            for(int i = li.size()-1;i>(li.size()-k-1);i--){
                res = res * li.get(i);
            }
            return res;
        }
    }
}

