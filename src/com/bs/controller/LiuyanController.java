package com.bs.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bs.bean.Liuyan;
import com.bs.bean.PartymemInformation;
import com.bs.bean.QueryVo;
import com.bs.service.LiuyanService;

@Controller
@RequestMapping("Liuyan")
public class LiuyanController {
	@Autowired
	private LiuyanService liuyanService;
	
	@RequestMapping("LiuyanPage")
	public ModelAndView LiuyanPage(){
		List<Liuyan> list = liuyanService.selectAll();
		ModelAndView modelAndView=new ModelAndView("pc/liuyanAll");
		modelAndView.addObject("list",list);
		return modelAndView;
		
	}
	@RequestMapping("LiuyanmanagerPage")
	public ModelAndView LiuyanmanagerPage(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
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
		ModelAndView modelAndView=new ModelAndView("Liuyan_result");
		List<Liuyan> LiuyanList = liuyanService.selectByPage(vo);
		int count = liuyanService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("LiuyanList",LiuyanList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		
		return modelAndView;
	}
	@RequestMapping(value = "liuyanAdd", method = RequestMethod.POST)
	public ModelAndView liuyanAdd(HttpServletRequest request,HttpSession session){
		Date date = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Liuyan liuyan=new Liuyan();
		liuyan.setLiuyanTitle(request.getParameter("liuyanTitle"));
		liuyan.setLiuyanContent(request.getParameter("liuyanContent"));
		liuyan.setLiuyanDate(sdf.format(date.getTime()));
		liuyan.setLiuyanUser((String) session.getAttribute("username"));
		liuyanService.insert(liuyan);
		List<Liuyan> list = liuyanService.selectAll();
		ModelAndView modelAndView=new ModelAndView("pc/liuyanAll");
		modelAndView.addObject("list",list);
		return modelAndView;
		
	}
	@RequestMapping(value = "liuyanModify")
	public ModelAndView liuyanModify(@RequestParam Liuyan liuyan){
		liuyanService.updateByPrimaryKey(liuyan);
		ModelAndView modelAndView=new ModelAndView("pc/liuyanAll");
		return modelAndView;
		
	}
	@RequestMapping(value = "liuyanDelete")
	public ModelAndView liuyanDelete(@RequestParam(required=false, value="liuyanId") String liuyanId){
		liuyanService.deleteByPrimaryKey(Integer.parseInt(liuyanId));
		ModelAndView modelAndView=new ModelAndView("Liuyan_result");
		return modelAndView;
		
	}
}
