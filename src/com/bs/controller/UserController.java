package com.bs.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bs.bean.User;
import com.bs.service.UserService;

@Controller
@RequestMapping("User")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("UserModifyPage")
	public ModelAndView UserModifyPage(HttpSession session,HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("UserModify");
		int userId=(int) request.getSession().getAttribute("userId");
		User user = userService.selectByPrimaryKey(userId);
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	@RequestMapping("UserModify")
	public ModelAndView UserModify(User user){
		ModelAndView modelAndView=new ModelAndView("success");
		userService.updateByPrimaryKeySelective(user);
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	@RequestMapping("userinfo")
	public ModelAndView userinfo(User user,HttpSession session){
		ModelAndView modelAndView=new ModelAndView("pc/userXinxi");
		userService.selectByPrimaryKey((int) session.getAttribute("userId"));
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	@RequestMapping("exit")
	public ModelAndView exit(HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("pc/index");
		 Enumeration em = request.getSession().getAttributeNames();
		  while(em.hasMoreElements()){
		   request.getSession().removeAttribute(em.nextElement().toString());
		  }
		return modelAndView;
	}
}
