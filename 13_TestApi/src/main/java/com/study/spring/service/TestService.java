package com.study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.model.TestEntity;
import com.study.spring.repository.TestRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor			//방법 1-a
public class TestService {

	private final TestRepository testRepository;		//방법 1-b
	
//	@Autowired		//방법2-a
//	private TestRepository testRepository;		//방법 2-b
	
	public TestEntity create(String name, int age) {
		
		
	TestEntity testEntity = new TestEntity(name, age);
		
		
//		TestEntity testEntity = TestEntity.builder().build();
		testRepository.save(testEntity);
		
		return testEntity;
	}
	
}
