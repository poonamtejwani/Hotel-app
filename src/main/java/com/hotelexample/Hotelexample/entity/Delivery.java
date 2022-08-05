package com.hotelexample.Hotelexample.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {
	
	@Id
	@GeneratedValue(generator="del_Id", strategy= GenerationType.AUTO)
	@SequenceGenerator(name="del_Id", sequenceName="deleviry_Id")
	private Integer deliveryId;
	private String partnerName;
	private double charges;
	
	@ManyToMany(mappedBy="delivery")
	private Set<Hotel> hotelList=new HashSet<>();
	
	public Delivery(String partnerName, double charges) {
		super();
		this.partnerName = partnerName;
		this.charges = charges;
	}
	
	@Override
	public String toString() {
		return "Delivery [partnerName=" + partnerName + ", charges=" + charges + "]";
	}
	

}
