package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/9 22:15
 */
public class _0677_键值映射 {
    class MapSum {
        Trie root;
        /** Initialize your data structure here. */
        public MapSum() {
            root = new Trie();
        }

        public void insert(String key, int val) {
            root.insert(key, val);
        }

        public int sum(String prefix) {
            //先移动到最后一个字母的位置
            Trie curPos = root;
            for (int i = 0; i < prefix.length(); i++) {
                int t = prefix.charAt(i)-'a';
                //如果没有下一个节点，说明有都没有，直接返回0就行
                if (curPos.next[t] == null){
                    return 0;
                }
                curPos = curPos.next[t];
            }
            return count(curPos);
        }

        //返回本节点加所有孩子节点的值
        //如果没有孩子直接返回本节点的值
        public int count(Trie tempRoot){
            int res = 0;
            for (int i = 0; i < tempRoot.next.length; i++) {
                if (tempRoot.next[i] == null){
                    continue;
                }
//                else if ( tempRoot.next[i].isEnd ){
//                    res+=tempRoot.next[i].value;
//                }
                else {
                    res += count(tempRoot.next[i]);
                }
            }
            return tempRoot.value + res;
        }
    }

    class Trie {

        //属性
        //子节点
        public Trie[] next;
        //是不是尾节点
        public boolean isEnd;
        //键值
        public int value;

        //方法
        //构造方法
        public Trie(){
            next = new Trie[26];
            isEnd = false;
            value = 0;
        }

        public void insert(String s,int n){
            //默认本节点是根节点，所以从本节点开始插入
            Trie curPos = this;
            for (int i = 0; i < s.length(); i++) {
                //这是第i个字母的ascii
                int t = s.charAt(i)-'a';
                //如果没有就新建一个
                //这里的val默认为0,构造方法里写了
                if (curPos.next[t] == null){
                    curPos.next[t] = new Trie();
                }
                //移动到下一个节点再次建树
                curPos.isEnd = false;
                curPos = curPos.next[t];
            }
            //这里一个前缀就插入完成了，然后要修改val值
            curPos.value = n;
            //这里判断是否是最后一个
            //遍历数组，如果都是空说明是最后一个
            for (Trie temp:curPos.next){
                if (temp != null){
                    return;
                }
            }
            curPos.isEnd = true;
        }
    }
}
