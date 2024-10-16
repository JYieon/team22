package 최지연;

import java.util.Scanner;
import 최지연.MovieDTO;

class chart {
	protected String[] movie;
	MovieDTO dto = new MovieDTO();
	public void chartMovie() {
		movie = new String[] {"보통의 가족", "임영웅: 아임히어로", "6시간 후 너는 죽는다",
				"하이라이트 : 라이츠 고 온", "스마일 2", "대도시의 사랑법", "더 커버넌트", 
				"브레드이발소-빵스타의 탄생", "노트북", "너의 색"};
	}
	public void chart() {
		for(String m : movie) {
			dto.setMovie(m);
		}
	}
}

class chartSon extends chart{
	public void chartMovie() {
		super.movie = new String[] {"더러운 돈에 손대지마라", "채식주의자", "흉터", "타임라인",
				"블루 자이언트", "카타로의 탄생 게게게의 수수께끼", "베놈: 라스트 댄스", "폭설",
				"룸 넥스트 도어", "오후 네시"};
	}
}

public class MovieService {
	MovieDTO dto = new MovieDTO();
	
	public void movieChart() {
		String[] movie = new String[] {"보통의 가족", "임영웅: 아임히어로", "6시간 후 너는 죽는다",
				"하이라이트 : 라이츠 고 온", "스마일 2", "대도시의 사랑법", "더 커버넌트", 
				"브레드이발소-빵스타의 탄생", "노트북", "너의 색"};
		for(String m : movie) {
			dto.setMovie(m);
		}
	}
	
	public void movies() {
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		chart movie;
		
		while(bool) {
			System.out.println("[영화]");
			System.out.println("1. 무비차트");
			System.out.println("2. 개봉 예정 영화");
			System.out.println("3. 영화 예매");
			System.out.println("4. 예매 확인");
			System.out.println("5. 뒤로가기");
			System.out.print(">>> ");
			int num = input.nextInt();
			
			switch (num) {
			case 1: 
				System.out.println("[무비차트]");
				movie = new chart();
				movie.chart();
				int i = 1;
				for(String m : dto.getMovie()) {
					System.out.println(i + ". " + m);
					i++;
				}
				break;
			case 2:
				System.out.println("[개봉 예정 영화]");
				movie = new chartSon();
				movie.chart();
				int j = 1;
				for(String m : dto.getMovie()) {
					System.out.println(j + ". " + m);
					j++;
				}
				break;
			case 3:
				break;
			
			}
		}
	}
}
