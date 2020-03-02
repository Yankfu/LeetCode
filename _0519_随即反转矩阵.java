package com.LeetCode;

import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class _0519_随即反转矩阵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * 维护成一维数组
 * 每次拾取的时候检索是否冲突，如果冲突重新拾取
 * 清空的时候实际清空的是一维数组
 */
class Solution519 {
    Random r = new Random();
    Set<Integer> set = new HashSet<>();
    int row;
    int col;
    int total;
    int count = 0;
	public Solution519(int n_rows, int n_cols) {
        row = n_rows;
        col = n_cols;
        total = row*col;
    }

    public int[] flip() {
		if(count == total){

		}
        int[] res = new int[2];
        int target = r.nextInt(total+1);

        while(set.contains(target)){
        	target = r.nextInt(total+1);
		}

        res[0] = target/col;
        res[1] = target%col;
        count++;
        return res;
    }
    
    public void reset() {
        set.clear();
    }
}