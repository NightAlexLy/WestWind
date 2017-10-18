package org.luisyang.adminlte.service.impl.dao;

import java.util.List;

import org.luisyang.adminlte.bean.entity.RcEvent;

public interface EventDao {

	/**
	 * 
	 * 添加事件
	 * 
	 * @param rcEmailInfo
	 * @return int
	 */
	int insert(RcEvent rcEvent);

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	int deleteById(Long id);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 */
	RcEvent selectById(Long id);
	
	
	/**
	 * 查询指定用户的日历
	 * @param userId
	 * @return
	 */
	List<RcEvent> selectByUserId(Long userId);
	
}
