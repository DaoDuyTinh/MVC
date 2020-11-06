package com.daoduytinh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.daoduytinh.model.Banner;
import com.daoduytinh.model.BannerMapper;

public class BannerDAO {

	  @Autowired
	  private JdbcTemplate jdbcTemplate;
	  public List<Banner> Banner() {
	    String sql = "SELECT * FROM banner WHERE type = 1 ";
	    return jdbcTemplate.query(sql, new BannerMapper());
	  }
	}
