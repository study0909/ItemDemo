package com.offcn.rljk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.rljk.bean.Rljk;
import com.offcn.rljk.service.RlService;
import com.offcn.utils.RlAndSj;

@Controller
@RequestMapping("rl")
public class RlController {

    @Autowired
    private RlService rs;
    
    @RequestMapping("getAll")
    public String getAll(Model m){
        List<Rljk> rList=rs.getAll();
        m.addAttribute("rlist", rList);
        return "tab/table";
    }
    
   @RequestMapping("getSj")
   public String getSj(Model m) {
       List<Rljk> sj=rs.getSj();
       m.addAttribute("sj", sj);
       return "tab/table";
   }
    
    @RequestMapping("getOne")
    public String getOne(Model m,int id) {
        RlAndSj r=rs.getOne(id);
        m.addAttribute("r", r);
        return "tab/lookOne";
    }
    
    @RequestMapping("add")
    public String add(Rljk r) {
        rs.add(r);
        return "redirect:/rl/getSj";
    }
    
    @RequestMapping("delete")
    public String delete(int id) {
        rs.delete(id);
        return "redirect:/rl/getSj";
    }
}
