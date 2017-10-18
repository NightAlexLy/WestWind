package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcRolePermissions;
import org.luisyang.adminlte.bean.entity.RcRolePermissionsExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcRolePermissionsMapper {
    int countByExample(RcRolePermissionsExample example);

    int deleteByExample(RcRolePermissionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcRolePermissions record);

    int insertSelective(RcRolePermissions record);

    List<RcRolePermissions> selectByExample(RcRolePermissionsExample example);

    RcRolePermissions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcRolePermissions record, @Param("example") RcRolePermissionsExample example);

    int updateByExample(@Param("record") RcRolePermissions record, @Param("example") RcRolePermissionsExample example);

    int updateByPrimaryKeySelective(RcRolePermissions record);

    int updateByPrimaryKey(RcRolePermissions record);
}