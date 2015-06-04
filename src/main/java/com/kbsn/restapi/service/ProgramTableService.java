package com.kbsn.restapi.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.kbsn.restapi.dao.DailyProgramTableDao;
import com.kbsn.restapi.data.JsonResult;
import com.kbsn.restapi.dto.DailyProgramTable;

@Path("/table")
//@ContextConfiguration(locations={"classpath*:spring/application-config.xml"})
public class ProgramTableService {
	
	@Autowired
	private DailyProgramTableDao dao;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	@Path("{date}")
	public Response getDailyProgramTable_bak(@PathParam("date") String date) {
		System.out.println(date);
		
		DailyProgramTable table = dao.getDailyProgramTable();
		System.out.println(table.getChannelName());
		String response = "{\"result\": \"200\",\"result_msg\": \"SUCCESS\",\"total_count\": 22,\"mores\": false,\"result_count\": 22,\"schedule_items\": [{\"channel_code\": {\"value\": \"N94\",\"label\": \"KBSN W\"},\"double_programming_code\": \"1\",\"media_code\": {\"value\": \"I9\",\"label\": \"N\"},\"relation_image\": [],\"essence\": [],\"episode_id\": \"PI-1432252996-01-3AA\",\"board_code\": \"\",\"program_code\": \"\",\"programming_date\": \"20150528\",\"programming_duration_minute\": \"60\",\"programming_end_time\": \"06000000\",\"programming_start_time\": \"05000000\",\"program_sequence_number\": \"583\",\"program_title\": \"비타민\",\"programming_local_station_code\": {\"value\": \"00\",\"label\": \"본사\"},\"rerun_code\": {\"value\": \"02\",\"label\": \"재방\"},\"radio_open_studio_yn\": \"\",\"service_date\": \"20150528\",\"service_start_time\": \"05000000\",\"service_end_time\": \"06000000\",\"programming_table_title\": \"\",\"deliberation_grade_code\": {},\"exist_episode\": \"N\"}]}";
		
		
		
		
		
		List<DailyProgramTable> userList = new ArrayList<DailyProgramTable>();
		userList.add(table);
		table.setDailyProgTableKey(2);
		userList.add(table);
		
		
		Gson gson = new Gson();
		gson.toJson(userList);
		
		
		
		return Response.status(200).entity(response).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	@Path("daily")
	public Response getDailyProgramTable(@QueryParam("date") String date, @QueryParam("channel") String channel, @QueryParam("pretty") String pretty) {
		
		List<DailyProgramTable> tableList = dao.getDailyProgramTableByDateAndChannel(date, channel);
		JsonResult result = new JsonResult("200", "SUCCESS", tableList.size(), false, tableList.size(), tableList);
		pretty = (pretty != null) ? pretty : "false";
		String jsonStr = result.getResultJsonString(pretty);
		
		return Response.status(200).entity(jsonStr).build();
	}
}