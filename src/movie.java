import java.util.Arrays;

public class movie {
	//variables for constructors
	private int movieID;
	private int numberOfViews;
	private double rating;
	private int releaseDate;
	private String movieName;
	
	//Constructors
	public movie(){}
//	values[0]id, values[1]name , values[2]year , values[3]rate 
	public movie(int movieID,String movieName, int releaseDate, double rating, int numbOfViews){
		this.movieID = movieID;
		this.numberOfViews = numbOfViews;
		this.rating = rating;
		this.releaseDate = releaseDate;
		this.movieName = movieName;
	}
	
//setters
	public void setID(int movieID) {
		this.movieID = movieID;
}

	public void setNumberOfViews(int NumbOfViews) {
		this.numberOfViews = NumbOfViews;
}

	public void setRating(int rating) {
		this.rating = rating;
}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
}
	public void set(String movieName) {
		this.movieName = movieName;
}

// getters
	public int getID(){
		return movieID;
}
	public int getNumberOfViews(){
		return numberOfViews;
}
	public double getRating(){
		return rating;
}
	public int getReleaseDate(){
		return releaseDate;
}
	public String getMovieName() {
		return movieName;
}
	public String toString() {
		return "The movie is called: " + movieName + " It was released in " + releaseDate + "." +
				"\nThis movie's rating is: " + rating + " It has a total of: " + numberOfViews + " views." + 
				"\nID is: " + movieID + ".";
	}
	
	public int compareRating(movie o) {
		if (rating > o.rating) {
			return 1;
		} else if (rating < o.rating) {
			return -1;
		}
		return 0;
	}
	public int compareYear(movie o) {
		if (releaseDate > o.releaseDate) {
			return 1;
		} else if (releaseDate < o.releaseDate) {
			return -1;
		}
		return 0;
	}
	
	public void SearchByRating(movie o,float filter, int size) {
		int i, flag=0;
		for(i=0; i<size; i++) {
		if(o.rating >= filter) {
		System.out.println("Movies that applied to your search: " + o.toString());
		flag++;
		}
		}
		if(flag == 0)
			System.out.print("No movie found for rating" + filter);
		}
	public void SearchByYear(movie o,float filter, int size) {
		int i, flag=0;
		for(i=0; i<size; i++) {
		if(o.releaseDate>= filter) {
		System.out.println("Movies that applied to your search: " + o.toString());
		flag++;
		}
		}
		if(flag == 0)
			System.out.print("No movie found for rating" + filter);
		}
}

