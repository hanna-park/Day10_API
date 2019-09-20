package com.pp.t1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 스캐너를 사용해서
		// 주민등록번호를 입력받고 991122-1234567
		// 나이, 태어난 계절 3~5 6~8 9~11 12~2
		// 성별 1 3 5 남자 2 4 6 여 자 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.");
		String ju = sc.next();
		ju = ju.replace("-", "");
		
		Integer age =new Integer(ju.substring(0,2));
		Integer month = new Integer(ju.substring(2,4));
		Integer day = new Integer(ju.substring(4,6));
		Integer gender = new Integer(ju.substring(6,7));
		
		if(gender ==1) {
				age = 1900 + age;
				age = 2019 - age;
				System.out.println(age+1+"살입니다.");
				
			}else if(gender==2) {
				
				age = 1900 + age;
				age = 2019 - age;
				System.out.println(age+1+"살입니다.");
				
			}else if(gender == 3 || gender ==5 || gender == 4 || gender == 6) {
				
				age = 2000+age;
				age = 2019 - age;
				System.out.println(age+1+"살입니다.");
				
			}
			
		System.out.println(month+"월 "+day+"일생입니다.");
		
			if(3<=month && 5>=month) {
				System.out.println("봄에 태어났습니다.");
			}else if(6<=month && 8>=month) {
				System.out.println("여름에 태어났습니다.");
			}else if(9<=month && 11>=month) {
				System.out.println("가을에 태어났습니다.");
			}else if(month == 12 || month<=2) {
				System.out.println("겨울에 태어났습니다.");
			}
			
			age = gender;
			if(age%2 ==1) {
				System.out.println("성별은 남자입니다.");
			}else {
				System.out.println("성별은 여자입니다.");
			}
			
			/*
			if(gender==2 || gender == 4 || gender == 6) {
				System.out.println("성별은 여자입니다.");
				
			}else if(gender ==1 || gender == 3 || gender ==5 ) {
				System.out.println("성별은 남자입니다.");
				System.out.println("집에서작업");
			}*/
		}
		
}


