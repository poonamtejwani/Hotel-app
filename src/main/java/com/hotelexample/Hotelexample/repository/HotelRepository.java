package com.hotelexample.Hotelexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelexample.Hotelexample.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	
	//find by property name
	List<Hotel> findByAddressCity(String city);
	
	List<Hotel> findByAddressStreetName(String location);
	
	@Query("FROM Hotel h inner join h.menuList mn WHERE mn.menuName=?1")   //jpql
	List<Hotel> getHotelByMenu(String mneuName);
	
	
	@Query("FROM Hotel h inner join h.delivery d WHERE d.partnerName=?1 ")
	List<Hotel> getHotelByDelivery(String partnerName);
	
	@Query("FROM Hotel h inner join h.address a inner join h.menuList mn where a.streetName=?1 and mn.menuName=?2")
	List<Hotel> getHotelByLocationAndMenu(String location , String menuName);

}
