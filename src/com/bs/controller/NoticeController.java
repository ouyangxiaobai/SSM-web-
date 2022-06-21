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

import com.bs.bean.Notice;
import com.bs.bean.PartymemInformation;
import com.bs.bean.QueryVo;
import com.bs.service.NoticeService;

@Controller
@RequestMapping("Notice")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	/*
	 * 公告模块
	 * 
	 * 
	 */
	@RequestMapping("NoticePage")
	public ModelAndView NoticePage(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
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
		//设置查询的起始记录条�?
		vo.setStart((vo.getCurrentPage() - 1) * vo.getSize());
		ModelAndView modelAndView=new ModelAndView("Notice_result");
		List<Notice> NoticeList = noticeService.selectByPage(vo);
		int count = noticeService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("NoticeList",NoticeList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		return modelAndView;
	}
	@RequestMapping("addNoticePage")
	public ModelAndView addNoticePage(){
		ModelAndView modelAndView=new ModelAndView("Notice_add");
		
		return modelAndView;
		
	}
	@RequestMapping("deleteNotice")
	public ModelAndView deleteNotice(HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("Notice_result");
		String id = request.getParameter("id");
		noticeService.deleteByPrimaryKey(Integer.parseInt(id));
		return modelAndView;
		
	}
	@RequestMapping("viewNotice")
	public ModelAndView viewNotice(HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("Notice_modify");
		String id = request.getParameter("id");
		Notice notice = noticeService.selectByPrimaryKey(Integer.parseInt(id));
		modelAndView.addObject("notice", notice);
		return modelAndView;
	}
	@RequestMapping("ModifyNotice")
	public ModelAndView ModifyNotice(Notice notice){
		ModelAndView modelAndView=new ModelAndView("Notice_modify");
		noticeService.updateByPrimaryKey(notice);
		return modelAndView;
	}
	@RequestMapping("addNotice")
	public ModelAndView addNotice(Notice notice){
		ModelAndView modelAndView=new ModelAndView("Notice_add");
		Date date = new Date();  
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH");
		 notice.setNoticeDate(sdf.format(date.getTime()));
		 noticeService.insert(notice);
		return modelAndView;
		
	}
	@RequestMapping("gonggaoDetailQian")
	public ModelAndView gonggaoDetailQian(HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("pc/gonggaoDetailQian");
		String gonggaoId = request.getParameter("gonggaoId");
		Notice notice = noticeService.selectByPrimaryKey(Integer.parseInt(gonggaoId));
		List<Notice> noticelist= noticeService.selectAll();
		modelAndView.addObject("notice", notice);
		modelAndView.addObject("noticelist", noticelist);
		return modelAndView;
		
	}
}
