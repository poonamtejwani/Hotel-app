package com.hotelexample.Hotelexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelexample.Hotelexample.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu , Integer> {
	
	//Derived Queries
	//@Query wit jpql and @Query with native query
	
	//getHotelByMenu(); get list of menu for particular hotel
	//List<Menu> findByHotelHotelName(String hotelName);
	
	
//	@Query("FROM Menu  m INNER JOIN m.hotel h where  h.hotelName=?1")
//		List<Menu> findByHotel(String hotelName);

	
	//Query with SQL native Query
	@Query(value="select * from menu m inner join hotel h on m.hotel_id=h.hotel_id where h.hotel_name=?1", nativeQuery=true)
	List<Menu> findByHotel(String hotelName);
}
