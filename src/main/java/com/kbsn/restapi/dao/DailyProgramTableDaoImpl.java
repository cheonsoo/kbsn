package com.kbsn.restapi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.kbsn.restapi.dto.DailyProgramTable;

public class DailyProgramTableDaoImpl implements DailyProgramTableDao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public DailyProgramTable getDailyProgramTable() {
		String sql = "select * from DAILY_PROG_TABLE where DAILY_PROG_TABLE_KEY=?";
		Connection conn = null;
		 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 1);
			List<DailyProgramTable> list = new ArrayList<DailyProgramTable>();
			DailyProgramTable dailyProgramTable = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dailyProgramTable = new DailyProgramTable();
				dailyProgramTable.setDailyProgTableKey(rs.getInt("DAILY_PROG_TABLE_KEY"));
				dailyProgramTable.setUUID(rs.getString("UUID"));
				dailyProgramTable.setChannelName(rs.getString("CHANNEL_NAME"));
				dailyProgramTable.setLive(rs.getString("LIVE"));
				dailyProgramTable.setStartTime(rs.getString("START_TIME"));
				dailyProgramTable.setEndTime(rs.getString("END_TIME"));
				dailyProgramTable.setSpotAvail(rs.getString("SPOT_AVAIL"));
				dailyProgramTable.setOrgTime(rs.getString("ORG_TIME"));
				dailyProgramTable.setProgClass(rs.getString("PROG_CLASS"));
				dailyProgramTable.setProgCode(rs.getString("PROG_CODE"));
				dailyProgramTable.setProgCount(rs.getInt("PROG_COUNT"));
				dailyProgramTable.setProgName(rs.getString("PROG_NAME"));
				dailyProgramTable.setProgSubname(rs.getString("PROG_SUBNAME"));
				dailyProgramTable.setProgRate(rs.getInt("PROG_RATE"));
				dailyProgramTable.setProgCategory(rs.getInt("PROG_CATEGORY"));
				dailyProgramTable.setLicense(rs.getString("LICENSE"));
				dailyProgramTable.setDate(rs.getString("DATE"));
				dailyProgramTable.setWhoCreated(rs.getString("WHO_CREATED"));
				dailyProgramTable.setWhoModified(rs.getString("WHO_MODIFIED"));
				dailyProgramTable.setWhenCreated(rs.getString("WHEN_CREATED"));
				dailyProgramTable.setWhenModified(rs.getString("WHEN_MODIFIED"));
				list.add(dailyProgramTable);
			}
			rs.close();
			ps.close();
			return list.get(0);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	public List<DailyProgramTable> getDailyProgramTableByDateAndChannel(String date, String channel) {
		String sql = "SELECT * FROM DAILY_PROG_TABLE WHERE DATE=? AND CHANNEL_NAME=?";
		Connection conn = null;
		 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, date);
			ps.setString(2, channel);
			
			List<DailyProgramTable> list = new ArrayList<DailyProgramTable>();
			DailyProgramTable table = null;
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				table = new DailyProgramTable();
				table.setDailyProgTableKey(rs.getInt("DAILY_PROG_TABLE_KEY"));
				table.setUUID(rs.getString("UUID"));
				table.setChannelName(rs.getString("CHANNEL_NAME"));
				table.setLive(rs.getString("LIVE"));
				table.setStartTime(rs.getString("START_TIME"));
				table.setEndTime(rs.getString("END_TIME"));
				table.setSpotAvail(rs.getString("SPOT_AVAIL"));
				table.setOrgTime(rs.getString("ORG_TIME"));
				table.setProgClass(rs.getString("PROG_CLASS"));
				table.setProgCode(rs.getString("PROG_CODE"));
				table.setProgCount(rs.getInt("PROG_COUNT"));
				table.setProgName(rs.getString("PROG_NAME"));
				table.setProgSubname(rs.getString("PROG_SUBNAME"));
				table.setProgRate(rs.getInt("PROG_RATE"));
				table.setProgCategory(rs.getInt("PROG_CATEGORY"));
				table.setLicense(rs.getString("LICENSE"));
				table.setDate(rs.getString("DATE"));
				table.setWhoCreated(rs.getString("WHO_CREATED"));
				table.setWhoModified(rs.getString("WHO_MODIFIED"));
				table.setWhenCreated(rs.getString("WHEN_CREATED"));
				table.setWhenModified(rs.getString("WHEN_MODIFIED"));
				list.add(table);
			}
			rs.close();
			ps.close();
			
			return list;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
