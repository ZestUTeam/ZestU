package com.zestu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zestu.entity.UserInfo;
import com.zestu.mapper.UserInfoMapper;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserInfoMapper userInfoMapper;

	public boolean add(UserInfo userInfo) {
		int flag = userInfoMapper.insert(userInfo);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public boolean delete(Integer uno) {
		int flag = userInfoMapper.deleteByPrimaryKey(uno);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public boolean update(UserInfo userInfo) {
		int flag = userInfoMapper.updateByPrimaryKeySelective(userInfo);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public List<UserInfo> select(UserInfo userInfo) {
		return userInfoMapper.findBySelect(userInfo);
	}
}
