package com.zestu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zestu.entity.Recomment;
import com.zestu.mapper.RecommentMapper;

@Service
@Transactional
public class RecommentService {
	@Autowired
	private RecommentMapper recommentMapper;

	public boolean add(Recomment recomment) {
		int flag = recommentMapper.insert(recomment);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public boolean delete(Integer rno) {
		int flag = recommentMapper.deleteByPrimaryKey(rno);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public boolean update(Recomment recomment) {
		int flag = recommentMapper.updateByPrimaryKeySelective(recomment);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public List<Recomment> select(Recomment recomment) {
		return recommentMapper.selectBySelects(recomment);
	}
}
