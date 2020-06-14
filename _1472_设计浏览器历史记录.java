package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/14 8:07
 */
public class _1472_设计浏览器历史记录 {
    //设计浏览器历史记录
    /**
     * Your BrowserHistory object will be instantiated and called as such:
     * BrowserHistory obj = new BrowserHistory(homepage);
     * obj.visit(url);
     * String param_2 = obj.back(steps);
     * String param_3 = obj.forward(steps);
     */
    static class BrowserHistory {
        List<String> list;
        int index;
        public BrowserHistory(String homepage) {
            list = new ArrayList<>();
            list.add(homepage);
            index = 0;
        }

        public void visit(String url) {
//            System.out.println("visit:  ");
//            System.out.print(list);
//            System.out.println("   "+index+"  visit:"+url);
            if (list.size() == 0){
                list.add(url);
                index = 0;
                return;
            }
            if (index != list.size()-1){
                List<String> temp = list.subList(index+1,list.size());
                list.removeAll(temp);
            }
            list.add(url);
            index = list.size()-1;
        }

        public String back(int steps) {
//            System.out.println("back:  ");
//            System.out.print(list);
//            System.out.println("   "+index);
            index -= steps;
            if (index < 0){
                index = 0;
//                System.out.println(list.get(0));
                return list.get(0);
            }
//            System.out.println(list.get(index));
            return list.get(index);
        }

        public String forward(int steps) {
//            System.out.println("forward:  ");
//            System.out.print(list);
//            System.out.println("   "+index);
            index += steps;
            if (index >= list.size()){
                index = list.size()-1;
//                System.out.println(list.get(list.size()-1)+" "+index);
                return list.get(list.size()-1);
            }
//            System.out.println(list.get(index));
            return list.get(index);
        }
    }
}
