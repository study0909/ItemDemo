package com.offcn.rljk.dao;

import com.offcn.rljk.bean.Shujvcaiji;
import com.offcn.rljk.bean.ShujvcaijiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShujvcaijiMapper {
    long countByExample(ShujvcaijiExample example);

    int deleteByExample(ShujvcaijiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shujvcaiji record);

    int insertSelective(Shujvcaiji record);

    List<Shujvcaiji> selectByExample(ShujvcaijiExample example);

    Shujvcaiji selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shujvcaiji record, @Param("example") ShujvcaijiExample example);

    int updateByExample(@Param("record") Shujvcaiji record, @Param("example") ShujvcaijiExample example);

    int updateByPrimaryKeySelective(Shujvcaiji record);

    int updateByPrimaryKey(Shujvcaiji record);
}