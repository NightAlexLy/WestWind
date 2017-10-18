package org.luisyang.adminlte.controller.admin.finance;

import org.luisyang.adminlte.util.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin/finance/interest/", method = RequestMethod.POST)
public class CompoundInterestController extends BaseController{

	/**
	 * 进入首页
	 */
	@RequestMapping(value = INDEX, method = RequestMethod.GET)
	public void getIndex() {
		
	}
	
}
