package com.kbsn.restapi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.kbsn.restapi.data.USER;

public class USERDaoImpl implements USERDao {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public USER getUser(int userKey) {
		String sql = "select * from USERS where USERKEY=?";
		Connection conn = null;
		 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 1);
			List<USER> userList = new ArrayList<USER>();
			USER user = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new USER();
				user.setUSERKEY(rs.getInt("USERKEY"));
				user.setUSERNAME(rs.getString("USERNAME"));
				user.setPASSWORD(rs.getString("PASSWORD"));
				user.setENABLED(rs.getInt("ENABLED"));
				userList.add(user);
			}
			rs.close();
			ps.close();
			return userList.get(0);
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
