package com.bit.opcode;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] arr = {
				"+", "-", "/", "%", "*",
				"\t 첫번째 숫자를 입력하세요 \n",
				"\t 두번째 숫자를 입력하세요 \n",
				"\t 연산자 (*-+/%)를 입력해 주세요 \n",
				"입력 다시",
				" %d %s %d = %d "
				};
		int num1 = 0, num2 = 0, result = 0;
		String opcode="";
		System.out.print(arr[5]);
		num1 = sc.nextInt();
		System.out.print(arr[6]);
		num2 = sc.nextInt();
		while(result==0) {
		System.out.println(arr[7]);
		opcode=sc.next();
		if(opcode.equals(arr[0])) {
			result=num1+num2;
		}else if(opcode.equals(arr[1])){
			result=num1-num2;
		}else if(opcode.equals(arr[2])){
			result=num1/num2;
		}else if(opcode.equals(arr[3])){
			result=num1%num2;
		}else if(opcode.equals(arr[4])){
			result=num1*num2;
		}else {
			System.out.println(arr[8]);
		}
		}
		System.out.printf(arr[9],
				num1,opcode,num2,result);
	}
}
