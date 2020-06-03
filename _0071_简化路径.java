package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/3 21:55
 */
public class _0071_简化路径 {

    public static void main(String[] args) {
        String path = "/";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        if (path.length() == 0){
            return "";
        }
        String[] str = path.split("/+");
        Stack<String> stack = new Stack<>();
        for (int i = 1; i < str.length; i++) {
            if (str[i].equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }else {
                    continue;
                }
            }else if (str[i].equals(".")){
                continue;
            }else {
                stack.push(str[i]);
            }
        }
        List<String> list = new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        if (list.size() == 0){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append("/").append(list.get(i));
        }
        return sb.toString();
    }
}
