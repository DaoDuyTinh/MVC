package com.daoduytinh.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BannerMapper implements RowMapper<Banner> {
		public Banner	mapRow(ResultSet rs, int rowNum) throws SQLException{
			Banner banner = new Banner();
			banner.setId(rs.getInt("id"));
			banner.setTitle(rs.getString("name"));
			banner.setImage(rs.getString("image"));
			return banner;
			
		}

	}

