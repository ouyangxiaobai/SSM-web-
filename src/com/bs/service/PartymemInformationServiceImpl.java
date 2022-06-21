package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.PartymemInformation;
import com.bs.bean.PartymemOutflow;
import com.bs.bean.QueryVo;
import com.bs.dao.PartymemInformationMapper;

@Service
public class PartymemInformationServiceImpl implements PartymemInformationService {
	@Autowired
	private PartymemInformationMapper partymemInformationMapper;

	@Override
	public PartymemInformation selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		partymemInformationMapper.deleteByPrimaryKey(id);
		return 0;
	}

	@Override
	public int insert(PartymemInformation record) {
		// TODO Auto-generated method stub
		partymemInformationMapper.insert(record);
		return 0;
	}

	@Override
	public PartymemInformation selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return partymemInformationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(PartymemInformation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(PartymemInformation record) {
		partymemInformationMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		if(partymemInformationMapper.count(vo) == null)
			return 0;
		else
			return partymemInformationMapper.count(vo);
	}

	@Override
	public List<PartymemInformation> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return partymemInformationMapper.selectByPage(vo);
	}
}
