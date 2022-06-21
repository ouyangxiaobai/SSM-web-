package com.bs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.bean.LifeFile;
import com.bs.bean.LifeFileExample;

public interface LifefileService {
	int deleteByPrimaryKey(Integer id);

    int insert(LifeFile record);

    int insertSelective(LifeFile record);

    LifeFile selectByPrimaryKey(Integer id);

    LifeFile selectByoid(Integer id);
    
    List<LifeFile> selectAllByoid(Integer id);
    
    int updateByPrimaryKeySelective(LifeFile record);

    int updateByPrimaryKey(LifeFile record);
}
