package com.bs.service;

import java.util.List;

import com.bs.bean.Education;
import com.bs.bean.QueryVo;

public interface EducationService {

	Education selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(Education record);
	
	Education selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
    
    int count(QueryVo vo);
    
    List<Education> selectByPage(QueryVo vo);
    
    List<Education> selectAll();
}
