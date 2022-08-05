package com.hotelexample.Hotelexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelexample.Hotelexample.entity.Delivery;

@Repository
public interface DeliveryRepository  extends JpaRepository<Delivery, Integer>{
	
	//DeriveD Queries can be in form of findBy/getBy/readBy property name
	
	Delivery findByPartnerName(String partnerNmae);
	
	

}
