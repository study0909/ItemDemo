package com.offcn.utils;

import java.util.List;

import com.offcn.rljk.bean.Rljk;
import com.offcn.rljk.bean.Shujvcaiji;

public class RlAndSj {

    private Rljk rljk;
    private List<Shujvcaiji> sj;
    public Rljk getRljk() {
        return rljk;
    }
    public void setRljk(Rljk rljk) {
        this.rljk = rljk;
    }
    public List<Shujvcaiji> getSj() {
        return sj;
    }
    public void setSj(List<Shujvcaiji> sj) {
        this.sj = sj;
    }
    public RlAndSj(Rljk rljk, List<Shujvcaiji> sj) {
        super();
        this.rljk = rljk;
        this.sj = sj;
    }
    
  
    
}
