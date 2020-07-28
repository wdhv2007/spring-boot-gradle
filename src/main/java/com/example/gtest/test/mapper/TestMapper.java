package com.example.gtest.test.mapper;

import java.util.List;
import java.util.Map;

import com.example.gtest.test.dto.UserVO;

public interface TestMapper {
	public List<Map<String, Object>> selectUserList() throws Exception;
	
	public List<UserVO> selectUserVO() throws Exception;
}
