package common;

import java.util.Scanner;
import 최지연.MovieService;

import common_.김수지.login_MemberService;
import 이유나.Store;

public class MainClass {
	public static void main(String[] args) {
		MovieService store = new MovieService();
		
		Scanner input = new Scanner(System.in);
		int num;
		
		Store a = new Store();
		login_MemberService lm = new login_MemberService();
		
		
		while(true) {

			System.out.println("1번 로그인");
			System.out.println("2번 내 정보");
			System.out.println("3번 영화"); 
			System.out.println("4번 매점");
			System.out.println("5번 극장");

			num = input.nextInt();
			switch(num) {
			case 1:
				lm.display();
				break;
			case 2:
				break;
			case 3: 
				store.movies(lm.login);
				break;
			case 4:
				a.runStore();
				break;
			case 5:
				break;
			case 6:
				break;
			}
		}
	}
}
