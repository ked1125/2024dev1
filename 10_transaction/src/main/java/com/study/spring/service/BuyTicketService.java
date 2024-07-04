package com.study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

import com.study.spring.dao.ITransaction1Dao;
import com.study.spring.dao.ITransaction2Dao;

@Service
public class BuyTicketService implements IBuyTicketService{

    @Autowired
    ITransaction1Dao transaction1;	// transaction1은 변수명 맘대로 작명 가능, ITransaction1Dao는 형(type)
    @Autowired
    ITransaction2Dao transaction2;
    
    @Autowired
    PlatformTransactionManager transactionManager ;
    
    @Autowired
    TransactionDefinition definition ;


    @Override
    public int buy(String consumerId, int money, String error) {   //Integer 객체로 return null가능
    	
    	TransactionStatus status = transactionManager.getTransaction(definition);
        try {
            transaction1.pay(consumerId, money);	//pay는 인터페이스로 지정한 함수의 실행부임
            
//            if(error.equals("1")) {int n=10/0;} // 억지로 에러 넣어서 에러파일 확인
            // buy_ticket.jsp밸류값도 1로 바꿔놔야 에러페이지로 넘어감.
            if(error.equals("1")) {int n=10/0;}
            transaction2.pay(consumerId, money);
            
            //요기 중요하다구 하심...:< 멀라
            transactionManager.commit(status);
            return 1;

        } catch (Exception e) {
        	transactionManager.rollback(status);
            return 0;
        }

    }

}