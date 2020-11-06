package com.daoduytinh.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoduytinh.dao.BannerDAO;
import com.daoduytinh.model.Banner;

@Service
@Transactional
public class BannerService {
  @Autowired
  private BannerDAO bannerDAO;
  
  public List<Banner> Banner() {
    return bannerDAO.Banner();
  }
}