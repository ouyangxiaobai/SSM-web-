package com.bs.dao;

import com.bs.bean.BonusPenalty;
import com.bs.bean.BonusPenaltyExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BonusPenaltyMapper {
    int countByExample(BonusPenaltyExample example);

    int deleteByExample(BonusPenaltyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BonusPenalty record);

    int insertSelective(BonusPenalty record);

    List<BonusPenalty> selectByExample(BonusPenaltyExample example);

    BonusPenalty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BonusPenalty record, @Param("example") BonusPenaltyExample example);

    int updateByExample(@Param("record") BonusPenalty record, @Param("example") BonusPenaltyExample example);

    int updateByPrimaryKeySelective(BonusPenalty record);

    int updateByPrimaryKey(BonusPenalty record);
    
    List<BonusPenalty> selectByPage(QueryVo vo);

	int count(QueryVo vo);
}