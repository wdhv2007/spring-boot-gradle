package com.example.gtest.test.service.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.gtest.test.dto.UserVO;
import com.example.gtest.test.mapper.TestMapper;
import com.example.gtest.test.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService{
	
	@Resource
	private TestMapper testMapper;
	
	@Override
	public List<Map<String, Object>> getUserList() throws Exception {
		return testMapper.selectUserList();
	}

	@Override
	public List<UserVO> getUserVO() throws Exception {
		return testMapper.selectUserVO();
	}

}
