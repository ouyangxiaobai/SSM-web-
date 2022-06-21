package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.PartymemOutflow;
import com.bs.bean.QueryVo;
import com.bs.dao.PartymemOutflowMapper;

@Service
public class PartymemOutflowServiceImpl implements PartymemOutflowService {
	@Autowired
	private PartymemOutflowMapper partymemOutflowMapper;

	@Override
	public PartymemOutflow selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		partymemOutflowMapper.deleteByPrimaryKey(id);
		return 0;
	}

	@Override
	public int insert(PartymemOutflow record) {
		partymemOutflowMapper.insert(record);
		return 0;
	}

	@Override
	public PartymemOutflow selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return partymemOutflowMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(PartymemOutflow record) {
		partymemOutflowMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(PartymemOutflow record) {
		partymemOutflowMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return partymemOutflowMapper.count(vo);
	}

	@Override
	public List<PartymemOutflow> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return partymemOutflowMapper.selectByPage(vo);
	}
}
