package com.bs.service;

import com.bs.bean.Admin;

public interface AdminService {
	
	Admin selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(Admin record);
	
	Admin selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    
    int count();

	int login(String username, String password);
}
