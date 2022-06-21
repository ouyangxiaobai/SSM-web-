package com.bs.service;

import java.util.List;

import com.bs.bean.ProActive;
import com.bs.bean.QueryVo;

public interface ProActiveService {

	ProActive selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(ProActive record);
	
	ProActive selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(ProActive record);

    int updateByPrimaryKey(ProActive record);
    
    int count(QueryVo vo);
    
    List<ProActive> selectByPage(QueryVo vo);
}
