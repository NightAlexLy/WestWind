package org.luisyang.adminlte.service;

import java.util.List;

import org.luisyang.adminlte.bean.entity.RcUserNote;
import org.luisyang.adminlte.bean.vo.Result;
import org.luisyang.adminlte.util.base.Page;

public interface NoteService {

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param example
	 * @return
	 */
	Result<Page<RcUserNote>> listForPage(int pageCurrent, int pageSize,String premise,String datePremise);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	Result<RcUserNote> query(Long id);

	/**
	 * 添加
	 * 
	 * @param info
	 */
	Result<RcUserNote> save(RcUserNote info);

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	Result<RcUserNote> delete(Long id);

	/**
	 * 更新
	 * 
	 * @param info
	 * @return
	 */
	Result<RcUserNote> update(RcUserNote info);

	/**
	 * @return
	 */
	Result<List<RcUserNote>> list();
}
