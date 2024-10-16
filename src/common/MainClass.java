package common;

import java.util.Scanner;
import 최지연.MovieService;

public class MainClass {
	public static void main(String[] args) {
		MovieService store = new MovieService();
		
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1번");
			System.out.println("2번");
			System.out.println("3번 영화"); //최지연
			System.out.println("4번");
			System.out.println("5번");
			num = input.nextInt();
			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3: //매점
				store.movies();
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}
	}
}
