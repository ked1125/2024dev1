package com.study.spring.jdbc;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface IDAO {
	ArrayList<UserDTO> getOrder();
}
