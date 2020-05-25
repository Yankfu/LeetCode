package com.LeetCode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/25 10:00
 */
public class _146_LRU缓存机制 {
    public static void main(String[] args) {

    }
    class LRUCache extends LinkedHashMap<Integer,Integer> {
        int capacity;

        public LRUCache(int capacity) {
            super(capacity,0.75F,true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return super.getOrDefault(key,-1);
        }

        public void put(int key, int value) {
            super.put(key,value);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
            return size()>capacity;
        }
    }
}
