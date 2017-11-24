package com.bit.opcode;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int price=0, count=0, dc=0, result=0;
		String str="";
		System.out.println("얼마에요?");
		price=s.nextInt();
		System.out.printf(price+"원입니다\n");
		System.out.println("몇개 드릴까요");
		count=s.nextInt();
		System.out.printf(count+"개 주세요\n");
		System.out.println("비싸요 깍아주세요");
		System.out.println("몇 퍼센트 DC 할까요");
		dc=s.nextInt();
		if(dc<10) {
			result=(int)((price*count*(1-(double)dc/100)));
			str=result+"원 입니다";
		}else{
			str="안 팔아요";			
		}
		System.out.print(str);
	}
}
