package com.bit.opcode;

import java.util.Scanner;

public class CalcSwitch {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String[] arr = new String[4]; // 4 = count
		arr[0]="첫 숫자 입력";
		arr[1]="연산자 입력";
		arr[2]="둘 숫자 입력";
		arr[3]="사칙연산이 잘못 되었습니다"; // 3 = 정수체계라서 0~3
		int num1=0, num2=0, result=0;
		boolean inputOk=true;
		String opcode="", str="";
		System.out.println(arr[0]);
		num1=scan.nextInt();
		System.out.println(arr[1]);
		opcode=scan.next();
		System.out.println(arr[2]);
		num2=scan.nextInt();
		switch (opcode) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		default:
			inputOk=false;
			break;
		}
		if(!inputOk) {
			str=arr[3];
		}else {
//			str=num1+ " " +opcode+ " " +num2 + " = " + result;
			str=String.format("%d %s %d = %d", num1,opcode,num2,result);
		}
		System.out.print(str);
	}
}