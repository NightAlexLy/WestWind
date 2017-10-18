package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcEmailAccountInfo;
import org.luisyang.adminlte.bean.entity.RcEmailAccountInfoExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcEmailAccountInfoMapper {
    int countByExample(RcEmailAccountInfoExample example);

    int deleteByExample(RcEmailAccountInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcEmailAccountInfo record);

    int insertSelective(RcEmailAccountInfo record);

    List<RcEmailAccountInfo> selectByExample(RcEmailAccountInfoExample example);

    RcEmailAccountInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcEmailAccountInfo record, @Param("example") RcEmailAccountInfoExample example);

    int updateByExample(@Param("record") RcEmailAccountInfo record, @Param("example") RcEmailAccountInfoExample example);

    int updateByPrimaryKeySelective(RcEmailAccountInfo record);

    int updateByPrimaryKey(RcEmailAccountInfo record);
}