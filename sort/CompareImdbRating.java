package sort;

import java.util.Comparator;

public class CompareImdbRating  implements Comparator<MoviesDetails>
{

	public int compare(MoviesDetails movie, MoviesDetails movie1)
	{
		if(movie.getImdbRating()>movie1.getImdbRating())
		{
			return 1;
		}
		else if(movie.getImdbRating()<movie1.getImdbRating())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}

}
