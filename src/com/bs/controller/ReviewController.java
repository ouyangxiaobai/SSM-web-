package com.bs.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bs.bean.Liuyan;
import com.bs.bean.QueryVo;
import com.bs.bean.Review;
import com.bs.service.ReviewService;

@Controller
@RequestMapping("Review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	@RequestMapping("insertReview")
	public String insertReview(Review review){
		Date date = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		review.setReviewtime(sdf.format(date.getTime()));
		reviewService.insert(review);
		return null;
		
	}
	@RequestMapping("deleteReview")
	public String deleteReview(int reid){
		reviewService.deleteByPrimaryKey(reid);
		return "redirect:showReview.action";
		
	}
	@RequestMapping("showReview")
	public ModelAndView showReview(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
		QueryVo vo = new QueryVo();
		String currentPage = request.getParameter("currentPage");
		String totalPage = request.getParameter("totalPage");
		String recordNumber = request.getParameter("recordNumber");
		if(currentPage !=null)
		vo.setCurrentPage(Integer.valueOf(request.getParameter("currentPage"))); //当前页
		if(totalPage !=null)
	    vo.setTotalPage(Integer.valueOf(request.getParameter("totalPage"))); //一共多少页
		if(recordNumber !=null)
	    vo.setRecordNumber(Integer.valueOf(request.getParameter("recordNumber")));  //一共多少记录
	    
	    if(vo.getCurrentPage() == null){
			vo.setCurrentPage(1);
		}
		System.out.println(vo.getNation()+vo.getNativePlace()+vo.getName());
		//设置查询的起始记录条�?
		vo.setStart((vo.getCurrentPage() - 1) * vo.getSize());
		ModelAndView modelAndView=new ModelAndView("Review_result");
		List<Review> ReviewList = reviewService.selectByPage(vo);
		int count = reviewService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("ReviewList",ReviewList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		
		return modelAndView;
	}
}
