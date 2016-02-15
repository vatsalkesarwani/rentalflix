package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {
	
	List<Movie> movieList = new ArrayList<Movie>();
	
	public List<Movie> findAll () {
		return movieList;
	}
	
	public List<Movie> findByName (String name) {
		List<Movie> movieSearchList = new ArrayList<Movie>();
		for(Movie movie : movieList) {
			if(movie.getMovieTitle().toLowerCase().contains(name.toLowerCase())) {
				movieSearchList.add(movie);
			}
		}
		return movieSearchList;
	}
	
	public Movie create (Movie movie) {
		if(!movieList.contains(movie)) {
			movieList.add(movie);
		}
		return movie;
	}
	
	public Movie update (Movie movie) {
		for(Movie movieDetail : movieList) {
			if(movieDetail.getMovieId() == movie.getMovieId()) {
				movieDetail.setMovieTitle(movie.getMovieTitle());
				movieDetail.setMovieYear(movie.getMovieYear());
				movieDetail.setMovieLanguage(movie.getMovieLanguage());
				movieDetail.setMovieRenter(movie.getMovieRenter());
				return movieDetail;
			}
		}
		throw new IllegalArgumentException("MovieId to be updated is not found");
	}
	
	public Movie delete (int id) {
		for (Iterator<Movie> iterateMovie = movieList.iterator(); iterateMovie.hasNext(); ) {
			Movie movie = iterateMovie.next();
			if(movie.getMovieId() == id) {
				movieList.remove(movie);
				return movie;
			}
		}
		throw new IllegalArgumentException("MovieId to be deleted is not found");
	}
	
	public boolean rentMovie (int movieId, String user) {
		for(Movie movie : movieList) {
			if(movie.getMovieId() == movieId) {
				if(movie.getMovieRenter() == "NOT RENTED") {
					movie.setMovieRenter(user);
					return true;
				} else {
					throw new IllegalArgumentException("false, movie is already rented");
				}
			}
		}
		return false;
	}
}
