package com.offcn.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.db.bean.Datacollect;
import com.offcn.db.service.DbService;
import com.offcn.utils.YyeObj;

@Controller
@RequestMapping("db")
public class DbController {
	
	@Autowired
	private DbService ds;
	
	@RequestMapping("getQiye")
	@ResponseBody
	public List<Datacollect> getQiye(){
		return ds.findAll();
	}
	
	@RequestMapping("getYye")
	@ResponseBody
	public List<Datacollect> getYye(YyeObj y){
		return ds.getYye(y);
	}

}
