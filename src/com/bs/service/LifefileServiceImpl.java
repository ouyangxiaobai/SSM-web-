package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.LifeFile;
import com.bs.dao.LifeFileMapper;
@Service
public class LifefileServiceImpl implements LifefileService {
	@Autowired
	private LifeFileMapper lifeFileMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		lifeFileMapper.deleteByPrimaryKey(id);
		return 0;
	}

	@Override
	public int insert(LifeFile record) {
		lifeFileMapper.insert(record);
		return 0;
	}

	@Override
	public int insertSelective(LifeFile record) {
		lifeFileMapper.insert(record);
		return 0;
	}

	@Override
	public LifeFile selectByPrimaryKey(Integer id) {
		
		return lifeFileMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(LifeFile record) {
		lifeFileMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(LifeFile record) {
		lifeFileMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public LifeFile selectByoid(Integer id) {
		// TODO Auto-generated method stub
		return lifeFileMapper.selectByoid(id);
	}

	@Override
	public List<LifeFile> selectAllByoid(Integer id) {
		// TODO Auto-generated method stub
		return lifeFileMapper.selectAllByoid(id);
	}

}
