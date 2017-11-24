package com.bit.opcode;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] arr = new String[9];
		arr[0]="+";
		arr[1]="-";
		arr[2]="/";
		arr[3]="%";
		arr[4]="*";
		arr[5]="\t 첫번째 숫자를 입력하세요 \n";
		arr[6]="\t 두번째 숫자를 입력하세요 \n";
		arr[7]="\t 연산자 (*-+/%)를 입력해 주세요 \n";
		arr[8]="입력 다시";
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
		System.out.printf(" %d %s %d = %d ",
				num1,opcode,num2,result);
	}
}
