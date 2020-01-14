package com.LeetCode;

import java.util.Random;

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
	private int[][] juZhen;
    Random r = new Random();
    private int num;
    private int row;
    private int col;
	public Solution519(int n_rows, int n_cols) {
        this.row = n_rows;
        this.col = n_cols;
		juZhen = new int[n_rows][n_cols];
        num = n_rows*n_cols;
    }
    
    public int[] flip() {
        int[] res=new int[2];
        while(true) {
        	int a = r.nextInt(num);
            if(a<row) {
            	res[0]=0;
            	res[1]=a;
            	if(juZhen[res[0]][res[1]]==1) {
            		continue;
            	}else {
            		juZhen[res[0]][res[1]]=1;
            		break;
            	}
            }else {
            	res[0]=a/row;
            	res[1]=a%row;
            	if(juZhen[res[0]][res[1]]==1) {
            		continue;
            	}else {
            		juZhen[res[0]][res[1]]=1;
            		break;
            	}
            }
        }
        return res;
    }
    
    public void reset() {
        
    }
}