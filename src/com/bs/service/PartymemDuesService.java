package com.bs.service;

import java.util.List;

import com.bs.bean.PartymemDues;
import com.bs.bean.QueryVo;

public interface PartymemDuesService {

	PartymemDues selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(PartymemDues record);
	
	PartymemDues selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(PartymemDues record);

    int updateByPrimaryKey(PartymemDues record);
    
    int count(QueryVo vo);
    
    List<PartymemDues> selectByPage(QueryVo vo);

	PartymemDues selectByPartymemId(PartymemDues record);
}
