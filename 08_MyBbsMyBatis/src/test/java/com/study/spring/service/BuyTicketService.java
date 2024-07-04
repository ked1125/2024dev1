package com.study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyTicketService implements IBuyTicketService{

	@Autowired
	ITransaction1Dao transaction1;
	@Autowired
	ITransaction2Dao transaction2;
	
	
	@Override
	public int buy(String consumerId, int money, String error) {

		transaction1.pay(consumerId, money);
		transaction2.pay(consumerId, money);
		return 0;
	}
	
}
