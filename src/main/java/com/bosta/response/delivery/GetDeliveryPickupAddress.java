package com.bosta.response.delivery;

import com.bosta.common.City;

public class GetDeliveryPickupAddress {
	City CityObject;
	private String district;
	private String firstLine;
	private float floor;
	private float apartment;
	private String buildingNumber;


	// Getter Methods 

	public City getCity() {
		return CityObject;
	}

	public String getDistrict() {
		return district;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public float getFloor() {
		return floor;
	}

	public float getApartment() {
		return apartment;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	// Setter Methods 

	public void setCity(City cityObject) {
		this.CityObject = cityObject;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public void setFloor(float floor) {
		this.floor = floor;
	}

	public void setApartment(float apartment) {
		this.apartment = apartment;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
}
