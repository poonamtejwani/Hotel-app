package com.hotelexample.Hotelexample.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelexample.Hotelexample.entity.Hotel;
import com.hotelexample.Hotelexample.service.HotelService;

@RestController
@RequestMapping("/hotels-restapi")
public class HotelController {
	
	@Autowired
	HotelService hotelService ;
	
	
	@PostMapping("/hotels")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel)
	{
		
		Hotel newHotel = hotelService.addHotel(hotel);
		HttpHeaders header = new HttpHeaders();
		header.add("desc","one hotel added");
		return  ResponseEntity.ok().headers(header).body(newHotel);
		
	}
	
	@PutMapping("/hotels")
	public ResponseEntity<String> updateHotel(@RequestBody Hotel hotel)
	{
		hotelService.update(hotel);
		return ResponseEntity.ok("Updated");
		
	}
	
	@GetMapping("/hotels/hotelbyid/{id}")
	public ResponseEntity<Hotel>  getHotelById(@PathVariable int hotelId)
	{
		Hotel hotel = hotelService.getHotelById(hotelId);
		HttpHeaders header= new HttpHeaders();
		header.add("desc","getting one hotel instance" );
		return ResponseEntity.ok().headers(header).body(hotel);
		
	}
	
//	@DeleteMapping("/hotes/hotelbyid/{hotelId}")
	
//	public ResponseEntity<void> deleteHotel(int hotelId){
//		
//		hotelService.deleteHotel(hotelId);
//		return ResponseEntity.ok().build();
//	}
//	
//	List<Hotel> getHotelByCity(String city);
//	
//	List<Hotel> getHotelByMenu(String menuName);
//	
//	List<Hotel> getHotelByLocation(String location);
//	
//	List<Hotel> getHotelByLocationAndMenu(String location, String );
//	
//	
	
	

}
