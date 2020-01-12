package com.LeetCode;

import java.util.Random;

public class _0478_在圆内随机生成点 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionCir sc=new SolutionCir(1,0,0);
		for(int i=0;i<100;i++) {
			double[] res =sc.randPoint();
			for(double d:res) {
				System.out.print(d+"  ");
			}
			System.out.println();
		}
	}
}
class SolutionCir {
    private double x;
    private double y;
    private double rad;
    public SolutionCir(double radius, double x_center, double y_center) {
        this.x=x_center;
        this.y=y_center;
        this.rad=radius;
    }
    
    public double[] randPoint() {
        double[] res = new double[2];
        while(true) {
        	double x = new Random().nextDouble();
            double y = new Random().nextDouble();
            x=(x-0.5)*rad*2;
            y=(y-0.5)*rad*2;
            if (Math.sqrt(Math.pow(x , 2) + Math.pow(y, 2)) <= rad)
                return new double[]{x+this.x, y+this.y};
        }
    }
}