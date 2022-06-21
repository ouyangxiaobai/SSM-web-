package com.bs.dao;

import com.bs.bean.DevelopingPartymem;
import com.bs.bean.DevelopingPartymemExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevelopingPartymemMapper {
    int countByExample(DevelopingPartymemExample example);

    int deleteByExample(DevelopingPartymemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DevelopingPartymem record);

    int insertSelective(DevelopingPartymem record);

    List<DevelopingPartymem> selectByExample(DevelopingPartymemExample example);

    DevelopingPartymem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DevelopingPartymem record, @Param("example") DevelopingPartymemExample example);

    int updateByExample(@Param("record") DevelopingPartymem record, @Param("example") DevelopingPartymemExample example);

    int updateByPrimaryKeySelective(DevelopingPartymem record);

    int updateByPrimaryKey(DevelopingPartymem record);
    
    List<DevelopingPartymem> selectByPage(QueryVo vo);

	int count(QueryVo vo);
}