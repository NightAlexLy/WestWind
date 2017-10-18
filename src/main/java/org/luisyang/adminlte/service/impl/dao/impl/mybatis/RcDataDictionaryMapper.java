package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcDataDictionary;
import org.luisyang.adminlte.bean.entity.RcDataDictionaryExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcDataDictionaryMapper {
    int countByExample(RcDataDictionaryExample example);

    int deleteByExample(RcDataDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcDataDictionary record);

    int insertSelective(RcDataDictionary record);

    List<RcDataDictionary> selectByExample(RcDataDictionaryExample example);

    RcDataDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcDataDictionary record, @Param("example") RcDataDictionaryExample example);

    int updateByExample(@Param("record") RcDataDictionary record, @Param("example") RcDataDictionaryExample example);

    int updateByPrimaryKeySelective(RcDataDictionary record);

    int updateByPrimaryKey(RcDataDictionary record);
}