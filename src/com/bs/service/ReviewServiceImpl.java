package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.QueryVo;
import com.bs.bean.Review;
import com.bs.dao.ReviewMapper;
@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewMapper reviewMapper;
	@Override
	public int deleteByPrimaryKey(Integer reid) {
		reviewMapper.deleteByPrimaryKey(reid);
		return 0;
	}

	@Override
	public int insert(Review record) {
		reviewMapper.insert(record);
		return 0;
	}

	@Override
	public int insertSelective(Review record) {
		reviewMapper.insertSelective(record);
		return 0;
	}

	@Override
	public Review selectByPrimaryKey(Integer reid) {
		// TODO Auto-generated method stub
		return reviewMapper.selectByPrimaryKey(reid);
	}

	@Override
	public int updateByPrimaryKeySelective(Review record) {
		reviewMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Review record) {
		reviewMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public List<Review> showReview(String mid) {
		// TODO Auto-generated method stub
		return reviewMapper.showReview(mid);
	}

	@Override
	public List<Review> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return reviewMapper.selectByPage(vo);
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return reviewMapper.count(vo);
	}

}
