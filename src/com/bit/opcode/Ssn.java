package com.bit.opcode;

import java.util.Scanner;

/*
To.개발자님
       * 프로그램을 하나 개발해야 합니다.
       * 교수가 주민번호를 입력하면 해당 학생이 남자인지,
         여자인지, 외국인인지
       * 자동 으로 출력해 주는 프로그램을 만들어 달랍니다.
       * 오더는 다음과 같이 화면에 출력하라고 합니다.
       * 홍길동 : 800101 -1234567 : 남
       * 입력값은 이름과 주민번호이고 남은 자동으로 출력되는 값입니다.
       * 현행법상 1, 3으로 시작되면 남자, 2, 4로 시작되면
         여자, 5,6 이면 외국인
       * 교수가 실수로 0,7,8,9 로 시작 주민번호를 입력하면
       * "다시 입력하세요" 라고 알려주시길 바랍니다.
       성별 String gender = "";
       주민등록번호 800101-1234567 에서 1 을 추출하는 문법
       String ssn = "800101-1234567";
       char ch = ssn.charAt(7); 하면 1 이 추출되어 ch 에 담긴다.
       그러면 내부값은 '1' 이렇게 된다
       if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){...}
 * */
public class Ssn {//주민번호
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean boo=true;
		String name="", gender = "", ssn="", ifstr="";
		String[] pArr= {
				"남자","여자","외국인","이름을 입력하세요",
				"주민번호를 입력하세요","%s : %s : %s","다시 입력하세요",""};
		char ch=' ';
		System.out.println(pArr[3]);
		name=s.next();
		while(boo) {
			System.out.println(pArr[4]);
			ssn= s.next();
			ch=ssn.charAt(7);
			if(ch=='0'||ch=='7'||ch=='8'||ch=='9') {
				ifstr=pArr[6];
				boo=!boo;
			}else {
				switch (ch) {
				case '1': case '3':
					gender=pArr[0];
					break;
				case '2': case '4':
					gender=pArr[1];
					break;
				case '5': case '6':
					gender=pArr[2];
					break;
				default:
					break;
				}
				ifstr=pArr[5];
			}
		}
		System.out.printf(ifstr,name,ssn,gender);
	}
}
