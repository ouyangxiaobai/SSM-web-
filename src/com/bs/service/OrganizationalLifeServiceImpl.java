package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.OrganizationalLife;
import com.bs.bean.QueryVo;
import com.bs.dao.OrganizationalLifeMapper;

@Service
public class OrganizationalLifeServiceImpl implements OrganizationalLifeService {
	@Autowired
	private OrganizationalLifeMapper organizationalLifeMapper;

	@Override
	public OrganizationalLife selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		organizationalLifeMapper.deleteByPrimaryKey(id);
		return 0;
	}

	@Override
	public int insert(OrganizationalLife record) {
		organizationalLifeMapper.insert(record);
		return 0;
	}

	@Override
	public OrganizationalLife selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return organizationalLifeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(OrganizationalLife record) {
		organizationalLifeMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(OrganizationalLife record) {
		organizationalLifeMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return organizationalLifeMapper.count(vo);
	}

	@Override
	public List<OrganizationalLife> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return organizationalLifeMapper.selectByPage(vo);
	}

	@Override
	public OrganizationalLife selectByname(String activityName) {
		// TODO Auto-generated method stub
		return organizationalLifeMapper.selectByname(activityName);
	}
}
