package com.bit.loop;

public class ArithmeticSequences11 {
	public static void main(String[] args) {
		int sum = 0, imax = 100;
		String str = "";
		for (int i = 1; i <= imax; i++) {
			if (i % 2 == 0) {
				if (i != imax) {
					str += i + "+";
				} else {
					str += i + "\n=";
				}
				sum += i;
			} else {
				sum -= i;
				str += i + "-";
			}
		}
		System.out.println(str+sum);
	}
}
