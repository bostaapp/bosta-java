package com.bosta.response.delivery;

import com.bosta.common.City;
import com.bosta.common.Zone;

public class GetDeliveryDropOffAddress {
	City CityObject;
	Zone ZoneObject;
	private String district;
	private String firstLine;
	private String secondLine;
	private String buildingNumber;
	private float floor;
	private float apartment;


	// Getter Methods 

	public City getCity() {
		return CityObject;
	}

	public Zone getZone() {
		return ZoneObject;
	}

	public String getDistrict() {
		return district;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public float getFloor() {
		return floor;
	}

	public float getApartment() {
		return apartment;
	}

	// Setter Methods 

	public void setCity(City cityObject) {
		this.CityObject = cityObject;
	}

	public void setZone(Zone zoneObject) {
		this.ZoneObject = zoneObject;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public void setFloor(float floor) {
		this.floor = floor;
	}

	public void setApartment(float apartment) {
		this.apartment = apartment;
	}
}
