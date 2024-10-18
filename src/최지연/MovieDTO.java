package 최지연;


public class MovieDTO { 
   private String uid, cinema, day, time, name;
   private int peop;
   private int movieCount = 0;
   
   public String getUid() {
      return uid;
   }
   public void setUid(String uid) {
      this.uid = uid;
   }
   public String getCinema() {
      return cinema;
   }
   public void setCinema(String cinema) {
      this.cinema = cinema;
   }
   public String getDay() {
      return day;
   }
   public void setDay(String day) {
      this.day = day;
   }
   public String getTime() {
      return time;
   }
   public void setTime(String time) {
      this.time = time;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getPeop() {
      return peop;
   }
   public void setPeop(int peop) {
      this.peop = peop;
   }
   public int getMovieCount() {
      return movieCount;
   }
   public void setMovieCount(int movieCount) {
      this.movieCount = movieCount;
   }
   
}
