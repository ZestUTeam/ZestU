package com.zestu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zestu.entity.Test;
import com.zestu.mapper.TestMapper;

@Service
@EnableCaching
@Transactional
public class TestService {
	@Autowired
	private TestMapper testMapper;

	@Cacheable(value = "test")
	public Test test(Integer id) {
		return testMapper.selectById(id);
	}
}
