package com.bs.dao;

import com.bs.bean.PartymemOutflow;
import com.bs.bean.PartymemOutflowExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartymemOutflowMapper {
    int countByExample(PartymemOutflowExample example);

    int deleteByExample(PartymemOutflowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartymemOutflow record);

    int insertSelective(PartymemOutflow record);

    List<PartymemOutflow> selectByExample(PartymemOutflowExample example);

    PartymemOutflow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartymemOutflow record, @Param("example") PartymemOutflowExample example);

    int updateByExample(@Param("record") PartymemOutflow record, @Param("example") PartymemOutflowExample example);

    int updateByPrimaryKeySelective(PartymemOutflow record);

    int updateByPrimaryKey(PartymemOutflow record);

	List<PartymemOutflow> selectByPage(QueryVo vo);

	int count(QueryVo vo);
}