package com.offcn.db.service;

import java.util.List;

import com.offcn.db.bean.Datacollect;
import com.offcn.utils.YyeObj;

public interface DbService{
	
	//��ȡ������ҵ
	public List<Datacollect> findAll();
	
	//��ȡӪҵ��
	public List<Datacollect> getYye(YyeObj y);
}
