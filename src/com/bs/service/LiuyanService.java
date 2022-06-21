package com.bs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.bean.Liuyan;
import com.bs.bean.LiuyanExample;
import com.bs.bean.QueryVo;

public interface LiuyanService {
	int deleteByPrimaryKey(Integer liuyanId);

    int insert(Liuyan record);

    int insertSelective(Liuyan record);

    Liuyan selectByPrimaryKey(Integer liuyanId);

    int updateByPrimaryKeySelective(Liuyan record);

    int updateByPrimaryKey(Liuyan record);

	List<Liuyan> selectAll();

	List<Liuyan> selectByPage(QueryVo vo);

	int count(QueryVo vo);
}
