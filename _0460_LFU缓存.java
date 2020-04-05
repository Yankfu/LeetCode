package com.LeetCode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/5 20:16
 */
public class _0460_LFU缓存 {
    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(2);
    }


    static class LFUCache {

        Map<Integer,Node> cache;
        Map<Integer, LinkedHashSet<Node>> freqMap;
        int size;
        int capacity;
        int min;

        public LFUCache(int capacity) {
            cache = new HashMap<>(capacity);
            freqMap = new HashMap<>();
            this.capacity = capacity;
        }

        public int get(int key) {
            Node node = cache.get(key);
            if (node == null) {
                return -1;
            }
            freqInc(node);
            return node.value;
        }

        public void put(int key, int value) {
            if (capacity == 0) {
                return;
            }
            Node node = cache.get(key);
            if (node != null) {
                node.value = value;
                freqInc(node);
            } else {
                if (size == capacity) {
                    Node deaNode = removeNode();
                    cache.remove(deaNode.key);
                    size--;
                }
                Node newNode = new Node(key,value);
                cache.put(key,newNode);
                addNode(newNode);
                size++;
            }
        }

        public void freqInc(Node node) {
            int freq = node.freq;
            LinkedHashSet<Node> set = freqMap.get(freq);
            set.remove(node);
            if (freq == min && set.size() == 0){
                min = freq + 1;
            }
            node.freq++;
            LinkedHashSet<Node> newSet = freqMap.get(freq+1);
            if (newSet == null) {
                newSet = new LinkedHashSet<>();
                freqMap.put(freq+1,newSet);
            }
            newSet.add(node);
        }

        public void addNode(Node node){
            LinkedHashSet<Node> set = freqMap.get(1);
            if (set == null) {
                set = new LinkedHashSet<>();
                freqMap.put(1,set);
            }
            set.add(node);
            min = 1;
        }

        public Node removeNode(){
            LinkedHashSet<Node> set = freqMap.get(min);
            Node deadNode = set.iterator().next();
            set.remove(deadNode);
            return deadNode;
        }


    }

    static class Node {
        int key;
        int value;
        int freq = 1;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
