package com.example.Eureka.security.service;

import java.util.List;

import com.example.Eureka.security.entity.UPermission;
import com.example.Eureka.security.entity.URole;
import com.example.Eureka.security.entity.UUser;

public interface ShiroService {

	UUser selectAllByName(String username, String pwd);
	UUser selectAllByNameName(String username);
	List<URole> findRoleByUid(Long id);

	List<UPermission> findPermissionByUid(Long id);
	

}
