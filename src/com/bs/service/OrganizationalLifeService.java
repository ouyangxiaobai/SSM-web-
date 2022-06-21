package com.bs.service;

import java.util.List;

import com.bs.bean.OrganizationalLife;
import com.bs.bean.QueryVo;

public interface OrganizationalLifeService {

	OrganizationalLife selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OrganizationalLife record);
	
	OrganizationalLife selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(OrganizationalLife record);

    int updateByPrimaryKey(OrganizationalLife record);
    
    int count(QueryVo vo);
    
    List<OrganizationalLife> selectByPage(QueryVo vo);

	OrganizationalLife selectByname(String activityName);
}
