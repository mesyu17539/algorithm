package com.bit.opcode;

import java.util.Scanner;

public class WhoAreYou {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int pay=0;
		String name="";
		String[] arr = {
				"이름이 뭐죠",
				"당신 이름은 %s 입니다\n",
				"이 빵 가격은 얼마죠",
				"가격은 %d원 입니다"
		};
		System.out.println(arr[0]);
		name = s.next();
		System.out.printf(arr[1], name);
		System.out.println(arr[2]);
		pay = s.nextInt();
		System.out.printf(arr[3], pay);
		s.close();
	}
}
