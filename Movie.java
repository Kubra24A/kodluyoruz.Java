package src.src;

public class Movie {
    
    public double movieMins;
    public int  visionYear;
    public String movieName, director,Screenwriter, starringRole, type;

    Movie(String movieName, double movieMins,String type,int visionYear, String director, String starringRole){
        this.movieName = movieName;
        this.director = director;
        this.type = type;
        this.starringRole = starringRole;
        this.visionYear = visionYear;
        if (movieMins<1){
            this.movieMins = 90.0;
        } else{
            this.movieMins=movieMins;
        }
    }
      public double getmovieMins(){
        return this.movieMins;
      }

      public void setmovieMins(double movieMins){
        if(movieMins<1){
            this.movieMins = 90.0 ;
        } else{
            this.movieMins = movieMins;
        }
        
      }
      public void print(){
        System.out.println("   ");
        System.out.println("Movie:"+" " +this.movieName);
        System.out.println("Director:" +" "+this.director);
        System.out.println("Starring Role:"+" " +this.starringRole);
        System.out.println("Time:" +" "+this.movieMins);
        System.out.println("Type:"+" " +this.type);
        System.out.println("Year:"+" " +this.visionYear);
        System.out.println("   ");
        System.out.println("****************************");
      }

      public static void main(String[] args) {
       System.out.println("~ All About The Movie ~");
    Movie film = new Movie( "Batman Begins", 139.0,"Action",2005, "Christopher Nolan", "Christian Bale");
    Movie film2 = new Movie("The Titanic",194.0 , "Epic,Romantic", 1997, "James Cameron", "Leonardo DiCaprio & Kate Winslet");
    film.print();
    film2.print();
     
      }
    
    
}
