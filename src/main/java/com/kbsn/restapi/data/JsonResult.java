package com.kbsn.restapi.data;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonResult {
	
	private String result;
	private String result_msg;
	private int total_count;
	private boolean mores;
	private int result_count;
	private List<?> schedule_items;
	
	public JsonResult() {}
	
	public JsonResult(String _result, String _result_msg, int _total_count, boolean _mores, int _result_count, List<?> _schedule_items) {
		this.result = _result;
		this.result_msg = _result_msg;
		this.total_count = _total_count;
		this.mores = _mores;
		this.result_count = _result_count;
		this.schedule_items = _schedule_items;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResult_msg() {
		return result_msg;
	}
	public void setResult_msg(String result_msg) {
		this.result_msg = result_msg;
	}
	public int getTotal_count() {
		return total_count;
	}
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}
	public boolean isMores() {
		return mores;
	}
	public void setMores(boolean mores) {
		this.mores = mores;
	}
	public int getResult_count() {
		return result_count;
	}
	public void setResult_count(int result_count) {
		this.result_count = result_count;
	}
	public List<?> getSchedule_items() {
		return schedule_items;
	}
	public void setSchedule_items(List<?> schedule_items) {
		this.schedule_items = schedule_items;
	}
	
	public String getResultJsonString(String pretty) {
		Gson gson;
		if (pretty.equals("true") || pretty.equals(""))
			gson = new GsonBuilder().setPrettyPrinting().create();
		else
			gson = new Gson();
		
		String str = gson.toJson(this);
		return str;
	}
}
