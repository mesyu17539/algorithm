package com.bit.opcode;

import java.util.Scanner;

//t의 단위가 센티미터가 아닌 미터임에 유의해야 한다
//BMI =w/t^2

public class Bmi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = { "이름 입력", "키 입력 (cm)", "체중 입력 (kg)" };
		String result = "", str = "", name = "";
		int imax=0;
		double t = 0.0, w = 0.0, bmi = 0.0;
		System.out.println("몇명 입력하시겠습니까");
		imax=s.nextInt();

		for (int i = 0; i < imax; i++) {
			str = "";
			System.out.println(arr[0]);
			name = s.next();
			System.out.println(arr[1]);
			t = s.nextDouble()/100;
			System.out.println(arr[2]);
			w = s.nextDouble();
			bmi = w / (t * t);
			if (bmi >= 35) {
				str += "고도비만";
			} else if (bmi >= 25) {
				str += "과체중";
			} else if (bmi > 18.5) {
				str += "정상";
			} else {
				str += "저체중";
			}
			result += String.format("%s님 당신은 %.1f 이므로 %s입니다  \n",
					name, bmi, str);
		}
		System.out.println(result);
	}
}
