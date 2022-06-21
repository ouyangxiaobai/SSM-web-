package com.bs.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bs.bean.Admin;
import com.bs.bean.DevelopingPartymem;
import com.bs.bean.Education;
import com.bs.bean.LifeFile;
import com.bs.bean.Nation;
import com.bs.bean.Nativeplace;
import com.bs.bean.OrganizationalLife;
import com.bs.bean.PartymemDues;
import com.bs.bean.PartymemInformation;
import com.bs.bean.PartymemOutflow;
import com.bs.bean.ProActive;
import com.bs.bean.QueryVo;
import com.bs.bean.User;
import com.bs.bean.filename;
import com.bs.service.AdminService;
import com.bs.service.DevelopingPartymemService;
import com.bs.service.EducationService;
import com.bs.service.LifefileService;
import com.bs.service.NationService;
import com.bs.service.NativeplaceService;
import com.bs.service.OrganizationalLifeService;
import com.bs.service.PartymemDuesService;
import com.bs.service.PartymemInformationService;
import com.bs.service.PartymemOutflowService;
import com.bs.service.ProActiveService;
import com.bs.utils.SaveFile;

@Controller
@RequestMapping("Admin")
public class AdminController {
	@Autowired
	private AdminService adminService; // 管理员

	@Autowired
	private DevelopingPartymemService developingPartymemService; // 发展党员
	@Autowired
	private EducationService educationService; // 文化水平
	@Autowired
	private NationService nationService; // 民族
	@Autowired
	private NativeplaceService nativeplaceService; // 籍贯
	@Autowired
	private OrganizationalLifeService organizationalLifeService; // 组织生活
	@Autowired
	private PartymemDuesService partymemDuesService; // 党费
	@Autowired
	private PartymemInformationService partymemInformationService; // 党员流入
	@Autowired
	private PartymemOutflowService partymemOutflowService; // 党员流出
	@Autowired
	private ProActiveService proActiveService; // 入党积极分子
	@Autowired
	private LifefileService lifefileService;
	
	/*
	 * 党员信息模块
	 * 
	 * 
	 */
	@RequestMapping("QueryPartymemInformation")
	public ModelAndView partymemInformation(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
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
	    vo.setOname(request.getParameter("jgmc"));; //机构名称查询关键字
	    vo.setName(request.getParameter("xm")); //姓名查询关键字
	    vo.setBirth(request.getParameter("csrq")); //出生日期查询关键字
	    vo.setJoiningtime(request.getParameter("rdsj")); //入党时间查询关键字
	    vo.setOriginphone(request.getParameter("yjgdh")); //原机构电话查询关键字
	    vo.setOriginname(request.getParameter("yjgmc")); //原机构名称查询关键字
	    vo.setInftime(request.getParameter("lrsj"));; //流入时间查询关键字
	    vo.setNation(request.getParameter("nation"));; //民族查询关键字
	    vo.setNativePlace(request.getParameter("nativePlace"));; //籍贯查询关键字
	    vo.setEducationLevel(request.getParameter("educationLevel"));; //文化查询关键字
	    if(vo.getCurrentPage() == null){
			vo.setCurrentPage(1);
		}
		System.out.println(vo.getNation()+vo.getNativePlace()+vo.getName());
		//设置查询的起始记录条�?
		vo.setStart((vo.getCurrentPage() - 1) * vo.getSize());
		ModelAndView modelAndView=new ModelAndView("Dyxx_frontquery_result");
		List<PartymemInformation> PartymemList = partymemInformationService.selectByPage(vo);
		int count = partymemInformationService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("PartymemList",PartymemList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
	}
	@RequestMapping("insertPartymemInformationPage")
	public ModelAndView insertPartymemInformationPage(){
		ModelAndView modelAndView=new ModelAndView("Dyxx_add");
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
		
	}
	@RequestMapping("insertPartymemInformation")
	public ModelAndView insertPartymemInformation(@RequestPart("avatar")MultipartFile avatarFile,PartymemInformation partymemInformation, HttpServletRequest request, HttpSession session){
		ModelAndView modelAndView=new ModelAndView("Dyxx_frontquery_result");
		Integer uid=partymemInformation.getId();
		String fileName=avatarFile.getOriginalFilename();
        String suffix=fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
        Long date=new Date().getTime();
        String newFileName=date+"-"+uid+"."+suffix;
        String absolutePath=session.getServletContext().getRealPath("img/avatar")+"/"+newFileName;
        String relativePath="img/avatar"+"/"+newFileName;
        partymemInformation.setPhoto(relativePath);
        File file=new File(absolutePath);
        if (!file.exists()){
            try {
                avatarFile.transferTo(file);
                partymemInformationService.insert(partymemInformation);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
		
		return modelAndView;
		
	}
	@RequestMapping("deletePartymemInformation")
	public ModelAndView deletePartymemInformation(HttpServletRequest request){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Dyxx_frontquery_result");
		partymemInformationService.deleteByPrimaryKey(Integer.parseInt(id));
		return modelAndView;
		
	}
	@RequestMapping("updatePartymemInformation")
	public ModelAndView updatePartymemInformation(@RequestPart("avatar")MultipartFile avatarFile, HttpServletRequest request, HttpSession session,PartymemInformation partymemInformation){
		ModelAndView modelAndView=new ModelAndView("Dyxx_frontquery_result");
		Integer uid=partymemInformation.getId();
		String fileName=avatarFile.getOriginalFilename();
        String suffix=fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
        Long date=new Date().getTime();
        String newFileName=date+"-"+uid+"."+suffix;
        String absolutePath=session.getServletContext().getRealPath("img/avatar")+"/"+newFileName;
        String relativePath="img/avatar"+"/"+newFileName;
        partymemInformation.setPhoto(relativePath);
        File file=new File(absolutePath);
        if (!file.exists()){
            try {
                avatarFile.transferTo(file);
                partymemInformationService.insert(partymemInformation);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
		partymemInformationService.updateByPrimaryKey(partymemInformation);
		return modelAndView;
		
	}
	@RequestMapping("paymentPartymemPage")
	public ModelAndView paymentPage(HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("Dfxx_add");
		Date date = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"); 
		String particularYear = sdf.format(date.getTime());
		String id = request.getParameter("id");
		PartymemDues partymemDues = new PartymemDues();
		partymemDues.setParticularYear(particularYear);
		partymemDues.setPartymemId(Integer.parseInt(id));
		partymemDues= partymemDuesService.selectByPartymemId(partymemDues);
		if(partymemDues == null){
			PartymemDues partymemDues2 = new PartymemDues();
			
			PartymemInformation partymemInformation = partymemInformationService.selectByPrimaryKey(Integer.parseInt(id));
			partymemDues2.setPartymemName(partymemInformation.getPartymemName());
			partymemDues2.setPartymemId(partymemInformation.getId());
			partymemDues2.setOrganizationName(partymemInformation.getOrganizationName());
			partymemDues2.setParticularYear(sdf.format(date.getTime()));
			partymemDues = partymemDues2;
		}
		
		modelAndView.addObject("partymemDues",partymemDues);
		return modelAndView;
	}
	@RequestMapping("paymentPartymem")
	public ModelAndView payment(PartymemDues partymemDues,HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("Dfxx_add");
		if(partymemDues.getId() == null){
			System.out.println("空");
			partymemDuesService.insert(partymemDues);
		}else
		partymemDuesService.updateByPrimaryKey(partymemDues);
		return modelAndView;
	}
	@RequestMapping("ShowPartymemQuery")
	public ModelAndView ShowPartymemQuery(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Dyxx_modify");
		PartymemInformation partymem = partymemInformationService.selectByPrimaryKey(Integer.parseInt(id));
		modelAndView.addObject("partymem",partymem);
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
	}
	
	/*
	 * 党员信息模块结束
	 * 
	 */
	/*
	 * 党员流出模块
	 * 
	 * 
	 */
	@RequestMapping("QueryPartymemOutflow")
	public ModelAndView QueryPartymemOutflow(HttpServletRequest request, HttpServletResponse response){
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
	    vo.setOname(request.getParameter("jgmc"));; //机构名称查询关键字
	    vo.setName(request.getParameter("xm")); //姓名查询关键字
	    vo.setBirth(request.getParameter("csrq")); //出生日期查询关键字
	    vo.setJoiningtime(request.getParameter("rdsj")); //入党时间查询关键字
	    vo.setOutftime(request.getParameter("lcrq")); //流出日期
	    vo.setOutfcauses(request.getParameter("lcyy")); //流出原因
	    vo.setNation(request.getParameter("nation"));; //民族查询关键字
	    vo.setNativePlace(request.getParameter("nativePlace"));; //籍贯查询关键字
	    vo.setEducationLevel(request.getParameter("educationLevel"));; //文化查询关键字
	    if(vo.getCurrentPage() == null){
			vo.setCurrentPage(1);
		}
		
		//设置查询的起始记录条�?
		vo.setStart((vo.getCurrentPage() - 1) * vo.getSize());
		ModelAndView modelAndView=new ModelAndView("Dylc_frontquery_result");
		List<PartymemOutflow> partymemOutflowList = partymemOutflowService.selectByPage(vo);
		int count = partymemOutflowService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("partymemOutflowList",partymemOutflowList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
	}
	@RequestMapping("insertPartymemOutflowPage")
	public ModelAndView insertPartymemOutflowPage(){
		ModelAndView modelAndView=new ModelAndView("Dylc_add");
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
		
	}
	@RequestMapping("insertPartymemOutflow")
	public ModelAndView insertPartymemInformation(@RequestPart("avatar")MultipartFile avatarFile, HttpServletRequest request, HttpSession session,PartymemOutflow partymemOutflow){
		ModelAndView modelAndView=new ModelAndView("Dylc_frontquery_result");
		Integer uid=partymemOutflow.getId();
		String fileName=avatarFile.getOriginalFilename();
        String suffix=fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
        Long date=new Date().getTime();
        String newFileName=date+"-"+uid+"."+suffix;
        String absolutePath=session.getServletContext().getRealPath("img/avatar")+"/"+newFileName;
        String relativePath="img/avatar"+"/"+newFileName;
        partymemOutflow.setPhoto(relativePath);
        File file=new File(absolutePath);
        if (!file.exists()){
            try {
                avatarFile.transferTo(file);
                partymemOutflowService.insert(partymemOutflow);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
		//partymemOutflowService.insert(partymemOutflow);
		return modelAndView;
		
	}@RequestMapping("updatePartymemOutflow")
	public ModelAndView updatePartymemInformation(@RequestPart("avatar")MultipartFile avatarFile, HttpServletRequest request, HttpSession session,PartymemOutflow partymemOutflow){
		ModelAndView modelAndView=new ModelAndView("Dylc_frontquery_result");
		Integer uid=partymemOutflow.getId();
		String fileName=avatarFile.getOriginalFilename();
        String suffix=fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
        Long date=new Date().getTime();
        String newFileName=date+"-"+uid+"."+suffix;
        String absolutePath=session.getServletContext().getRealPath("img/avatar")+"/"+newFileName;
        String relativePath="img/avatar"+"/"+newFileName;
        partymemOutflow.setPhoto(relativePath);
        File file=new File(absolutePath);
        if (!file.exists()){
            try {
                avatarFile.transferTo(file);
                partymemOutflowService.updateByPrimaryKey(partymemOutflow);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
		
		return modelAndView;
		
	}
	@RequestMapping("deletePartymemOutflow")
	public ModelAndView deletePartymemOutflow(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Dylc_frontquery_result");
		partymemOutflowService.deleteByPrimaryKey(Integer.parseInt(id));
		return modelAndView;
	}
	@RequestMapping("ShowPartymemOutflow")
	public ModelAndView ShowPartymemOutflow(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Dylc_modify");
		PartymemOutflow partymemOutflow = partymemOutflowService.selectByPrimaryKey(Integer.parseInt(id));
		modelAndView.addObject("partymemOutflow",partymemOutflow);
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
	}
	/*
	 * 发展党员模块
	 * 
	 * 
	 */
	@RequestMapping("QueryDevelopingPartymem")
	public ModelAndView QueryDevelopingPartymem(HttpServletRequest request, HttpServletResponse response){
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
	    vo.setOname(request.getParameter("jgmc"));; //机构名称查询关键字
	    vo.setName(request.getParameter("xm")); //姓名查询关键字
	    vo.setBirth(request.getParameter("csrq")); //出生日期查询关键字
	    vo.setIncubatime(request.getParameter("pysj")); //培养时间
	    vo.setIncubapeople(request.getParameter("pyr")); //培养人
	    vo.setDeveldate(request.getParameter("fzrq")); //发展日期
	    vo.setNation(request.getParameter("nation"));; //民族查询关键字
	    vo.setNativePlace(request.getParameter("nativePlace"));; //籍贯查询关键字
	    vo.setEducationLevel(request.getParameter("educationLevel"));; //文化查询关键字
	    if(vo.getCurrentPage() == null){
			vo.setCurrentPage(1);
		}
		
		//设置查询的起始记录条�?
		vo.setStart((vo.getCurrentPage() - 1) * vo.getSize());
		ModelAndView modelAndView=new ModelAndView("Fzdy_frontquery_result");
		List<DevelopingPartymem> developingPartymemList = developingPartymemService.selectByPage(vo);
		int count = developingPartymemService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("developingPartymemList",developingPartymemList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
	}
	@RequestMapping("insertDevelopingPartymemPage")
	public ModelAndView insertDevelopingPartymemPage(){
		ModelAndView modelAndView=new ModelAndView("Fzdy_add");
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
		
	}
	@RequestMapping("insertDevelopingPartymem")
	public ModelAndView insertDevelopingPartymem(DevelopingPartymem developingPartymem){
		ModelAndView modelAndView=new ModelAndView("Fzdy_frontquery_result");
		developingPartymemService.insert(developingPartymem);
		return modelAndView;
		
	}
	@RequestMapping("updateDevelopingPartymem")
	public ModelAndView updateDevelopingPartymem(DevelopingPartymem developingPartymem){
		ModelAndView modelAndView=new ModelAndView("Fzdy_frontquery_result");
		developingPartymemService.updateByPrimaryKey(developingPartymem);
		return modelAndView;
		
	}
	@RequestMapping("deleteDevelopingPartymem")
	public ModelAndView deleteDevelopingPartymem(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Fzdy_frontquery_result");
		developingPartymemService.deleteByPrimaryKey(Integer.parseInt(id));
		return modelAndView;
	}
	@RequestMapping("ShowDevelopingPartymem")
	public ModelAndView ShowDevelopingPartymem(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Fzdy_modify");
		DevelopingPartymem developingPartymem = developingPartymemService.selectByPrimaryKey(Integer.parseInt(id));
		modelAndView.addObject("developingPartymem",developingPartymem);
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
	}
	/*
	 * 入党积极分子模块
	 * 
	 * 
	 */
	@RequestMapping("QueryProActive")
	public ModelAndView QueryProActive(HttpServletRequest request, HttpServletResponse response){
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
	    vo.setOname(request.getParameter("jgmc"));; //机构名称查询关键字
	    vo.setName(request.getParameter("xm")); //姓名查询关键字
	    vo.setBirth(request.getParameter("csrq")); //出生日期查询关键字
	    vo.setIncubatime(request.getParameter("pysj")); //培养时间
	    vo.setNation(request.getParameter("nation"));; //民族查询关键字
	    vo.setNativePlace(request.getParameter("nativePlace"));; //籍贯查询关键字
	    vo.setEducationLevel(request.getParameter("educationLevel"));; //文化查询关键字
	    if(vo.getCurrentPage() == null){
			vo.setCurrentPage(1);
		}
		
		//设置查询的起始记录条�?
		vo.setStart((vo.getCurrentPage() - 1) * vo.getSize());
		ModelAndView modelAndView=new ModelAndView("Rdjjfz_frontquery_result");
		List<ProActive> proActiveList = proActiveService.selectByPage(vo);
		int count = proActiveService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("proActiveList",proActiveList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
	}
	@RequestMapping("insertProActivePage")
	public ModelAndView insertProActivePage(){
		ModelAndView modelAndView=new ModelAndView("Rdjjfz_add");
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
		
	}
	@RequestMapping("insertProActive")
	public ModelAndView insertProActive(@RequestPart("avatar")MultipartFile avatarFile, HttpServletRequest request, HttpSession session,ProActive proActive){
		ModelAndView modelAndView=new ModelAndView("Rdjjfz_frontquery_result");
		Integer uid=proActive.getId();
		String fileName=avatarFile.getOriginalFilename();
        String suffix=fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
        Long date=new Date().getTime();
        String newFileName=date+"-"+uid+"."+suffix;
        String absolutePath=session.getServletContext().getRealPath("img/avatar")+"/"+newFileName;
        String relativePath="img/avatar"+"/"+newFileName;
        proActive.setPhoto(relativePath);
        File file=new File(absolutePath);
        if (!file.exists()){
            try {
                avatarFile.transferTo(file);
                proActiveService.insert(proActive);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
		
		return modelAndView;
		
	}
	@RequestMapping("updateBProActive")
	public ModelAndView updateBProActive(@RequestPart("avatar")MultipartFile avatarFile, HttpServletRequest request, HttpSession session,ProActive proActive){
		ModelAndView modelAndView=new ModelAndView("Rdjjfz_frontquery_result");
		Integer uid=proActive.getId();
		String fileName=avatarFile.getOriginalFilename();
        String suffix=fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
        Long date=new Date().getTime();
        String newFileName=date+"-"+uid+"."+suffix;
        String absolutePath=session.getServletContext().getRealPath("img/avatar")+"/"+newFileName;
        String relativePath="img/avatar"+"/"+newFileName;
        proActive.setPhoto(relativePath);
        File file=new File(absolutePath);
        if (!file.exists()){
            try {
                avatarFile.transferTo(file);
                proActiveService.insert(proActive);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
		proActiveService.updateByPrimaryKey(proActive);
		return modelAndView;
		
	}
	@RequestMapping("deleteProActive")
	public ModelAndView deleteProActive(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Rdjjfz_frontquery_result");
		proActiveService.deleteByPrimaryKey(Integer.parseInt(id));
		return modelAndView;
	}
	@RequestMapping("ShowProActive")
	public ModelAndView ShowProActive(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Rdjjfz_modify");
		ProActive proActive = proActiveService.selectByPrimaryKey(Integer.parseInt(id));
		modelAndView.addObject("proActive",proActive);
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
	}
	/*
	 * 组织生活模块
	 * 
	 * 
	 */
	@RequestMapping("QueryOrganizationalLife")
	public ModelAndView QueryOrganizationalLife(HttpServletRequest request, HttpServletResponse response){
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

		vo.setOrganunit(request.getParameter("zzdw"));; //组织单位查询关键字
		vo.setActname(request.getParameter("hdmc"));; //活动名称查询关键字
		vo.setPersoncha(request.getParameter("fzr"));; //负责人查询关键字
		vo.setActtime(request.getParameter("sj"));; //时间查询关键字
	    
	    if(vo.getCurrentPage() == null){
			vo.setCurrentPage(1);
		}
		
		//设置查询的起始记录条�?
		vo.setStart((vo.getCurrentPage() - 1) * vo.getSize());
		ModelAndView modelAndView=new ModelAndView("Zzsh_frontquery_result");
		List<OrganizationalLife> organizationalLifeList = organizationalLifeService.selectByPage(vo);
		for(int i=0;i<organizationalLifeList.size();i++){
		List<LifeFile> LifeFileList = lifefileService.selectAllByoid(organizationalLifeList.get(i).getId());
		organizationalLifeList.get(i).setLifeFile(LifeFileList);
		}
		int count = organizationalLifeService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("organizationalLifeList",organizationalLifeList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		return modelAndView;
	}
	@RequestMapping("insertOrganizationalLifePage")
	public ModelAndView insertOrganizationalLifePage(){
		ModelAndView modelAndView=new ModelAndView("Zzsh_add");
		//民族、文化程度、籍贯模块
		modelAndView.addObject("nation",nationService.selectAll());
		modelAndView.addObject("nativeplace",nativeplaceService.selectAll());
		modelAndView.addObject("education",educationService.selectAll());
		return modelAndView;
		
	}
	@RequestMapping("insertOrganizationalLife")
	public ModelAndView insertOrganizationalLife(OrganizationalLife organizationalLife,HttpSession session,HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("Zzsh_frontquery_result");
		organizationalLifeService.insert(organizationalLife);
		organizationalLife = organizationalLifeService.selectByname(organizationalLife.getActivityName());
		List<filename> nameListsees = (List<filename>)session.getAttribute("nameList");
		LifeFile life = new LifeFile();
		for (int i = 0; i < nameListsees.size(); i++) {
			life.setContentfile(nameListsees.get(i).getFilename());
			life.setFiletype(nameListsees.get(i).getFiletype());
			life.setOlifeid(organizationalLife.getId());
			int result = lifefileService.insertSelective(life);
		}
		return modelAndView;
		
	}
	@RequestMapping("updateOrganizationalLife")
	public ModelAndView updateOrganizationalLife(OrganizationalLife organizationalLife,HttpSession session,HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("Zzsh_frontquery_result");
		organizationalLifeService.updateByPrimaryKeySelective(organizationalLife);
		/*organizationalLife = organizationalLifeService.selectByname(organizationalLife.getActivityName());
		List<filename> nameListsees = (List<filename>)session.getAttribute("nameList");
		LifeFile life = new LifeFile();
		for (int i = 0; i < nameListsees.size(); i++) {
			life.setContentfile(nameListsees.get(i).getFilename());
			life.setFiletype(nameListsees.get(i).getFiletype());
			life.setOlifeid(organizationalLife.getId());
			int result = lifefileService.insertSelective(life);
		}*/
		return modelAndView;
		
	}
	@RequestMapping("deleteOrganizationalLife")
	public ModelAndView deleteOrganizationalLife(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Zzsh_frontquery_result");
		organizationalLifeService.deleteByPrimaryKey(Integer.parseInt(id));
		return modelAndView;
	}
	@RequestMapping("down")
	public void down(HttpServletRequest request, HttpServletResponse response) throws IOException{
String id = request.getParameter("id");
		
		String sname = request.getParameter("name");
		
		LifeFile lifeFile = lifefileService.selectByPrimaryKey(Integer.parseInt(id));
		
        String fileName = "E:/myvod/video/"+lifeFile.getContentfile()+lifeFile.getFiletype();  
        
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));  
          
        String filename = lifeFile.getOlifeid()+sname+lifeFile.getFiletype();  
        
        filename = URLEncoder.encode(filename,"UTF-8");  
        
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
            
        response.setContentType("multipart/form-data");   
        
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();  
	}
	@RequestMapping("ShowOrganizationalLife")
	public ModelAndView ShowOrganizationalLife(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Zzsh_modify");
		OrganizationalLife organizationalLife = organizationalLifeService.selectByPrimaryKey(Integer.parseInt(id));
		modelAndView.addObject("organizationalLife",organizationalLife);
		return modelAndView;
	}
	@RequestMapping("updateOrganizationalLifefile")
	public String updateOrganizationalLifefile(LifeFile life,HttpSession session,HttpServletRequest request){
		List<filename> nameListsees = (List<filename>)session.getAttribute("nameList");
		for (int i = 0; i < nameListsees.size(); i++) {
			life.setContentfile(nameListsees.get(i).getFilename());
			life.setFiletype(nameListsees.get(i).getFiletype());
			int result = lifefileService.insertSelective(life);
		}
			return "success";
	}
	/*
	 * 党费信息模块
	 * 
	 */
	@RequestMapping("QueryPartymemDues")
	public ModelAndView QueryPartymemDues(HttpServletRequest request, HttpServletResponse response){
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

		vo.setOrganunit(request.getParameter("zzdw"));; //组织单位查询关键字
		vo.setActname(request.getParameter("hdmc"));; //活动名称查询关键字
		vo.setPersoncha(request.getParameter("fzr"));; //负责人查询关键字
		vo.setActtime(request.getParameter("sj"));; //时间查询关键字
	    
	    if(vo.getCurrentPage() == null){
			vo.setCurrentPage(1);
		}
		
		//设置查询的起始记录条�?
		vo.setStart((vo.getCurrentPage() - 1) * vo.getSize());
		ModelAndView modelAndView=new ModelAndView("Dfxx_query_result");
		List<PartymemDues> organizationalLifeList = partymemDuesService.selectByPage(vo);
		int count = partymemDuesService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("organizationalLifeList",organizationalLifeList);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		return modelAndView;
	}
	/*
	 * 系统参数设置
	 * 
	 */
	//民族信息
	@RequestMapping("insertNationPage")
	public ModelAndView insertNationPage(){
		ModelAndView modelAndView=new ModelAndView("Mzxx_add");
		
		return modelAndView;
		
	}
	@RequestMapping("insertNation")
	public ModelAndView insertNation(Nation nation){
		ModelAndView modelAndView=new ModelAndView("Mzxx_query_result");
		System.out.println(nation);
		nationService.insert(nation);
		return modelAndView;
		
	}
	@RequestMapping("QueryNation")
	public ModelAndView QueryNation(HttpServletRequest request, HttpServletResponse response){
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
		ModelAndView modelAndView=new ModelAndView("Mzxx_query_result");
		List<Nation> nation = nationService.selectByPage(vo);
		int count = nationService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("nation",nation);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		return modelAndView;
	}
	@RequestMapping("deleteNation")
	public ModelAndView deleteNation(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Mzxx_query_result");
		nationService.deleteByPrimaryKey(Integer.parseInt(id));
		return modelAndView;
	}
	@RequestMapping("modifyNationPage")
	public ModelAndView modifyNationPage(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Mzxx_modify");
		Nation nation = nationService.selectByPrimaryKey(Integer.parseInt(id));
		System.out.println(id+nation);
		modelAndView.addObject("nation",nation);
		return modelAndView;
	}
	@RequestMapping("modifyNation")
	public ModelAndView modifyNation(Nation nation){
		ModelAndView modelAndView=new ModelAndView("Mzxx_query_result");
		System.out.println(nation);
		nationService.updateByPrimaryKey(nation);
		return modelAndView;
	}
	
	//籍贯信息
	@RequestMapping("insertNativeplacePage")
	public ModelAndView insertNativeplacePage(){
		ModelAndView modelAndView=new ModelAndView("Jgxx_add");
		
		return modelAndView;
		
	}
	@RequestMapping("insertNativeplace")
	public ModelAndView insertNativeplace(Nativeplace nativeplace){
		ModelAndView modelAndView=new ModelAndView("Jgxx_query_result");
		nativeplaceService.insert(nativeplace);
		return modelAndView;
		
	}
	@RequestMapping("QueryNativeplace")
	public ModelAndView QueryNativeplace(HttpServletRequest request, HttpServletResponse response){
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
		ModelAndView modelAndView=new ModelAndView("Jgxx_query_result");
		List<Nativeplace> nativeplace = nativeplaceService.selectByPage(vo);
		int count = nativeplaceService.count(vo);
		int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
		vo.setTotalPage(totalPageNum);
		modelAndView.addObject("nativeplace",nativeplace);
		modelAndView.addObject("count",count);
		modelAndView.addObject("vo",vo);
		return modelAndView;
	}
	@RequestMapping("deleteNativeplace")
	public ModelAndView deleteNativeplace(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Jgxx_query_result");
		nativeplaceService.deleteByPrimaryKey(Integer.parseInt(id));
		return modelAndView;
	}
	@RequestMapping("modifyNativeplacePage")
	public ModelAndView modifyNativeplacePage(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");
		ModelAndView modelAndView=new ModelAndView("Jgxx_modify");
		Nativeplace nativeplace = nativeplaceService.selectByPrimaryKey(Integer.parseInt(id));
		modelAndView.addObject("nativeplace",nativeplace);
		return modelAndView;
	}
	@RequestMapping("modifyNativeplace")
	public ModelAndView modifyNativeplace(Nativeplace nativeplace){
		ModelAndView modelAndView=new ModelAndView("Jgxx_query_result");
		nativeplaceService.updateByPrimaryKey(nativeplace);
		return modelAndView;
	}
	//文化程度信息
		@RequestMapping("insertEducationPage")
		public ModelAndView insertEducationPage(){
			ModelAndView modelAndView=new ModelAndView("Whcd_add");
			
			return modelAndView;
			
		}
		@RequestMapping("insertEducation")
		public ModelAndView insertEducation(Education education){
			ModelAndView modelAndView=new ModelAndView("Whcd_query_result");
			educationService.insert(education);
			return modelAndView;
			
		}
		@RequestMapping("QueryEducation")
		public ModelAndView QueryEducation(HttpServletRequest request, HttpServletResponse response){
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
			ModelAndView modelAndView=new ModelAndView("Whcd_query_result");
			List<Education> education = educationService.selectByPage(vo);
			int count = educationService.count(vo);
			int totalPageNum = (count  +  vo.getSize()  - 1) / vo.getSize();
			vo.setTotalPage(totalPageNum);
			modelAndView.addObject("education",education);
			modelAndView.addObject("count",count);
			modelAndView.addObject("vo",vo);
			return modelAndView;
		}
		@RequestMapping("deleteEducation")
		public ModelAndView deleteEducation(HttpServletRequest request, HttpServletResponse response){
			String id = request.getParameter("id");
			ModelAndView modelAndView=new ModelAndView("Whcd_query_result");
			educationService.deleteByPrimaryKey(Integer.parseInt(id));
			return modelAndView;
		}
		@RequestMapping("modifyEducationPage")
		public ModelAndView modifyEducationPage(HttpServletRequest request, HttpServletResponse response){
			String id = request.getParameter("id");
			ModelAndView modelAndView=new ModelAndView("Whcd_modify");
			Education education = educationService.selectByPrimaryKey(Integer.parseInt(id));
			modelAndView.addObject("education",education);
			return modelAndView;
		}
		@RequestMapping("modifyEducation")
		public ModelAndView modifyEducation(Education education){
			ModelAndView modelAndView=new ModelAndView("Whcd_query_result");
			educationService.updateByPrimaryKey(education);
			return modelAndView;
		}
		@RequestMapping("AdminModifyPage")
		public ModelAndView AdminModifyPage(HttpSession session,HttpServletRequest request){
			ModelAndView modelAndView=new ModelAndView("password_modify");

			return modelAndView;
		}
		@RequestMapping("AdminModify")
		public ModelAndView AdminModify(Admin admin,HttpSession session,HttpServletRequest request){
			ModelAndView modelAndView=new ModelAndView("error");
			String oldPassword = request.getParameter("oldPassword");
			String newPassword = request.getParameter("newPassword");
			String newPassword2 = request.getParameter("newPassword2");
			String oldPassword1 = (String)session.getAttribute("AdminPassword");
			int id = (int)session.getAttribute("AdminId");
			if(oldPassword.equals(oldPassword1)){
				if(newPassword.equals(newPassword2)){
					admin.setId(id);
					admin.setPassword(newPassword2);
					adminService.updateByPrimaryKeySelective(admin);
					modelAndView.addObject("error", "修改成功");
				}else{
					modelAndView.addObject("error", "两次密码输入不一致");
				}
			}else{
				modelAndView.addObject("error", "旧密码密码输入错误");
			}
			
			return modelAndView;
		}
}
