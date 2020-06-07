package com.offcn.rljk.bean;

public class Shujvcaiji {
    private Integer id;

    private String zhanhao;

    private String wendu;

    private String yali;

    private String reliang;

    private String fakong;

    private Integer rId;

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

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu == null ? null : wendu.trim();
    }

    public String getYali() {
        return yali;
    }

    public void setYali(String yali) {
        this.yali = yali == null ? null : yali.trim();
    }

    public String getReliang() {
        return reliang;
    }

    public void setReliang(String reliang) {
        this.reliang = reliang == null ? null : reliang.trim();
    }

    public String getFakong() {
        return fakong;
    }

    public void setFakong(String fakong) {
        this.fakong = fakong == null ? null : fakong.trim();
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }
}