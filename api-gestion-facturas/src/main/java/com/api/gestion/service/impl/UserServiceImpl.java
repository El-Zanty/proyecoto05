package com.api.gestion.service.impl;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.gestion.service.UserService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class UserServiceImpl implements UserService{

	@Override
	public ResponseEntity<String> singUp(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		return null;
	}

}
