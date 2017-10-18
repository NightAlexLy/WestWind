package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcUser;
import org.luisyang.adminlte.bean.entity.RcUserExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcUserMapper {
    int countByExample(RcUserExample example);

    int deleteByExample(RcUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcUser record);

    int insertSelective(RcUser record);

    List<RcUser> selectByExample(RcUserExample example);

    RcUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcUser record, @Param("example") RcUserExample example);

    int updateByExample(@Param("record") RcUser record, @Param("example") RcUserExample example);

    int updateByPrimaryKeySelective(RcUser record);

    int updateByPrimaryKey(RcUser record);
}