package com.bs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.bean.QueryVo;
import com.bs.bean.Review;
import com.bs.bean.ReviewExample;

public interface ReviewService {
	int deleteByPrimaryKey(Integer reid);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(Integer reid);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);

	List<Review> showReview(String mid);

	List<Review> selectByPage(QueryVo vo);

	int count(QueryVo vo);
}
