package com.bosta.response.pickup;

import com.bosta.common.City;
import com.bosta.common.Zone;

public class Address {
	 City CityObject;
	 Zone ZoneObject;
	 private String district;
	 private String firstLine;
	 private String floor;
	 private String apartment;
	 private String buildingNumber;


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

	 public String getFloor() {
	  return floor;
	 }

	 public String getApartment() {
	  return apartment;
	 }

	 public String getBuildingNumber() {
	  return buildingNumber;
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

	 public void setFloor(String floor) {
	  this.floor = floor;
	 }

	 public void setApartment(String apartment) {
	  this.apartment = apartment;
	 }

	 public void setBuildingNumber(String buildingNumber) {
	  this.buildingNumber = buildingNumber;
	 }
}
