package com.bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bs.bean.Movie;
import com.bs.bean.Notice;
import com.bs.bean.Review;
import com.bs.service.MovieService;
import com.bs.service.NoticeService;
import com.bs.service.ReviewService;

@Controller
public class MainController {
	@Autowired
	private MovieService movieService;
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("main")
	public String main(){
		
		return "main";
		
	}
	@RequestMapping("center")
	public String center(){
		
		return "center";
		
	}
	@RequestMapping("down")
	public String down(){
		
		return "down";
		
	}
	@RequestMapping("middel")
	public String middel(){
		
		return "middel";
		
	}
	@RequestMapping("top")
	public String top(){
		
		return "top";
		
	}
	@RequestMapping("left")
	public String left(){
		
		return "left";
		
	}
	@RequestMapping("index2")
	public String index2(){
		
		return "index2";
		
	}
	@RequestMapping("index")
	public ModelAndView index(){
		ModelAndView modelAndView=new ModelAndView("pc/index");
		List<Notice> notice= noticeService.selectAll();
		List<Movie> movies = movieService.getAllVideo();
		
		modelAndView.addObject("movies",movies);
		modelAndView.addObject("notice",notice);
		return modelAndView;
		
	}
	@RequestMapping("index3")
	public String index3(){
		
		return "index3";
		
	}
	@RequestMapping("login")
	public String login(){
		
		return "signin";
		
	}
}
