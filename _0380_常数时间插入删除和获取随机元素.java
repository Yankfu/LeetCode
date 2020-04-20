package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/20 10:06
 */
public class  _0380_常数时间插入删除和获取随机元素 {
    public static void main(String[] args) {

    }
    class RandomizedSet {
        Random random;
        List<Integer> list;
        /** Initialize your data structure here. */
        public RandomizedSet() {
            random = new Random();
            list = new ArrayList<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == val) {
                    return false;
                }
            }
            list.add(val);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == val){
                    list.remove(i);
                    return true;
                }
            }
            return false;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}
