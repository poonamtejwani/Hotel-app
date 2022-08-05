package com.hotelexample.Hotelexample;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelexample.Hotelexample.entity.Address;
import com.hotelexample.Hotelexample.entity.Delivery;
import com.hotelexample.Hotelexample.entity.Hotel;
import com.hotelexample.Hotelexample.entity.Menu;
import com.hotelexample.Hotelexample.repository.MenuRepository;
import com.hotelexample.Hotelexample.service.DeliveryService;
import com.hotelexample.Hotelexample.service.HotelService;
import com.hotelexample.Hotelexample.service.MenuService;

@SpringBootApplication
public class HotelexampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HotelexampleApplication.class, args);
	}
  
	@Autowired
	HotelService hotelService;
	
	@Autowired
	DeliveryService  deliveryService;
	
	@Autowired
	MenuService  menuService ;
	
	@Override
	public void run(String... args) throws Exception 
	{
//		// TODO Auto-generated method stub
//		
//		Address address= new Address("JP nagar", "Banglore",234565, "KAR");
//		
//		Menu menu1= new Menu("Idli",30);
//		Menu menu2= new Menu("Dosa",80);
//		Set<Menu> menuList= new HashSet<>(Arrays.asList(menu1, menu2));
//		
//		//Creating Delivery Object
//		
//		Delivery del1= deliveryService.getDeliveryByPartner("Uber");
//		//Delivery del2= new Delivery("Uber", 190);
//		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(del1));
//		
//		
//		Hotel hotel= new Hotel("The Shanthos",address, menuList, deliveryList);
//		hotelService.addHotel(hotel);
//		
		
		
//  	Hotel hotel= hotelService.getHotelById(202);
//	System.out.println(hotel);
//	
//	hotel.getAddress().setCity("Bombay");
//		
//	hotelService.update(hotel);
		
//	  hotelService.getHotelByCity("Banglore")
//		.stream().forEach((h)->System.out.println(h.getHotelName() + h.getAddress().getCity()));
//		
//		System.out.println();
//		
//		
//		
//		hotelService.getHotelByLocation("JP nagar")
//		.stream().forEach((h)->System.out.println(h.getHotelName() + h.getMenuList() ));
		
//		hotelService.getHotelByMenu("Idli").stream().forEach((h)-> System.out.println(h.getHotelName() +" " +  h.getAddress().getStreetName()));
//		     System.out.println();
//		     
//		     hotelService.getHotelByDelivery("Swiggy").stream().forEach((h)-> System.out.println(h.getHotelName() + " " + h.getAddress().getStreetName()));
		     
	//	     hotelService.getHotelByLocationAndMenu("jp nagar", "Dosa").forEach((h)-> System.out.println(h.getHotelName() + " " + h.getAddress().getCity()));
		
		menuService.getMenuByHotel("New Aryas").forEach((m)->System.out.println(m.getMenuName() + " " + m.getPrice()));
	}

}

