package com.offcn.cus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.cus.bean.Customer;
import com.offcn.cus.dao.CustomerMapper;

@Service
public class CusServiceImpl implements CusService {
	
	@Autowired
	private CustomerMapper cm;

	@Override
	public List<Customer> findAll() {
		return cm.selectByExample(null);
	}

}
