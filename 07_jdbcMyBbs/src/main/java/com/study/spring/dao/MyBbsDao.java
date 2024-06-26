package com.study.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.spring.dto.MyBbsDto;

@Repository										// @Repository 붙어있으면 bean이라고 봐도 됨!
// Repository 안에 @Component 들어있고 => @Component가 붙으면 스프링이 맨처음에 쫙 스캔하면서 bean 등록함..^^;;;;

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
	
	@Override
	public int deleteDao(String id) {
		String query = "delete from mybbs1 where id = ?";	// ? 해놓으면 매개변수 순서대로 들어간다고 하심 
//		String query = "delete from mybbs1 where id = ? , ? , ?";	// ? 해놓으면 매개변수 순서대로 들어간다고 하심 
		
		return jdbcTemplate.update(
				query, Integer.parseInt(id)
				);
	}
	
	@Override
	public int writeDao(String writer, String title, String content) {
		String query = "insert into mybbs1(writer,title,content)"		// 한줄로 쓰기 너무 기니까 분할해줌. 쭉써도댐 ㅎㅎㅎ
				+ " values (?,?,?) ";									// 매개변수 순서대로 차례차례 들어감
		return jdbcTemplate.update(query, writer, title, content);
	}
	
	

}
