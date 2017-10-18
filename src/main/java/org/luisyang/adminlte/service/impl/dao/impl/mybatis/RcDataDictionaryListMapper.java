package org.luisyang.adminlte.service.impl.dao.impl.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.luisyang.adminlte.bean.entity.RcDataDictionaryList;
import org.luisyang.adminlte.bean.entity.RcDataDictionaryListExample;
import org.luisyang.adminlte.util.base.MyBatis;

@MyBatis
public interface RcDataDictionaryListMapper {
    int countByExample(RcDataDictionaryListExample example);

    int deleteByExample(RcDataDictionaryListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcDataDictionaryList record);

    int insertSelective(RcDataDictionaryList record);

    List<RcDataDictionaryList> selectByExample(RcDataDictionaryListExample example);

    RcDataDictionaryList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcDataDictionaryList record, @Param("example") RcDataDictionaryListExample example);

    int updateByExample(@Param("record") RcDataDictionaryList record, @Param("example") RcDataDictionaryListExample example);

    int updateByPrimaryKeySelective(RcDataDictionaryList record);

    int updateByPrimaryKey(RcDataDictionaryList record);
}