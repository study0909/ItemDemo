package com.offcn.db.service;

import java.util.List;

import com.offcn.db.bean.Datacollect;
import com.offcn.utils.YyeObj;

public interface DbService{
	
	//获取所有企业
	public List<Datacollect> findAll();
	
	//获取营业额
	public List<Datacollect> getYye(YyeObj y);
}
