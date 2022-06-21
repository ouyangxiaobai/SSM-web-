package com.bs.service;

import java.util.List;

import com.bs.bean.Nation;
import com.bs.bean.QueryVo;

public interface NationService {

	Nation selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(Nation record);
	
	Nation selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
    
    int count(QueryVo vo);
    
    List<Nation> selectByPage(QueryVo vo);
    
    List<Nation> selectAll();
}
