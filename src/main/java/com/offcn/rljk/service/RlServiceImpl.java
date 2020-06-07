package com.offcn.rljk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.rljk.bean.Rljk;
import com.offcn.rljk.bean.Shujvcaiji;
import com.offcn.rljk.bean.ShujvcaijiExample;
import com.offcn.rljk.bean.ShujvcaijiExample.Criteria;
import com.offcn.rljk.dao.RljkMapper;
import com.offcn.rljk.dao.ShujvcaijiMapper;
import com.offcn.utils.RlAndSj;

@Service
public class RlServiceImpl implements RlService {

    @Autowired
    private RljkMapper rm;
    @Autowired
    private ShujvcaijiMapper sm;
    
    @Override
    public List<Rljk> getAll() {
        return rm.selectByExample(null);
    }
    
    @Override
    public RlAndSj getOne(int id) {
        Rljk r=rm.selectByPrimaryKey(id);
        ShujvcaijiExample example=new ShujvcaijiExample();
        Criteria cc= example.createCriteria();
        cc.andZhanhaoEqualTo(r.getZhanhao());
        List<Shujvcaiji> sj=sm.selectByExample(example);
        return new RlAndSj(r, sj);
    }
    
    @Override
    public int add(Rljk r) {
        return rm.insertSelective(r);
    }
    
    @Override
    public int delete(int id) {
        // TODO Auto-generated method stub
        return rm.deleteByPrimaryKey(id);
    }
    
    @Override
    public List<Rljk> getSj() {
        // TODO Auto-generated method stub
        return rm.getSj();
    }
}
