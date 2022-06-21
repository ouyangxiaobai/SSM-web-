package com.bs.dao;

import com.bs.bean.Nativeplace;
import com.bs.bean.NativeplaceExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NativeplaceMapper {
    int countByExample(NativeplaceExample example);

    int deleteByExample(NativeplaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nativeplace record);

    int insertSelective(Nativeplace record);

    List<Nativeplace> selectByExample(NativeplaceExample example);

    Nativeplace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nativeplace record, @Param("example") NativeplaceExample example);

    int updateByExample(@Param("record") Nativeplace record, @Param("example") NativeplaceExample example);

    int updateByPrimaryKeySelective(Nativeplace record);

    int updateByPrimaryKey(Nativeplace record);

	int count(QueryVo vo);

	List<Nativeplace> selectByPage(QueryVo vo);

	List<Nativeplace> selectAll();
}