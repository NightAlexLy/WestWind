package org.luisyang.adminlte.test.dataDictionaryList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.luisyang.adminlte.bean.entity.RcDataDictionaryList;
import org.luisyang.adminlte.service.DataDictionaryListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-core.xml")
public class DataDictionaryListTest {
	
	@Autowired
	private DataDictionaryListService service;
	
	@Test
	public void test(){
		RcDataDictionaryList dataDictionaryList = new RcDataDictionaryList();
		dataDictionaryList.setFieldCode("host_code");
		dataDictionaryList.setFieldKey("qq服务");
		dataDictionaryList.setFieldCode("stmp.qq.com");
		dataDictionaryList.setSort(1);
		dataDictionaryList.setRemark("qq服务选项");
		service.save(dataDictionaryList);
	}
}
