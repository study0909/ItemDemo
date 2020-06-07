package com.offcn.rljk.dao;

import com.offcn.rljk.bean.Rljk;
import com.offcn.rljk.bean.RljkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RljkMapper {
    long countByExample(RljkExample example);

    int deleteByExample(RljkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rljk record);

    int insertSelective(Rljk record);

    List<Rljk> selectByExample(RljkExample example);

    Rljk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rljk record, @Param("example") RljkExample example);

    int updateByExample(@Param("record") Rljk record, @Param("example") RljkExample example);

    int updateByPrimaryKeySelective(Rljk record);

    int updateByPrimaryKey(Rljk record);
    
    List<Rljk> getSj();
}