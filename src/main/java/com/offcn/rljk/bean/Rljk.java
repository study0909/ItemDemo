package com.offcn.rljk.bean;

public class Rljk {
    private Integer id;

    private String zhanhao;

    private String zhanname;

    private String time;
    
    private Shujvcaiji sj;
    
    

    public Shujvcaiji getSj() {
        return sj;
    }

    public void setSj(Shujvcaiji sj) {
        this.sj = sj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhanhao() {
        return zhanhao;
    }

    public void setZhanhao(String zhanhao) {
        this.zhanhao = zhanhao == null ? null : zhanhao.trim();
    }

    public String getZhanname() {
        return zhanname;
    }

    public void setZhanname(String zhanname) {
        this.zhanname = zhanname == null ? null : zhanname.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}