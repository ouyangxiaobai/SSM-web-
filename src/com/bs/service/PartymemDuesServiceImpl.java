package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.PartymemDues;
import com.bs.bean.QueryVo;
import com.bs.dao.PartymemDuesMapper;

@Service
public class PartymemDuesServiceImpl implements PartymemDuesService {
	@Autowired
	private PartymemDuesMapper partymemDuesMapper;

	@Override
	public PartymemDues selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(PartymemDues record) {
		partymemDuesMapper.insert(record);
		return 0;
	}

	@Override
	public PartymemDues selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return partymemDuesMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(PartymemDues record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(PartymemDues record) {
		partymemDuesMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return partymemDuesMapper.count(vo);
	}

	@Override
	public List<PartymemDues> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return partymemDuesMapper.selectByPage(vo);
	}

	@Override
	public PartymemDues selectByPartymemId(PartymemDues record) {
		// TODO Auto-generated method stub
		return partymemDuesMapper.selectByPartymemId(record);
	}
}
