package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.Nativeplace;
import com.bs.bean.QueryVo;
import com.bs.dao.NativeplaceMapper;

@Service
public class NativeplaceServiceImpl implements NativeplaceService {
	@Autowired
	private NativeplaceMapper nativeplaceMapper;

	@Override
	public Nativeplace selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return nativeplaceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Nativeplace record) {
		nativeplaceMapper.insert(record);
		return 0;
	}

	@Override
	public Nativeplace selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return nativeplaceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Nativeplace record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Nativeplace record) {
		nativeplaceMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return nativeplaceMapper.count(vo);
	}

	@Override
	public List<Nativeplace> selectByPage(QueryVo vo) {
		return nativeplaceMapper.selectByPage(vo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Nativeplace> selectAll() {
		// TODO Auto-generated method stub
		return nativeplaceMapper.selectAll();
	}
}
