package sort;

import java.util.Comparator;

public class CompareReleasedYear implements Comparator<MoviesDetails>
{

	public int compare(MoviesDetails movie, MoviesDetails movie1) 
	{
		return movie.getReleasedYear()-movie1.getReleasedYear();
	}
}
