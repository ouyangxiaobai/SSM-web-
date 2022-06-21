package com.bs.dao;

import com.bs.bean.PartymemInformation;
import com.bs.bean.PartymemInformationExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartymemInformationMapper {
    int countByExample(PartymemInformationExample example);

    int deleteByExample(PartymemInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartymemInformation record);

    int insertSelective(PartymemInformation record);

    List<PartymemInformation> selectByExample(PartymemInformationExample example);

    PartymemInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartymemInformation record, @Param("example") PartymemInformationExample example);

    int updateByExample(@Param("record") PartymemInformation record, @Param("example") PartymemInformationExample example);

    int updateByPrimaryKeySelective(PartymemInformation record);

    int updateByPrimaryKey(PartymemInformation record);

	List<PartymemInformation> selectByPage(QueryVo vo);

	Integer count(QueryVo vo);
}