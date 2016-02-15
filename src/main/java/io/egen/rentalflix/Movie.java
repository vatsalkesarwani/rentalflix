package io.egen.rentalflix;

/**
 * Entity representing a movie.
 * Fields: id, title, year, language
 */
public class Movie {
	//POJO IMPLEMENTATION GOES HERE
	
	//Movie class private fields
	private int movieId;
	private String movieTitle;
	private String movieYear;
	private String movieLanguage;
	private String movieRenter;
	
	Movie() {
		movieRenter = "NOT RENTED";
	}
	
	//Getters and setters for private fields
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	public String getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}
	
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	
	public String getMovieRenter() {
		return movieRenter;
	}
	public void setMovieRenter(String movieRenter) {
		this.movieRenter = movieRenter;
	}
}
