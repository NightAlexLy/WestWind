package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcEvent;
import org.luisyang.adminlte.bean.entity.RcEventExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcEventMapper {
    int countByExample(RcEventExample example);

    int deleteByExample(RcEventExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcEvent record);

    int insertSelective(RcEvent record);

    List<RcEvent> selectByExample(RcEventExample example);
    
    List<RcEvent> selectByUserId(Long userId);

    RcEvent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcEvent record, @Param("example") RcEventExample example);

    int updateByExample(@Param("record") RcEvent record, @Param("example") RcEventExample example);

    int updateByPrimaryKeySelective(RcEvent record);

    int updateByPrimaryKey(RcEvent record);
}