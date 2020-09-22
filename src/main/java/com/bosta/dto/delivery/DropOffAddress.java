package com.bosta.dto.delivery;

public class DropOffAddress {
	 String city;
	 String zone;
    String district;
	 String firstLine;
	 String secondLine;
	 String buildingNumber;
	 String floor;
	 String apartment;
	 
	 public DropOffAddress(String city, String zone, String district, 
			 String firstLine, String secondLine, String buildingNumber,
			 String floor, String apartment) {
		 this.city = city;
		 this.zone = zone;
		 this.district = district;
		 this.firstLine = firstLine;
		 this.secondLine = secondLine;
		 this.buildingNumber = buildingNumber;
		 this.floor = floor;
		 this.apartment = apartment;
	 }
}