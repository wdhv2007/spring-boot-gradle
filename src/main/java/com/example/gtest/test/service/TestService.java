package com.example.gtest.test.service;

import java.util.List;
import java.util.Map;

import com.example.gtest.test.dto.UserVO;

public interface TestService {
	public List<Map<String, Object>> getUserList() throws Exception;
	
	public List<UserVO> getUserVO() throws Exception;
}
