package com.study.spring.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.dao.IMyBbsDao;
import com.study.spring.dto.MyBbsDto;


@Service
public class MyBbsService implements IMyBbsService{
	// db랑 연결 되어 있는건 dao라서 계속 dao 를 쓰고 있는듯 - 실질적으로db랑 연결되어 있는애
	// service는 실행하는애 .. 구현체 만들면서 

	@Autowired
	IMyBbsDao dao ;
	
	
	@Override
	public List<MyBbsDto> list(){		//DTO는 아무데서나 가져다 씀..
		return dao.listDao(); // 얘는 dao값을 가져와서 쓰는거고, 막상 실행부는 IMyBbsService에 있는 list()를 쓰고있음!!
	}

	@Override
	public MyBbsDto view(String id) {
		return dao.viewDao(id);
	};
	
	@Override
	public int write(String writer, String title, String content) {
		return dao.writeDao(writer, title, content);
	};
	
	@Override
	public int delete(@Param("_id") String id) {
		return dao.deleteDao(id);
	};
	
}
