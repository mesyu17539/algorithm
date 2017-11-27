package com.bit.loop;

public class EvenSum {

	public static void main(String[] args) {
		int odd = 0, sum = 0;
		String str = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				if(i!=100) {
					str += i+"+";
				}else {
					str += i+"=";
				}
				sum += i;
			}
		}
		System.out.println(str + sum);
	}
}
