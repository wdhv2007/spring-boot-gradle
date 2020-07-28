package com.example.gtest.test.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gtest.test.dto.UserVO;
import com.example.gtest.test.service.TestService;

@RestController
public class MainController {
	
	@Autowired
	private TestService testService;

	@GetMapping("/")
	public List<UserVO> mainMethod() throws Exception {
		//return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		//return testService.getUserList().toString();
		return testService.getUserVO();
	}
}
