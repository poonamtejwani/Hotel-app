package com.hotelexample.Hotelexample.service;

import java.util.List;

import com.hotelexample.Hotelexample.entity.Hotel;
import com.hotelexample.Hotelexample.entity.Menu;

public interface MenuService {

	 

	List<Menu> getMenuByHotel(String hotelName);

	
}
