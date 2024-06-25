package com.study.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.spring.dto.MyBbsDto;

@Repository
public class MyBbsDao implements IMyBbsDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate ;


	@Override
	public List<MyBbsDto> listDao() {
		
		String query = "select * from mybbs1 order by id desc";
		List<MyBbsDto> dtos = jdbcTemplate.query(	// 여러개 가져올 때
				query, new BeanPropertyRowMapper<>(MyBbsDto.class)
				);
		return dtos ;
	}


	@Override
	public MyBbsDto viewDao(String id) {
		String query = "select * from mybbs1 where id = "+id;
		MyBbsDto dto = jdbcTemplate.queryForObject(	// 단일 값 가져올 때
				query, new BeanPropertyRowMapper<>(MyBbsDto.class)
				);
		return dto;
	}
	
	
	
	

}
