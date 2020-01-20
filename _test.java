package com.LeetCode;
import java.awt.*;
import java.awt.event.InputEvent;
public class _test {

	public static void main(String[] args) throws AWTException {
		PointerInfo pinfo = MouseInfo.getPointerInfo();
		Point p = pinfo.getLocation();
		int x = (int) p.getX();
		int y = (int) p.getY();
		click(x,y);
	}
	public static void click(int x,int y) throws AWTException {
		Robot r = new Robot();
		r.delay(3000);
		r.mouseMove(x, y);
		for (int i = 0; i < 10000; i++) {
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.delay(50);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			r.delay(300);
		}
	}
}