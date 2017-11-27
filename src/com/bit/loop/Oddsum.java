package com.bit.loop;

public class Oddsum {

	public static void main(String[] args) {
		int odd = 0, sum = 0;
		String str = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum -= i;
				if (i != 99) {
					str += i + "-";
				} else {
					str += i + "\n=";
				}
			}
		}
		System.out.println(str + sum);
	}
}
