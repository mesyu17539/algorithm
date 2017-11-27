package com.bit.loop;

import java.util.Scanner;

/*
 * Algorithm 10번 문제
 * 1+2+3+4+..+100 의 합계
 * */
public class ArithmeticSequence10 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String arr="";
		int sum=0 , imax=0;
		System.out.println("1부터 몇까지 더하고 싶으신가요");
		imax=s.nextInt();
		// 1 + 2 + 3 ... + 10
		for(int i = 1 ; i<=imax ;  i++) {
			sum+=i;
			if(i==imax)
			{
				arr= arr + i+" ";
			}else if (i%20==0) {
				arr+= i + "\n + ";
			}
			else {
				arr+= i + " + ";
			}
		}
		System.out.print(arr+" = "+sum);
//			System.out.println(arr+"+");
	}

}
