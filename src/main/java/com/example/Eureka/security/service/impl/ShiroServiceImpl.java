package com.example.Eureka.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Eureka.security.entity.UPermission;
import com.example.Eureka.security.entity.URole;
import com.example.Eureka.security.entity.UUser;
import com.example.Eureka.security.mapper.UPermissionMapper;
import com.example.Eureka.security.mapper.URoleMapper;
import com.example.Eureka.security.mapper.UUserMapper;
import com.example.Eureka.security.service.ShiroService;

@Service
public class ShiroServiceImpl implements ShiroService {
	@Autowired
private UUserMapper uUserMapper;
	@Autowired
private URoleMapper uRoleMapper;
	@Autowired
private UPermissionMapper uPermissionMapper;
	@Override
	public UUser selectAllByName(String username,String pwd) {
		UUser uuser = uUserMapper.selectAllByName(username,pwd);
		return uuser;
	}
	@Override
	public UUser selectAllByNameName(String username) {
		UUser uuser = uUserMapper.selectAllByNameName(username);
		return uuser;
	}
	@Override
	public List<URole> findRoleByUid(Long id) {
		 List<URole> selectByPrimaryKey = uRoleMapper.findRoleByUid(id);
		
		return selectByPrimaryKey;
	}

	@Override
	public List<UPermission> findPermissionByUid(Long id) {
		
		List<UPermission> uplist = uPermissionMapper.findPermissionByUid(id);
		return uplist;
	}

}
