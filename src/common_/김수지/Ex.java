package common_.김수지;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String saveID = null, newID = null;
		int savePW = 0, newPW = 0;
		System.out.println(" ID : ");
		saveID = input.next();
		System.out.println(" PW : ");
		savePW = input.nextInt();


		if(saveID != null) {
			System.out.println("ID를 다시 입력해주세요.");
		}else if(saveID.equals(newID)) {
			System.out.println("비밀번호 입력해주세요.");
		}else {
			
			
		}

	}
}


