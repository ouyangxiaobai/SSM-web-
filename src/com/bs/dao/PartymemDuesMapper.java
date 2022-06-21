package com.bs.dao;

import com.bs.bean.PartymemDues;
import com.bs.bean.PartymemDuesExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartymemDuesMapper {
    int countByExample(PartymemDuesExample example);

    int deleteByExample(PartymemDuesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartymemDues record);

    int insertSelective(PartymemDues record);

    List<PartymemDues> selectByExample(PartymemDuesExample example);

    PartymemDues selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartymemDues record, @Param("example") PartymemDuesExample example);

    int updateByExample(@Param("record") PartymemDues record, @Param("example") PartymemDuesExample example);

    int updateByPrimaryKeySelective(PartymemDues record);

    int updateByPrimaryKey(PartymemDues record);
    
    List<PartymemDues> selectByPage(QueryVo vo);

	int count(QueryVo vo);

	PartymemDues selectByPartymemId(@Param("record") PartymemDues record);

}