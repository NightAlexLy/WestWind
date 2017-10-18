package org.luisyang.adminlte.service.impl.dao.impl;

import java.util.List;

import org.luisyang.adminlte.bean.entity.RcEvent;
import org.luisyang.adminlte.service.impl.dao.EventDao;
import org.luisyang.adminlte.service.impl.dao.impl.mybatis.RcEventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EventDaoImpl implements EventDao{

	@Autowired
	private RcEventMapper mapper;

	@Override
	public int insert(RcEvent rcEvent) {
		return mapper.insert(rcEvent);
	}

	@Override
	public int deleteById(Long id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public RcEvent selectById(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<RcEvent> selectByUserId(Long userId) {
		return mapper.selectByUserId(userId);
	}

}
