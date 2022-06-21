package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.ProActive;
import com.bs.bean.QueryVo;
import com.bs.dao.ProActiveMapper;

@Service
public class ProActiveServiceImpl implements ProActiveService {
	@Autowired
	private ProActiveMapper proActiveMapper;

	@Override
	public ProActive selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		proActiveMapper.deleteByPrimaryKey(id);
		return 0;
	}

	@Override
	public int insert(ProActive record) {
		proActiveMapper.insert(record);
		return 0;
	}

	@Override
	public ProActive selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return proActiveMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(ProActive record) {
		proActiveMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ProActive record) {
		proActiveMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return proActiveMapper.count(vo);
	}

	@Override
	public List<ProActive> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return proActiveMapper.selectByPage(vo);
	}
}
