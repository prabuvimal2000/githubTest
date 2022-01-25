package sort;

import java.util.ArrayList;
import java.util.Collections;

public class Movies {

	public static void main(String[] args) 
	{
		ArrayList<MoviesDetails> list= new ArrayList<MoviesDetails>();
		list.add(new MoviesDetails("Kappan",2017,7.8f,"Action Drama"));
		list.add(new MoviesDetails("Maya",2018,7,"Horror"));
		list.add(new MoviesDetails("Basha",1995,8.5f,"Action"));
		list.add(new MoviesDetails("Billa",1993,8.75f,"Action"));
		Collections.sort(list,new CompareReleasedYear());
		System.out.println("Movies sorted by released Year");
		System.out.println("Movie Name :\t Year:\t\tIMDB:\t\tType: ");
	    for ( MoviesDetails movie: list)
	    {
	       System.out.println(movie);
	    }
	    Collections.sort(list,new CompareImdbRating());
		System.out.println("Movies sorted by released Imdb");
		System.out.println("Movie Name :\t Year:\t\tIMDB:\t\tType: ");
	    for ( MoviesDetails movie: list)
	    {
	       System.out.println(movie);
	    }
	}

}
