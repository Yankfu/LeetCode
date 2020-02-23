package com.LeetCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/23 上午10:31
 * @Version 1.0
 */
public class _5169_日期之间隔几天 {
	private static int getTermDays2() throws Exception{
		String sEndDate = "2018-03-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		Date date2 = sdf.parse(sEndDate);
		long days = (date2.getTime() - date1.getTime()) / (24*3600*1000);
		long yushu = (date2.getTime() - date1.getTime()) % (24*3600*1000);

		System.out.println("days:" + days + ",yushu:" + yushu);

		//规整方法1
		date1.setHours(0);
		date1.setMinutes(0);
		date1.setSeconds(0);
		long days2 = (date2.getTime() - date1.getTime()) / (24*3600*1000);
		long yushu2 = (date2.getTime() - date1.getTime()) % (24*3600*1000);

		System.out.println("days2:" + days2 + ",yushu2:" + yushu2);

		//规整方法2
		String sdate1 = sdf.format(date1);
		date1 = sdf.parse(sdate1);

		long days3 = (date2.getTime() - date1.getTime()) / (24*3600*1000);
		long yushu3 = (date2.getTime() - date1.getTime()) % (24*3600*1000);

		System.out.println("days3:" + days3 + ",yushu3:" + yushu3);

		return (int)days;
	}

	public static void main(String[] args){
//		try {
//			getTermDays2();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		String date1 = "2019-06-29";
		String date2 = "2019-06-30";
		System.out.println(daysBetweenDates(date1,date2));
	}
	public static int daysBetweenDates(String date1, String date2){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date12 = null;
		try {
			date12 = sdf.parse(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date22 = null;
		try {
			date22 = sdf.parse(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long days = (date12.getTime() - date22.getTime()) / (24*3600*1000);
		return Math.abs((int)days);
	}
}
