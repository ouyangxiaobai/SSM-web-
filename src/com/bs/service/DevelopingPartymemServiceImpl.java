package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.DevelopingPartymem;
import com.bs.bean.QueryVo;
import com.bs.dao.DevelopingPartymemMapper;

@Service
public class DevelopingPartymemServiceImpl implements DevelopingPartymemService {
	@Autowired
	private DevelopingPartymemMapper developingPartymemMapper;

	@Override
	public DevelopingPartymem selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		developingPartymemMapper.deleteByPrimaryKey(id);
		return 0;
	}

	@Override
	public int insert(DevelopingPartymem record) {
		developingPartymemMapper.insert(record);
		return 0;
	}

	@Override
	public DevelopingPartymem selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return developingPartymemMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(DevelopingPartymem record) {
		developingPartymemMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(DevelopingPartymem record) {
		developingPartymemMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return developingPartymemMapper.count(vo);
	}

	@Override
	public List<DevelopingPartymem> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return developingPartymemMapper.selectByPage(vo);
	}
}
