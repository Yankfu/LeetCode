package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/9 21:20
 */
public class _0208_实现Trie前缀树 {
    class Trie {

        private Trie[] next;
        private boolean isEnd;

        /** Initialize your data structure here. */
        public Trie() {
            next = new Trie[26];
            isEnd = false;
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            //从根节点开始插入
            Trie temp = this;
            for (int i = 0; i < word.length(); i++) {
                int t = word.charAt(i)-'a';
                if (temp.next[t] == null){
                    temp.next[t] = new Trie();
                }
                temp = temp.next[t];
            }
            temp.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie temp = this;
            for (int i = 0; i < word.length(); i++) {
                int t = word.charAt(i)-'a';
                if (temp.next[t] == null){
                    return false;
                }
                temp = temp.next[t];
            }
            return temp.isEnd;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            //这里还是搜索，不过不用管isEnd
            Trie temp = this;
            for (int i = 0; i < prefix.length(); i++) {
                int t = prefix.charAt(i)-'a';
                if (temp.next[t] == null){
                    return false;
                }
                temp = temp.next[t];
            }
            return true;
        }
    }
}
