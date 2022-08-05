package com.hotelexample.Hotelexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelexample.Hotelexample.entity.Hotel;
import com.hotelexample.Hotelexample.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	
	@Autowired
	HotelRepository hotelRepository;
	
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepository.save(hotel);

	}

	@Override
	public void update(Hotel hotel) {
		hotelRepository.save(hotel);

	}

	@Override
	public Hotel getHotelById(int hotelId) {
		
		return  hotelRepository.findById(hotelId).get();
	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);

	}

	@Override
	public List<Hotel> getHotelByCity(String city) {
		
		return  hotelRepository.findByAddressCity(city);
	}

	@Override
	public List<Hotel> getHotelByMenu(String menuName) {
		
		return hotelRepository.getHotelByMenu(menuName);
	}

	@Override
	public List<Hotel> getHotelByDelivery(String partnerName) {
		// 
		return  hotelRepository.getHotelByDelivery(partnerName);
	}

	@Override
	public List<Hotel> getHotelByLocation(String location) {
		
		return hotelRepository.findByAddressStreetName(location);
	}

	@Override
	public List<Hotel> getHotelByLocationAndMenu(String location, String menuName) {
		
		return hotelRepository.getHotelByLocationAndMenu(location, menuName);
	}

}
