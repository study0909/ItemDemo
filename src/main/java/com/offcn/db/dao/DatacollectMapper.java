package com.offcn.db.dao;

import com.offcn.db.bean.Datacollect;
import com.offcn.db.bean.DatacollectExample;
import com.offcn.utils.YyeObj;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatacollectMapper {
    long countByExample(DatacollectExample example);

    int deleteByExample(DatacollectExample example);

    int deleteByPrimaryKey(Integer daid);

    int insert(Datacollect record);

    int insertSelective(Datacollect record);

    List<Datacollect> selectByExample(DatacollectExample example);

    Datacollect selectByPrimaryKey(Integer daid);

    int updateByExampleSelective(@Param("record") Datacollect record, @Param("example") DatacollectExample example);

    int updateByExample(@Param("record") Datacollect record, @Param("example") DatacollectExample example);

    int updateByPrimaryKeySelective(Datacollect record);

    int updateByPrimaryKey(Datacollect record);
    
    List<Datacollect> getYye(YyeObj y);
}