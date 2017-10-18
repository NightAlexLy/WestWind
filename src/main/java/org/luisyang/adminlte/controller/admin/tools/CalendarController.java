package org.luisyang.adminlte.controller.admin.tools;

import org.luisyang.adminlte.bean.entity.RcEvent;
import org.luisyang.adminlte.bean.vo.Result;
import org.luisyang.adminlte.biz.CalendarBiz;
import org.luisyang.adminlte.util.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/admin/tools/calendar/", method = RequestMethod.POST)
public class CalendarController extends BaseController{
	
	@Autowired
	private CalendarBiz biz;
	
	
	@RequestMapping(value = INDEX, method = RequestMethod.GET)
	public void index() {

	}
	
	@ResponseBody
	@RequestMapping(value = SAVE)
	public String save(RcEvent event){
		Result<RcEvent> result = biz.save(event);
		if(result.isStatus()){
			return "/admin/tools/calendar/index";
		}
		return "/admin/tools/calendar/index";
	}
	
	
}
