package com.offcn.rljk.service;

import java.util.List;

import com.offcn.rljk.bean.Rljk;
import com.offcn.rljk.bean.Shujvcaiji;
import com.offcn.utils.RlAndSj;

public interface RlService {
    
    List<Rljk> getAll();
    
    RlAndSj getOne(int id);
    
    int add(Rljk r);
    
    int delete(int id);
    
   List<Rljk> getSj();
   
}
