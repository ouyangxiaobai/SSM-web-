package com.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.Admin;
import com.bs.dao.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public Admin selectByUsername(String username) {
		// TODO Auto-generated method stub
		return adminMapper.selectByUsername(username);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Admin record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Admin selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Admin record) {
		adminMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Admin record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	//登录验证 0:用户名不存在 1:密码错误 2:验证成功
    public int login(String username,String password) {
        //判断username是否存在
        boolean existUsername=existUsername(username);
        //若username存在，验证密�?
        if (existUsername){
            Admin resUser=adminMapper.selectByUsername(username);
            if (resUser.getPassword().equals(password)){
            	
                return 2;
            }
            return 1;
        }
        return 0;
    }

	private boolean existUsername(String username) {
		// TODO Auto-generated method stub
		return adminMapper.existUsername(username) == 1;
	}

}
