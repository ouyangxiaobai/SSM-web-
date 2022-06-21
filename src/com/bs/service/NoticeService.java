package com.bs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.bean.Notice;
import com.bs.bean.NoticeExample;
import com.bs.bean.QueryVo;

public interface NoticeService {
	int deleteByPrimaryKey(Integer nid);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

	List<Notice> selectAll();

	List<Notice> selectByPage(QueryVo vo);

	int count(QueryVo vo);
}
