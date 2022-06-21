package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.Notice;
import com.bs.bean.QueryVo;
import com.bs.dao.NoticeMapper;
@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;
	@Override
	public int deleteByPrimaryKey(Integer nid) {
		noticeMapper.deleteByPrimaryKey(nid);
		return 0;
	}

	@Override
	public int insert(Notice record) {
		noticeMapper.insert(record);
		return 0;
	}

	@Override
	public int insertSelective(Notice record) {
		noticeMapper.insertSelective(record);
		return 0;
	}

	@Override
	public Notice selectByPrimaryKey(Integer nid) {
		// TODO Auto-generated method stub
		return noticeMapper.selectByPrimaryKey(nid);
	}

	@Override
	public int updateByPrimaryKeySelective(Notice record) {
		noticeMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Notice record) {
		noticeMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public List<Notice> selectAll() {
		// TODO Auto-generated method stub
		return noticeMapper.selectAll();
	}

	@Override
	public List<Notice> selectByPage(QueryVo vo) {
		// TODO Auto-generated method stub
		return noticeMapper.selectByPage(vo);
	}

	@Override
	public int count(QueryVo vo) {
		// TODO Auto-generated method stub
		return noticeMapper.count(vo);
	}

}
