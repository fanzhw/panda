package com.itc.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int index) throws SQLException {
		User user = new User(rs.getString("id"),rs.getString("name"),rs.getInt("age"));
		return user;
	}

}
