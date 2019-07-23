package com.example.Eureka.security.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.Eureka.security.entity.UUser;
@Mapper
@Repository
public interface UUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UUser record);

    int insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);

	UUser selectAllByName(@Param("userName") String name,@Param("pwd") String  pwd);

	UUser selectAllByNameName(String username);
}