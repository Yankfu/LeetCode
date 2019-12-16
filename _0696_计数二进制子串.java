package com.LeetCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class _0696_计数二进制子串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBinarySubstrings("000111000"));
	}

	public static int countBinarySubstrings(String s) {
		char[] ch = s.toCharArray();
		int len = s.length();
		int reasult = 0;
		int[] temp_chang = new int[len];
		int[] temp_shang = new int[len];
		for (int i = 0; i < len; i++) {
			if (i == 0) {
				temp_chang[i] = 1;
			} else if (ch[i] == ch[i - 1]) {
				temp_chang[i] = temp_chang[i - 1] + 1;
				temp_shang[i] = temp_shang[i - 1];
			} else if (ch[i] != ch[i - 1]) {
				temp_shang[i] = temp_chang[i - 1];
				temp_chang[i] = 1;
			}
		}
//        for(int i=0;i<len;i++) {
//        	System.out.print(temp_chang[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<len;i++) {
//        	System.out.print(temp_shang[i]+" ");
//        }
		for (int i = 0; i < len; i++) {
			if (i == 0) {

			} else {
				if (i == len - 1 && temp_chang[i] != 1) {
					reasult = reasult + (temp_shang[i] > temp_chang[i] ? temp_chang[i] : temp_shang[i]);
				} else if (temp_chang[i] > temp_chang[i - 1] && temp_chang[i] != 1
						&& temp_chang[i] > temp_chang[i + 1]) {
					reasult = reasult + (temp_shang[i] > temp_chang[i] ? temp_chang[i] : temp_shang[i]);
				} else if (i == len - 1 && temp_chang[i] == 1) {
					reasult++;
				} else if (temp_chang[i] == 1 && temp_chang[i + 1] == 1) {
					reasult++;
				}
			}
		}
		return reasult;
	}
}
