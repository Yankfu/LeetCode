package com.LeetCode;

import java.util.HashMap;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/23 9:22
 */
public class _1487_保证文件名唯一 {
    //保证文件名唯一
    public String[] getFolderNames(String[] names) {
        HashMap<String,Integer> hasPut = new HashMap<>();
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            if (hasPut.containsKey(names[i])){
                //比较是否已经存在这个文件名，如果存在就去set里面查新生成的文件名是否冲突，不冲突就结束循环放到数组里面
                String temp = names[i] + "(" + hasPut.get(names[i])+")";
                hasPut.put(names[i],hasPut.get(names[i])+1);
                while (hasPut.containsKey(temp)){
                    temp = names[i] + "(" + hasPut.get(names[i])+")";
                    hasPut.put(names[i],hasPut.get(names[i])+1);
                }
                res[i] = temp;
                hasPut.put(temp,1);
            }else {
                res[i] = names[i];
                hasPut.put(names[i],1);
            }
        }
        return res;
    }
}
