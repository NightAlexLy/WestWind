package org.luisyang.adminlte.service;

import java.util.List;

import org.luisyang.adminlte.bean.entity.RcEvent;
import org.luisyang.adminlte.bean.vo.Result;

public interface CalendarService {

	/**
	 * 获得所有事件
	 * @return
	 */
	Result<List<RcEvent>> selectByUserId(Long userId);
	
	/**
	 * 添加事件
	 * @param event
	 * @return
	 */
	Result<RcEvent> save(RcEvent event);
	
}
