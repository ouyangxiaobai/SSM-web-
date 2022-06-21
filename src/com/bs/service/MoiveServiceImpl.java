package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.Movie;
import com.bs.dao.MovieMapper;

@Service
public class MoiveServiceImpl implements MovieService {

	@Autowired
	private MovieMapper movieMapper;
	
	@Override
	public int insertSelective(Movie movie) {
		return movieMapper.insertSelective(movie);
	}

	@Override
	public List<Movie> getMoviesByUserID(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delMovieById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Movie getMoviesByID(String movieId) {
		// TODO Auto-generated method stub
		return movieMapper.selectByPrimaryKey(movieId);
	}

	@Override
	public List<Movie> getMovieBySliderImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMovieByCategory(long l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> selectByRankings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> selectByRankingsByCategory(Long category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMoviesByIDs(String mvs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateByCondiction(Movie movies) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Movie> searchMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMovieNoSilder(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getUserMovies(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAllVideo() {
		// TODO Auto-generated method stub
		return movieMapper.getAllVideo();
	}


}
