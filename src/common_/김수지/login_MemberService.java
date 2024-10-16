package common_.김수지;

import java.util.ArrayList;
import java.util.Scanner;

public class login_MemberService {
	Scanner input = new Scanner(System.in);
	public ArrayList<login_MemberDTO>login;
	public login_MemberService() {
		login = new ArrayList<login_MemberDTO>();
	}
	public void log() {
		login_MemberDTO d =new login_MemberDTO();
		String saveID = null, newID = null;
		int savePW = 0, newPW = 0;
		System.out.println(" ID : ");
		saveID = input.next();
		System.out.println(" PW : ");
		savePW = input.nextInt();


		 boolean found = false;
	        for (login_MemberDTO member : login) {
	            if (member.getNewID().equals(saveID) && member.getNewPW() == savePW) {
	                found = true;
	                System.out.println("로그인 성공!");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("로그인 실패! ID나 PW를 다시 입력하세요.");
	        }
	    }

	
	public void register() {
		login_MemberDTO d =new login_MemberDTO();
		String newID;
		int newPW;
		System.out.println(" ID : ");
		newID = input.next();
		System.out.println(" PW : ");
		newPW = input.nextInt();
		
		d.setNewID(newID);
		d.setNewPW(newPW);
		
		login.add(d);
		System.out.println(" 가입 완료 ");
		
	}
	
	
	
	public void display() {
		int num;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println(">>>>>>>>>>");
			num = input.nextInt();
			switch(num) {
			case 1 :
				log();
				break;
			case 2 : 
				register();
				break;
			
		
			}
			
		}
	}

}
