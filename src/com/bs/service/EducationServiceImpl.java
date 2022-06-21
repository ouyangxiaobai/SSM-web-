package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.Education;
import com.bs.bean.QueryVo;
import com.bs.dao.EducationMapper;

@Service
public class EducationServiceImpl implements EducationService {
	@Autowired
	private EducationMapper educationMapper;

	@Override
	public Education selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		educationMapper.deleteByPrimaryKey(id);
		return 0;
	}

	@Override
	public int insert(Education record) {
		educationMapper.insert(record);
		return 0;
	}

	@Override
	public Education selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return educationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Education record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Education record) {
		educationMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return educationMapper.count(vo);
	}

	@Override
	public List<Education> selectByPage(QueryVo vo) {
		return educationMapper.selectByPage(vo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Education> selectAll() {
		// TODO Auto-generated method stub
		return educationMapper.selectAll();
	}
}
