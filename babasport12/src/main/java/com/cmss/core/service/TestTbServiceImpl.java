package com.cmss.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmss.core.bean.TestTb;
import com.cmss.core.dao.TestTbDao;

@Service
@Transactional
public class TestTbServiceImpl implements TestTbService{

	@Resource
	private TestTbDao testTbDao;
	
	public void addTestTb(TestTb testTb) {
		testTbDao.addTestTb(testTb);
	}
	
}
