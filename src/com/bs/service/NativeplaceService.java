package com.bs.service;

import java.util.List;

import com.bs.bean.Nativeplace;
import com.bs.bean.QueryVo;

public interface NativeplaceService {

	Nativeplace selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(Nativeplace record);
	
	Nativeplace selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(Nativeplace record);

    int updateByPrimaryKey(Nativeplace record);
    
    int count(QueryVo vo);
    
    List<Nativeplace> selectByPage(QueryVo vo);
    
    List<Nativeplace> selectAll();
}
