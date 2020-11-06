package com.daoduytinh.model;

import java.sql.Timestamp;

public class Products {
	protected int id;
    protected String title;
    protected String description;
    protected double price;
    protected double price_net; 
    protected int available;
    protected int sold;
    protected Timestamp deal_timer;
    protected int discount;
    protected String image;
    protected boolean cover;
    protected boolean hot_deal;
    protected boolean hot_new;
    protected boolean hot_best;
    protected boolean trend;
    protected boolean latest_review;
    protected int id_category;
	public Products() {
	}
	public Products(int id, String title, String description, double price, double price_net, int available, int sold,
			Timestamp deal_timer, int discount, String image, int id_category) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.price_net = price_net;
		this.available = available;
		this.sold = sold;
		this.deal_timer = deal_timer;
		this.discount = discount;
		this.image = image;
		this.id_category = id_category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice_net() {
		return price_net;
	}
	public void setPrice_net(double price_net) {
		this.price_net = price_net;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public Timestamp getDeal_timer() {
		return deal_timer;
	}
	public void setDeal_timer(Timestamp deal_timer) {
		this.deal_timer = deal_timer;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isCover() {
		return cover;
	}
	public void setCover(boolean cover) {
		this.cover = cover;
	}
	public boolean isHot_deal() {
		return hot_deal;
	}
	public void setHot_deal(boolean hot_deal) {
		this.hot_deal = hot_deal;
	}
	public boolean isHot_new() {
		return hot_new;
	}
	public void setHot_new(boolean hot_new) {
		this.hot_new = hot_new;
	}
	public boolean isHot_best() {
		return hot_best;
	}
	public void setHot_best(boolean hot_best) {
		this.hot_best = hot_best;
	}
	public boolean isTrend() {
		return trend;
	}
	public void setTrend(boolean trend) {
		this.trend = trend;
	}
	public boolean isLatest_review() {
		return latest_review;
	}
	public void setLatest_review(boolean latest_review) {
		this.latest_review = latest_review;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
    
    
}

