package org.luisyang.adminlte.service.impl;

import java.util.List;

import org.luisyang.adminlte.bean.entity.RcEvent;
import org.luisyang.adminlte.bean.vo.Result;
import org.luisyang.adminlte.service.CalendarService;
import org.luisyang.adminlte.service.impl.dao.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CalendarServiceImpl implements CalendarService{

	@Autowired
	private EventDao dao;
	
	@Override
	public Result<List<RcEvent>> selectByUserId(Long userId) {
		Result<List<RcEvent>> result = new Result<List<RcEvent>>();
		List<RcEvent> list = dao.selectByUserId(userId);
		result.setStatus(true);
		result.setErrCode(0);
		result.setResultData(list);
		return result;
	}

	@Override
	public Result<RcEvent> save(RcEvent event) {
		Result<RcEvent> result = new Result<>();
		if (!StringUtils.hasText(event.getTitle())) {
			result.setErrMsg("标题不能为空");
			return result;
		}
		if (dao.insert(event) > 0) {
			result.setStatus(true);
			result.setErrCode(0);
			return result;
		}
		result.setErrMsg("添加失败");
		return result;
	}

}
