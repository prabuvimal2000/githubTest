package sort;

public class MoviesDetails 
{
 private int releasedYear;
 private float imdbRating;
 private String genre;
 private String movieName;
 MoviesDetails(String movieName,int releasedYear,float imdbRating,String genre)
 {
	this.movieName=movieName;
	this.imdbRating=imdbRating;
	this.releasedYear=releasedYear;
	this.genre=genre;
 }
public int getReleasedYear() {
	return releasedYear;
}
public void setReleasedYear(int releasedYear) {
	this.releasedYear = releasedYear;
}
public float getImdbRating() {
	return imdbRating;
}
public void setImdbRating(float imdbRating) {
	this.imdbRating = imdbRating;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String toString()
{
    return movieName+"\t\t"+releasedYear+"\t\t"+imdbRating+"\t\t"+genre;
}
}
