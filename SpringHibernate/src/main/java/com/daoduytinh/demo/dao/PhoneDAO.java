package com.daoduytinh.demo.dao;

import java.util.List;

import com.daoduytinh.demo.model.Phone;

public interface PhoneDAO {
	public void addPhone(Phone p);

	public void updatePhone(Phone p);

	public List<Phone> listPhones();

	public Phone getPhoneById(int id);

	public void removePhone(int id);
}
