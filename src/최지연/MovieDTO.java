package 최지연;

import java.util.ArrayList;

public class MovieDTO { //10월 16일 기준 영화
	private ArrayList<String> movie = new ArrayList<String>();

	public void MovieDTO() {}
	public void MovieDTO(ArrayList<String> movie) {}
	
	public ArrayList<String> getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie.add(movie);
	}
	
}
