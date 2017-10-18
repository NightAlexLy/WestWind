package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcUserLoginLogs;
import org.luisyang.adminlte.bean.entity.RcUserLoginLogsExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcUserLoginLogsMapper {
    int countByExample(RcUserLoginLogsExample example);

    int deleteByExample(RcUserLoginLogsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcUserLoginLogs record);

    int insertSelective(RcUserLoginLogs record);

    List<RcUserLoginLogs> selectByExample(RcUserLoginLogsExample example);

    RcUserLoginLogs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcUserLoginLogs record, @Param("example") RcUserLoginLogsExample example);

    int updateByExample(@Param("record") RcUserLoginLogs record, @Param("example") RcUserLoginLogsExample example);

    int updateByPrimaryKeySelective(RcUserLoginLogs record);

    int updateByPrimaryKey(RcUserLoginLogs record);
}