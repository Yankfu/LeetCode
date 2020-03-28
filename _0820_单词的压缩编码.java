package com.LeetCode;

import java.util.Arrays;

public class _0820_单词的压缩编码 {
    public static void main(String[] args) {

    }
    public static int minimumLengthEncoding(String[] words) {
        int res = 0;
        Trie trie = new Trie();
        Arrays.sort(words,(s1,s2) -> s2.length() - s1.length());
        for (String word:words){
            res += trie.insert(word);
        }
        return res;
    }

    static class Trie{
        TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public int insert(String word){
            TrieNode cur = root;
            boolean isNew = false;
            for (int i = word.length()-1; i >=0; i--) {
                int c = word.charAt(i)-'a';
                if (cur.children[c] == null){
                    isNew = true;
                    cur.children[c] = new TrieNode();
                }
                cur = cur.children[c];
            }
            return isNew?word.length()+1:0;
        }
    }

    static class TrieNode{
        char val;
        TrieNode[] children = new TrieNode[26];
        public TrieNode(){

        }
    }
}

