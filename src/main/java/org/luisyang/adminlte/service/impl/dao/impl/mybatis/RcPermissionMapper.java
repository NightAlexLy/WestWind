package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcPermission;
import org.luisyang.adminlte.bean.entity.RcPermissionExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcPermissionMapper {
    int countByExample(RcPermissionExample example);

    int deleteByExample(RcPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcPermission record);

    int insertSelective(RcPermission record);

    List<RcPermission> selectByExample(RcPermissionExample example);

    RcPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcPermission record, @Param("example") RcPermissionExample example);

    int updateByExample(@Param("record") RcPermission record, @Param("example") RcPermissionExample example);

    int updateByPrimaryKeySelective(RcPermission record);

    int updateByPrimaryKey(RcPermission record);
}