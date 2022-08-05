package com.hotelexample.Hotelexample.service;

import java.util.List;

import com.hotelexample.Hotelexample.entity.Hotel;

public interface HotelService {
	
Hotel addHotel(Hotel hotel);

void update(Hotel hotel);

Hotel getHotelById(int hotelId);

void deleteHotel(int HotelId);

List<Hotel> getHotelByCity(String city);

List<Hotel>  getHotelByMenu(String menuName);

List<Hotel> getHotelByDelivery(String partnerName);

List<Hotel> getHotelByLocation(String location);

List<Hotel> getHotelByLocationAndMenu(String location , String  menuName);

}


