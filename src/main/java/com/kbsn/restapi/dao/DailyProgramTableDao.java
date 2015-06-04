package com.kbsn.restapi.dao;

import java.util.List;

import com.kbsn.restapi.dto.DailyProgramTable;

public interface DailyProgramTableDao {
	public DailyProgramTable getDailyProgramTable();
	public List<DailyProgramTable> getDailyProgramTableByDateAndChannel(String date, String channel);
}
