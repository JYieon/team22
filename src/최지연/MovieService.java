package 최지연;

import java.util.ArrayList;
import java.util.Scanner;
import 최지연.MovieDTO;
import common_.김수지.login_MemberDTO;
import common_.김수지.login_MemberService;

public class MovieService {
   public ArrayList<MovieDTO> user;
   public MovieService() {
      user = new ArrayList<MovieDTO>();
   }
   MovieDTO dto = new MovieDTO();
   public String[] movie = new String[] {"보통의 가족", "임영웅: 아임히어로", "6시간 후 너는 죽는다",
         "하이라이트 : 라이츠 고 온", "스마일 2", "대도시의 사랑법", "더 커버넌트", 
         "브레드이발소-빵스타의 탄생", "노트북", "너의 색"};//10월 16일 기준 영화
   
   public void movies(ArrayList<login_MemberDTO> member) {
      Scanner input = new Scanner(System.in);
      boolean bool = true;
      
      while(bool) {
         System.out.println("[영화]");
         System.out.println("1. 무비차트");
         System.out.println("2. 영화 예매");
         System.out.println("3. 예매 확인");
         System.out.println("4. 뒤로가기");
         System.out.print(">>> ");
         int num = input.nextInt();
         
         switch (num) {
         case 1: 
            System.out.println("[무비차트]");
            int i = 1;
            for(String m : movie) {
               System.out.println(i + ". " + m);
               i++;
            }
            break;
         case 2:
            boolean id = false;
            System.out.println("[영화 예매]");
            System.out.print("아이디 : "); 
            String uid = input.next();
            for (login_MemberDTO m : member) {
                  if (m.getNewID().equals(uid)) {
                     id = true;
                     dto.setUid(uid);
                  }
              }
            if(id) {
               System.out.print("극장");
               dto.setCinema(input.next());
               System.out.print("요일 : ");
               dto.setDay(input.next());
               System.out.print("영화 제목 : ");
               dto.setName(input.next());
               System.out.print("시간(00:00로 입력) : ");
               dto.setTime(input.next());
               System.out.print("인원 : ");
               dto.setPeop(input.nextInt());
               user.add(dto);
            }else
               System.out.println("없는 아이디입니다.");
            
            break;
         case 3:
            boolean id1 = false;
            System.out.println("[예매 확인]");
            System.out.println("아이디 : "); 
            String uid1 = input.next();
            for (login_MemberDTO m : member) {
                  if (m.getNewID().equals(uid1)) {
                     id1 = true;
                     dto.setUid(uid1);
                  }
              }
            if(id1) {
               for(MovieDTO r : user) {
                  if(r.getUid().equals(uid1)) {
                     System.out.println(r.getCinema());
                     System.out.println(r.getDay());
                     System.out.println(r.getName());
                     System.out.println(r.getTime());
                     System.out.println(r.getPeop());
                  }
               }
            }else
               System.out.println("없는 아이디입니다.");
            break;
         case 4:
            bool = false;
            break;
         }
      }
   }
}
