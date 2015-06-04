package com.kbsn.restapi.dao.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.kbsn.restapi.dao.DailyProgramTableDao;
import com.kbsn.restapi.data.DailyProgramTableToJSON;
import com.kbsn.restapi.data.JsonResult;
import com.kbsn.restapi.dto.DailyProgramTable;

@ContextConfiguration(locations={"classpath*:spring/application-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DailyProgramTableDaoTest {

	@Autowired
	private DailyProgramTableDao dao;
	
	//@Test
	public void getDailyProgramTable() {
		DailyProgramTable table = dao.getDailyProgramTable();
		Assert.isInstanceOf(DailyProgramTable.class, table);
	}
	
	//@Test
	public void convertObjToJson() {
		
		List<DailyProgramTable> list = dao.getDailyProgramTableByDateAndChannel("20150601", "KBSNSports");
		JsonResult result = new JsonResult("200", "SUCCESS", list.size(), false, list.size(), list);
		String resultStr = result.getResultJsonString("true");
		
		DailyProgramTableToJSON jsonObj = new DailyProgramTableToJSON();
		System.out.println(resultStr);
		
		Map<String, String> channel_code = new HashMap<String, String>();
		channel_code.put("value", "N94");
		channel_code.put("label", "KBSN W");
		
		jsonObj.setChannel_code(channel_code);
		jsonObj.setBorad_code("22");
		
	}
	
	@Test
	public void convertObjToJson2() {
		
		List<DailyProgramTable> list = dao.getDailyProgramTableByDateAndChannel("20150601", "KBSNSports");
		
		
		List<DailyProgramTableToJSON> jsonObjList = new ArrayList<DailyProgramTableToJSON>();
		for (Object obj : list) {
			DailyProgramTable table = (DailyProgramTable) obj;
			DailyProgramTableToJSON jsonObj = new DailyProgramTableToJSON(table);
			jsonObjList.add(jsonObj);
		}
		
		JsonResult result = new JsonResult("200", "SUCCESS", list.size(), false, 22, jsonObjList);
		String str = result.getResultJsonString("true");
		
		
		System.out.println(str);
		//System.out.println(str);
	}
}