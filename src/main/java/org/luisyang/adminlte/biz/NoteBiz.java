package org.luisyang.adminlte.biz;

import org.luisyang.adminlte.bean.entity.RcUserNote;
import org.luisyang.adminlte.bean.vo.Result;
import org.luisyang.adminlte.service.EmailAccountInfoService;
import org.luisyang.adminlte.service.NoteService;
import org.luisyang.adminlte.util.base.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NoteBiz {

	
	@Autowired
	private EmailAccountInfoService emailAccountInfoService;
	private NoteService noteService;
	
	public Result<Page<RcUserNote>> listForPage(int pageCurrent, int pageSize, String search, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result<RcUserNote> save(RcUserNote info) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result<RcUserNote> delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result<RcUserNote> query(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result<RcUserNote> update(RcUserNote info) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
