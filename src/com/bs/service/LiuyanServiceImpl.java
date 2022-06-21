package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.Liuyan;
import com.bs.bean.QueryVo;
import com.bs.dao.LiuyanMapper;
@Service
public class LiuyanServiceImpl implements LiuyanService {
	@Autowired
	private LiuyanMapper liuyanMapper;
	@Override
	public int deleteByPrimaryKey(Integer liuyanId) {
		liuyanMapper.deleteByPrimaryKey(liuyanId);
		return 0;
	}

	@Override
	public int insert(Liuyan record) {
		liuyanMapper.insert(record);
		return 0;
	}

	@Override
	public int insertSelective(Liuyan record) {
		liuyanMapper.insertSelective(record);
		return 0;
	}

	@Override
	public Liuyan selectByPrimaryKey(Integer liuyanId) {
		// TODO Auto-generated method stub
		return liuyanMapper.selectByPrimaryKey(liuyanId);
	}
	@Override
	public List<Liuyan> selectAll() {
		// TODO Auto-generated method stub
		return liuyanMapper.selectAll();
	}
	@Override
	public int updateByPrimaryKeySelective(Liuyan record) {
		liuyanMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Liuyan record) {
		liuyanMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public List<Liuyan> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return liuyanMapper.selectByPage(vo);
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return liuyanMapper.count(vo);
	}

}
