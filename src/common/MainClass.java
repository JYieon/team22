package common;

import java.util.Scanner;

import common_.김수지.login_MemberService;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		login_MemberService lm = new login_MemberService();
		
		
		while(true) {
			System.out.println("1번 ");
			System.out.println("2번 ");
			System.out.println("3번 ");
			System.out.println("4번 ");
			System.out.println("5번 ");
			System.out.println("6번 ");
			num = input.nextInt();
			switch(num) {
			case 1:
				lm.display();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}
		}
	}
}
