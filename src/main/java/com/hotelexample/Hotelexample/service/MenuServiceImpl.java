package com.hotelexample.Hotelexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelexample.Hotelexample.entity.Menu;
import com.hotelexample.Hotelexample.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {

	 @Autowired
	 MenuRepository  menuRepository;

	@Override
	public List<Menu> getMenuByHotel(String hotelName) {
		// TODO Auto-generated method stub
		return menuRepository.findByHotel(hotelName);
	}

	

	
	



	
	
	

}
