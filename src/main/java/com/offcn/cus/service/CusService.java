package com.offcn.cus.service;

import java.util.List;

import com.offcn.cus.bean.Customer;

public interface CusService {
	
	//获取客户列表
	public List<Customer> findAll();

}
