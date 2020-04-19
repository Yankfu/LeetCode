package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/19 21:24
 */
public class _1410_HTML实体解析器 {
    // HTML 实体解析器
    public static String entityParser(String text) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&gt;", ">");
        map.put("&amp;", "&");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        char[] ch = text.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '&') {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ch[i++]);
                while (ch[i] != ';') {
                    sb2.append(ch[i++]);
                }
                sb2.append(ch[i]);
                if (map.get(sb2.toString()) != null) {
                    sb.append(map.get(sb2.toString()));
                } else {
                    sb.append(sb2.toString());
                }
            } else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
