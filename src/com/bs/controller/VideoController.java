package com.bs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bs.bean.Movie;
import com.bs.bean.Review;
import com.bs.service.MovieService;
import com.bs.service.ReviewService;
import com.bs.utils.SaveFile;

@Controller
public class VideoController {
	@Autowired
	private MovieService movieService;
	@Autowired
	private ReviewService reviewService;
	//视频添加页面
	@RequestMapping("/toUpload")
	public String toUpload(HttpServletRequest request) {
		
		return "/upload2";
	}
	@RequestMapping("/updateMovie")
	public String updateMovie(Movie movie,HttpSession session,HttpServletRequest request,
			@RequestParam(value = "moviePicture",required=false) MultipartFile moviePicture) {
		String uuid = (String) session.getAttribute("uuid");
		String exMv = (String) session.getAttribute("exMv");
		movie.setId(uuid);
		movie.setMvType("."+exMv);
		//User user = (User) session.getAttribute("user");
		//user.getUserName();
		movie.setUserId((long)100);
		if(!moviePicture.isEmpty()) {
			SaveFile.saveMvPicture(moviePicture,movie);
		}else {
			SaveFile.saveDefaultMVPicture(movie,request);
		}
		int result = this.movieService.insertSelective(movie);
			//return "redirect:toUpload";
			return "success";
	}
	/**
	 * 影片播放
	 */
	@RequestMapping("/player")
	public String playMovie(HttpSession session,HttpServletRequest request,
			@RequestParam(value = "movie",required=false) String movie) {
	
		String[] ids = movie.split("\\.");
		String movieId = ids[0];
		Movie movieResult = this.movieService.getMoviesByID(movieId);
		List<Review> review = reviewService.showReview(movieResult.getId());
		Movie moviess = new Movie();
		moviess.setId(movieResult.getId());
		moviess.setPlays(movieResult.getPlays()+1);
		this.movieService.updateByCondiction(moviess);
		//request.setAttribute("i", 2);
		request.setAttribute("movieResult", movieResult);
		request.setAttribute("movies", movieResult);
		request.setAttribute("review", review);
		return "player";
	}
}
