package org.luisyang.adminlte.biz;

import java.util.List;

import org.luisyang.adminlte.bean.entity.RcEvent;
import org.luisyang.adminlte.bean.vo.Result;
import org.luisyang.adminlte.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 日历逻辑功能
 * 
 * 
 * @author night
 */
@Component
public class CalendarBiz {

	@Autowired
	private CalendarService calendarService;

	/**
	 * 查询指定用户的所有事件
	 * @param userId
	 * @return
	 */
	public Result<List<RcEvent>> selectByUserId(Long userId){
		return calendarService.selectByUserId(userId);
		
	}
	
	/**
	 * 添加事件
	 * @param event
	 * @return
	 */
	public Result<RcEvent> save(RcEvent event){
		return calendarService.save(event);
	}
	
}
