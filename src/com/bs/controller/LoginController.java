package com.bs.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bs.bean.Admin;
import com.bs.bean.User;
import com.bs.service.AdminService;
import com.bs.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;
	@RequestMapping("login_CheckLogin")
	public void login_CheckLogin(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Admin admin = adminService.selectByUsername(username);
		
	}
	/**
     * 用户登陆
     * @param request
     * @param session
     * @return 0:用户名不存在 1:密码错误 2:登录成功
     */

    @RequestMapping("/loginCheck")
    @ResponseBody
    public ModelAndView signin(HttpServletRequest request,HttpSession session){
        //处理参数
    	ModelAndView modelAndView=new ModelAndView("pc/index");
    	ModelAndView AdminmodelAndView=new ModelAndView("main");
        String password=request.getParameter("password");
        String username=request.getParameter("username");
        String user=request.getParameter("user");
        System.out.println(password+username+user);
        int loginVerify = -1;
        if(user!=null&&user.equals("管理员")){
        //验证用户名密码
        loginVerify=adminService.login(username,password);
        }else if(user!=null&&user.equals("普通用户")){
        	loginVerify=userService.login(username,password);
        }
        HashMap<String, String> res = new HashMap<String, String>();
        //管理员登录成功
        if(loginVerify == 2){
            Admin admin =adminService.selectByUsername(username);
            Integer userId=admin.getId();
            //用户信息写入session
            session.setAttribute("AdminId",userId);
            session.setAttribute("Adminname",username);
            session.setAttribute("AdminPassword",admin.getPassword());
            return AdminmodelAndView;
        }
      //用户登录成功
        else if (loginVerify == 3){
            User user2 = userService.selectByUsername(username);
            Integer userId=user2.getId();
            //用户信息写入session
            session.setAttribute("userId",userId);
            session.setAttribute("username",username);
            return modelAndView;
        }
        //密码错误
        else if (loginVerify == 1){
        	modelAndView.addObject("error", "密码错误");
        	return modelAndView;
        }
        //用户名不存在
        else {
        	modelAndView.addObject("error", "用户名不存在");
        	return modelAndView;
        }
    }
    @RequestMapping("/register")
    @ResponseBody
    public ModelAndView register(HttpServletRequest request,HttpSession session){
        //处理参数
        ModelAndView modelAndView=new ModelAndView("pc/index");
        ModelAndView AdminmodelAndView=new ModelAndView("main");
        String password=request.getParameter("password");
        String username=request.getParameter("username");
//        String user=request.getParameter("user");
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.insert(user);
        return modelAndView;
    }
}
