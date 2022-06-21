package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.Nation;
import com.bs.bean.QueryVo;
import com.bs.dao.NationMapper;

@Service
public class NationServiceImpl implements NationService {
	@Autowired
	private NationMapper nationMapper;

	@Override
	public Nation selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Nation record) {
		nationMapper.insert(record);
		return 0;
	}

	@Override
	public Nation selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return nationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Nation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Nation record) {
		// TODO Auto-generated method stub
		return nationMapper.updateByPrimaryKey(record);
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return nationMapper.count(vo);
	}

	@Override
	public List<Nation> selectByPage(QueryVo vo) {
		return nationMapper.selectByPage(vo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Nation> selectAll() {
		// TODO Auto-generated method stub
		return nationMapper.selectAll();
	}
}
