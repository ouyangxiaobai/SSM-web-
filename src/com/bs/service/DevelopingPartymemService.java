package com.bs.service;

import java.util.List;

import com.bs.bean.DevelopingPartymem;
import com.bs.bean.QueryVo;

public interface DevelopingPartymemService {

	DevelopingPartymem selectByUsername(String username);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(DevelopingPartymem record);
	
	DevelopingPartymem selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(DevelopingPartymem record);

    int updateByPrimaryKey(DevelopingPartymem record);
    
    int count(QueryVo vo);
    
    List<DevelopingPartymem> selectByPage(QueryVo vo);
}
