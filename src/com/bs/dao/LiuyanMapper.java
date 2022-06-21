package com.bs.dao;

import com.bs.bean.Liuyan;
import com.bs.bean.LiuyanExample;
import com.bs.bean.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiuyanMapper {
    int countByExample(LiuyanExample example);

    int deleteByExample(LiuyanExample example);

    int deleteByPrimaryKey(Integer liuyanId);

    int insert(Liuyan record);

    int insertSelective(Liuyan record);

    List<Liuyan> selectByExample(LiuyanExample example);

    Liuyan selectByPrimaryKey(Integer liuyanId);

    int updateByExampleSelective(@Param("record") Liuyan record, @Param("example") LiuyanExample example);

    int updateByExample(@Param("record") Liuyan record, @Param("example") LiuyanExample example);

    int updateByPrimaryKeySelective(Liuyan record);

    int updateByPrimaryKey(Liuyan record);

	List<Liuyan> selectAll();

	List<Liuyan> selectByPage(QueryVo vo);

	int count(QueryVo vo);
}