package com.bit.loop;

import java.util.Scanner;

/*
 * Algorithm 10번 문제
 * 1+2+3+4+..+100 의 합계
 * */
public class ArithmeticSequence11 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String arr="";
		int sum=0, imax=100;
		// 1 + 2 + 3 ... + 10
		for(int i = 1 ; i<=imax ;  i++) {
			sum+=i;
			if(i==imax)
			{
				arr= arr + i + "\n = "; //오버로딩.
			}else {
				arr+= i + " + "; // 오버로딩
			}
		}
		System.out.print(arr+sum);
	}
}
