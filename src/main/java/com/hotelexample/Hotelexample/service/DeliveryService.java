package com.hotelexample.Hotelexample.service;

import com.hotelexample.Hotelexample.entity.Delivery;

public interface DeliveryService {
	
	void updateDelivery(Delivery delivery);
	
	void deleteDelivery(int deliveryId);
	
	Delivery getDeliveryById(int deliveryId);
	
	Delivery getDeliveryByPartner(String partnerName);

}
