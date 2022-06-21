package com.bs.dao;

import com.bs.bean.OrganizationalLife;
import com.bs.bean.OrganizationalLifeExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationalLifeMapper {
    int countByExample(OrganizationalLifeExample example);

    int deleteByExample(OrganizationalLifeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrganizationalLife record);

    int insertSelective(OrganizationalLife record);

    List<OrganizationalLife> selectByExample(OrganizationalLifeExample example);

    OrganizationalLife selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrganizationalLife record, @Param("example") OrganizationalLifeExample example);

    int updateByExample(@Param("record") OrganizationalLife record, @Param("example") OrganizationalLifeExample example);

    int updateByPrimaryKeySelective(OrganizationalLife record);

    int updateByPrimaryKey(OrganizationalLife record);
    
    List<OrganizationalLife> selectByPage(QueryVo vo);

	int count(QueryVo vo);

	OrganizationalLife selectByname(String activityName);

}