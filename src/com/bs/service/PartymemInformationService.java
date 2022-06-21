package com.bs.service;

import java.util.List;

import com.bs.bean.PartymemInformation;
import com.bs.bean.PartymemOutflow;
import com.bs.bean.QueryVo;

public interface PartymemInformationService {

	PartymemInformation selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(PartymemInformation record);
	
	PartymemInformation selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(PartymemInformation record);

    int updateByPrimaryKey(PartymemInformation record);
    
    int count(QueryVo vo);

	List<PartymemInformation> selectByPage(QueryVo vo);

}
