package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/15 22:54
 */
public class _0417_太平洋大西洋水流问题 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5,6}};
        List<List<Integer>> res = pacificAtlantic(matrix);
        for(List<Integer> temp:res){
            System.out.print(temp);
        }
    }
    //从左上给中间走  判断是否能走到
    //从右下给中间走  判断是否能走到
    //统计两个都为true的

    static int[][] newXY = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
    };

    public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> lists = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length==0)
            return lists;
        Boolean[][] canPacific = new Boolean[matrix.length][matrix[0].length];
        Boolean[][] canAtlantic = new Boolean[matrix.length][matrix[0].length];
        Stack<ArrayList<Integer>> dpPac = new Stack<>();
        Stack<ArrayList<Integer>> dpAtl = new Stack<>();
        for (int i = 0; i < canPacific.length; i++) {
            for (int j = 0; j < canAtlantic[0].length; j++) {
                if (i == 0 || j == 0){
                    canPacific[i][j] = true;
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    dpPac.push(list);
                } else {
                    canPacific[i][j] = false;
                }

                if (i == canAtlantic.length-1 || j == canAtlantic[0].length-1){
                    canAtlantic[i][j] = true;
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    dpAtl.push(list);
                }else {
                    canAtlantic[i][j] = false;
                }

            }
        }

//        for (int i = 0; i < canAtlantic.length; i++) {
//            for (int j = 0; j < canAtlantic[0].length; j++) {
//                System.out.print(canAtlantic[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < canAtlantic.length; i++) {
//            for (int j = 0; j < canAtlantic[0].length; j++) {
//                System.out.print(canPacific[i][j]+" ");
//            }
//            System.out.println();
//        }

        help(dpAtl,canAtlantic,matrix);
        help(dpPac,canPacific,matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (canPacific[i][j] && canAtlantic[i][j]){
                    ArrayList list = new ArrayList();
                    list.add(i);
                    list.add(j);
                    lists.add(list);
                }
            }
        }

        return lists;
    }

    public static void help(Stack<ArrayList<Integer>> stack,Boolean[][] can,int[][] matrix){
        while (!stack.isEmpty()){
            ArrayList<Integer> list = stack.pop();
            /*
            四个方向遍历
            1.不能越界
            2.如果是true就进行下一轮
            3.如果是false判断是否matrix[i][j]大于方向上的数值，如果是的话就修改true或者false然后将其入栈
            */
            for (int i = 0; i < 4; i++) {
                int newX = list.get(0) + newXY[i][0];
                int newY = list.get(1) + newXY[i][1];
                if (newX >= matrix.length || newX < 0 || newY >= matrix[0].length || newY < 0){
                    continue;
                }
                if (can[newX][newY]){
                    continue;
                }
                if (matrix[list.get(0)][list.get(1)] <= matrix[newX][newY]){
                    can[newX][newY] = true;
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(newX);
                    temp.add(newY);
                    stack.push(temp);
                }
            }
        }
    }

}
