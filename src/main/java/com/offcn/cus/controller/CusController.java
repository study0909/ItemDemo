package com.offcn.cus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.cus.bean.Customer;
import com.offcn.cus.service.CusService;

@Controller
@RequestMapping("cus")
public class CusController {
	
	@Autowired
	private CusService cs;
	
	/**
	 * 获取客户信息
	 */
	@RequestMapping
	public String findAll(Model m) {
		List<Customer> cus=cs.findAll();
		m.addAttribute("cus", cus);
		return "cus/customer";
	}

}
