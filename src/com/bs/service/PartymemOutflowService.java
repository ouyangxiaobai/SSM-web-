package com.bs.service;

import java.util.List;

import com.bs.bean.PartymemOutflow;
import com.bs.bean.QueryVo;

public interface PartymemOutflowService {

	PartymemOutflow selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(PartymemOutflow record);
	
	PartymemOutflow selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(PartymemOutflow record);

    int updateByPrimaryKey(PartymemOutflow record);
    
    int count(QueryVo vo);
    
    List<PartymemOutflow> selectByPage(QueryVo vo);
}
