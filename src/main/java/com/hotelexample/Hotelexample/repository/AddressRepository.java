package com.hotelexample.Hotelexample.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelexample.Hotelexample.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
