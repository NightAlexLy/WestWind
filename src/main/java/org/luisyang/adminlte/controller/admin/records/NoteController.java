package org.luisyang.adminlte.controller.admin.records;

import org.luisyang.adminlte.bean.entity.RcEmailAccountInfo;
import org.luisyang.adminlte.bean.entity.RcUserNote;
import org.luisyang.adminlte.bean.vo.Result;
import org.luisyang.adminlte.biz.NoteBiz;
import org.luisyang.adminlte.util.base.BaseController;
import org.luisyang.adminlte.util.base.Page;
import org.luisyang.adminlte.util.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/admin/records/notes/", method = RequestMethod.POST)
public class NoteController extends BaseController{

	@Autowired
	private NoteBiz biz;
	
	/**
	 * 列表
	 */
	@RequestMapping(value = LIST, method = RequestMethod.GET)
	public void list() {
	}
	
	
	/**
	 * 分页查询
	 * 
	 * @param start
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = PAGE)
	public PageBean<RcUserNote> queryForPage(@RequestParam(value = "start", defaultValue = "1") int start, @RequestParam(value = "length", defaultValue = "10") int pageSize,@RequestParam(value="date",required=false)String  date,@RequestParam(value="search",required=false)String search) {
		int pageCurrent = (start / pageSize) + 1;
		Result<Page<RcUserNote>> result = biz.listForPage(pageCurrent, pageSize,search,date);
		return new PageBean<>(result.getResultData());
	}

	/**
	 * 添加
	 * 
	 * @param modelMap
	 */
	@RequestMapping(value = ADD, method = RequestMethod.GET)
	public void add(ModelMap modelMap) {
		/*Result<List<RcDataDictionaryList>> result = biz.listByFieldCode(FIELDCODE);
		if (result.isStatus()) {
			modelMap.put("selectList", result.getResultData());
		}*/
	}

	/**
	 * 保存
	 * 
	 * @param info
	 * @return
	 */
	@RequestMapping(value = SAVE)
	public String save(RcUserNote info) {
		Result<RcUserNote> result = biz.save(info);
		if (result.isStatus()) {
			return "/admin/emailAccountInfo/list";
		}
		return null;
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = DELETE, method = RequestMethod.GET)
	public String delete(@RequestParam Long id) {
		Result<RcUserNote> result = biz.delete(id);
		if (result.isStatus()) {
			return redirect("/admin/emailAccountInfo/list");
		}
		return "admin/emailAccountInfo/list";
	}

	/**
	 * 查看
	 * 
	 * @param id
	 * @param modelMap
	 */
	@RequestMapping(value = VIEW, method = RequestMethod.GET)
	public void view(@RequestParam Long id, ModelMap modelMap) {
		Result<RcUserNote> result = biz.query(id);
		if (result.isStatus()) {
			modelMap.put("info", result.getResultData());
		}
	}

	/**
	 * 编辑
	 * 
	 * @param id
	 * @param modelMap
	 */
	@RequestMapping(value = EDIT, method = RequestMethod.GET)
	public void edit(@RequestParam Long id, ModelMap modelMap) {
		/*Result<List<RcDataDictionaryList>> dictionaryListResult = biz.listByFieldCode(FIELDCODE);
		Result<RcEmailAccountInfo> emailAccountResult = biz.query(id);
		if (dictionaryListResult.isStatus()) {
			modelMap.put("selectList", dictionaryListResult.getResultData());
		}
		if (emailAccountResult.isStatus()) {
			modelMap.put("info", emailAccountResult.getResultData());
		}*/
	}

	/**
	 * 更新
	 * 
	 * @param info
	 * @return
	 */
	@RequestMapping(value = UPDATE)
	public void update(@ModelAttribute RcEmailAccountInfo info) {
		/*Result<RcEmailAccountInfo> result = biz.update(info);
		if (result.isStatus()) {
			return redirect("/admin/emailAccountInfo/list");
		}
		return "admin/emailAccountInfo/list";*/
		
	}

}
