package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcRole;
import org.luisyang.adminlte.bean.entity.RcRoleExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcRoleMapper {
    int countByExample(RcRoleExample example);

    int deleteByExample(RcRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcRole record);

    int insertSelective(RcRole record);

    List<RcRole> selectByExample(RcRoleExample example);

    RcRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcRole record, @Param("example") RcRoleExample example);

    int updateByExample(@Param("record") RcRole record, @Param("example") RcRoleExample example);

    int updateByPrimaryKeySelective(RcRole record);

    int updateByPrimaryKey(RcRole record);
}