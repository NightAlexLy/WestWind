package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcUserRole;
import org.luisyang.adminlte.bean.entity.RcUserRoleExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcUserRoleMapper {
    int countByExample(RcUserRoleExample example);

    int deleteByExample(RcUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcUserRole record);

    int insertSelective(RcUserRole record);

    List<RcUserRole> selectByExample(RcUserRoleExample example);

    RcUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcUserRole record, @Param("example") RcUserRoleExample example);

    int updateByExample(@Param("record") RcUserRole record, @Param("example") RcUserRoleExample example);

    int updateByPrimaryKeySelective(RcUserRole record);

    int updateByPrimaryKey(RcUserRole record);
}