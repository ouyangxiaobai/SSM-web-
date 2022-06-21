package com.bs.dao;

import com.bs.bean.ProActive;
import com.bs.bean.ProActiveExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProActiveMapper {
    int countByExample(ProActiveExample example);

    int deleteByExample(ProActiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProActive record);

    int insertSelective(ProActive record);

    List<ProActive> selectByExample(ProActiveExample example);

    ProActive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProActive record, @Param("example") ProActiveExample example);

    int updateByExample(@Param("record") ProActive record, @Param("example") ProActiveExample example);

    int updateByPrimaryKeySelective(ProActive record);

    int updateByPrimaryKey(ProActive record);
    
    List<ProActive> selectByPage(QueryVo vo);

	int count(QueryVo vo);
}