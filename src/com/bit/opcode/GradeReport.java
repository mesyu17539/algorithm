package com.bit.opcode;

import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name="", gR="", result="";
		int sco1=0, sco2=0, sco3=0, avg=0;
		
		System.out.print("이름 ?\n");
		name=scan.next();
		System.out.print("국어 점수 ?\n");
		sco1=scan.nextInt();
		System.out.print("영어 점수 ?\n");
		sco2=scan.nextInt();
		System.out.print("수학 점수 ?\n");
		sco3=scan.nextInt();
		avg=(sco1+sco2+sco3)/3;
		switch (avg/10) {
		case 10: case 9:
			gR="A";
			break;
		case 8:
			gR="B";
			break;
		case 7:
			gR="C";
			break;
		default:
			gR="F";
			break;
		}
		System.out.printf("%s [평균] %d [학점] %s", name, avg, gR);
		result=String.format("%s [평균] %d [학점] %s", name, avg, gR);
		System.out.print(result);
	}
}
