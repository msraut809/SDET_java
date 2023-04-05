package org.Day2;

public class SwapWUThirdV {
	public static void main(String[] args) {
		int x=10, y=20;
		System.out.println("X="+x);
		System.out.println("Y="+y);

		x=x+y;   // x=10+20=30
		y=x-y;   // y=30-20=10
		x=x-y;   // x=30-10=20

		System.out.println("X1="+x);
		System.out.println("Y1="+y);

	}
}
