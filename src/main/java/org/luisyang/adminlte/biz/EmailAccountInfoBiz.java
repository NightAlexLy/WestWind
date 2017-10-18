/*
 * Copyright 2015-2016 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.luisyang.adminlte.biz;

import java.util.List;

import org.luisyang.adminlte.bean.entity.RcDataDictionaryList;
import org.luisyang.adminlte.bean.entity.RcEmailAccountInfo;
import org.luisyang.adminlte.bean.vo.Result;
import org.luisyang.adminlte.service.DataDictionaryListService;
import org.luisyang.adminlte.service.EmailAccountInfoService;
import org.luisyang.adminlte.util.base.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 邮件账号逻辑功能
 * 
 * @author LYQ
 */
@Component
public class EmailAccountInfoBiz {

	@Autowired
	private EmailAccountInfoService emailAccountInfoService;

	@Autowired
	private DataDictionaryListService dictionaryListService;

	/**
	 * 分页查询
	 * 
	 * @param pageCurrent
	 * @param pageSize
	 * @return
	 */
	public Result<Page<RcEmailAccountInfo>> listForPage(int pageCurrent, int pageSize,String premise,String datePremise) {
		return emailAccountInfoService.listForPage(pageCurrent, pageSize,premise,datePremise);
	}

	/**
	 * 添加
	 * 
	 * @param rcEmailAccountInfo
	 */
	public Result<RcEmailAccountInfo> save(RcEmailAccountInfo info) {
		return emailAccountInfoService.save(info);
	}

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	public Result<RcEmailAccountInfo> delete(Long id) {
		return emailAccountInfoService.delete(id);
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public Result<RcEmailAccountInfo> query(Long id) {
		return emailAccountInfoService.query(id);
	}

	/**
	 * 更新
	 * 
	 * @param info
	 */
	public Result<RcEmailAccountInfo> update(RcEmailAccountInfo info) {
		return emailAccountInfoService.update(info);
	}

	/**
	 * 获取下拉选项
	 * 
	 * @param fieldCode
	 * @return
	 */
	public Result<List<RcDataDictionaryList>> listByFieldCode(String fieldCode) {
		return dictionaryListService.listByFieldCode(fieldCode);
	}

}
