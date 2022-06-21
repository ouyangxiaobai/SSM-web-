package com.bs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.bean.User;
import com.bs.bean.UserExample;

public interface UserService {
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	int login(String username, String password);

	User selectByUsername(String username);
}
