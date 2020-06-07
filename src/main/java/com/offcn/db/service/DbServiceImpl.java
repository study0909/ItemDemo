package com.offcn.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.db.bean.Datacollect;
import com.offcn.db.dao.DatacollectMapper;
import com.offcn.utils.YyeObj;

@Service
public class DbServiceImpl implements DbService {
	
	@Autowired
	private DatacollectMapper dm;

	@Override
	public List<Datacollect> findAll() {
		return dm.selectByExample(null);
	}

	@Override
	public List<Datacollect> getYye(YyeObj y) {
		return dm.getYye(y);
	}
}
