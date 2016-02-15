package io.egen.rentalflix;

import org.junit.Test;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * JUnit test cases for MovieService
 */
public class MovieServiceTest {

	MovieService movieService = new MovieService();
	protected List<Movie> movieTestList;
	protected Movie movieTest = new Movie();
	protected boolean rentTest;
	protected Movie movie1 = new Movie();
	protected Movie movie2 = new Movie();
	protected Movie movie3 = new Movie();
	protected Movie movie4 = new Movie();
	protected Movie movie5 = new Movie();
	
	@Before
	public void init() {
		movie1.setMovieId(1);
		movie1.setMovieTitle("Transformers");
		movie1.setMovieYear("2007");
		movie1.setMovieLanguage("English");
		movie2.setMovieId(2);
		movie2.setMovieTitle("Airlift");
		movie2.setMovieYear("2016");
		movie2.setMovieLanguage("Hindi");
		movie3.setMovieId(3);
		movie3.setMovieTitle("Pk");
		movie3.setMovieYear("2014");
		movie3.setMovieLanguage("Hindi");
		movie4.setMovieId(4);
		movie4.setMovieTitle("Lord of the Rings");
		movie4.setMovieYear("2001");
		movie4.setMovieLanguage("English");
		movie5.setMovieId(5);
		movie5.setMovieTitle("Dookudu");
		movie5.setMovieYear("2011");
		movie5.setMovieLanguage("Telugu");
		
		movieService.movieList.add(movie1);
		movieService.movieList.add(movie2);
		movieService.movieList.add(movie3);
		movieService.movieList.add(movie4);
		movieService.movieList.add(movie5);
	}
	
	@Test
	public void findAllTest() {
		movieTestList = movieService.findAll();
	    assertEquals(5,movieTestList.size());
	}
	
	@Test
	public void findByNameTest() {
		movieTestList = movieService.findByName("or");
	    assertEquals(2,movieTestList.size());
	}
	
	@Test
	public void createTest() {
		Movie newMovie = new Movie();
		newMovie.setMovieId(6);
		newMovie.setMovieTitle("Deadpool");
		newMovie.setMovieYear("2016");
		newMovie.setMovieLanguage("English");
		movieTest = movieService.create(newMovie);
	    assertEquals(6,movieTest.getMovieId());
	}
	
	@Test
	public void updateTest() {
		Movie newMovie = new Movie();
		newMovie.setMovieId(4);
		newMovie.setMovieTitle("Lord of the Rings: Two Towers");
		newMovie.setMovieYear("2002");
		newMovie.setMovieLanguage("English");
		movieTest = movieService.update(newMovie);
	    assertEquals("2002",movieTest.getMovieYear());
	}
	
	@Test
	public void deleteTest() {
		movieTest = movieService.delete(5);
	    assertEquals(5,movieTest.getMovieId());
	}
	
	@Test
	public void rentMovieTest() {
		rentTest = movieService.rentMovie(2,"Michael");
	    assertEquals(true,rentTest);
	}
}
