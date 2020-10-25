package com.bosta.request.delivery;

public class DropOffAddress {
	private String city;
	private String zone;
	private String district;
	private String firstLine;
	private String secondLine;
	private String buildingNumber;
	private String floor;
	private String apartment;

	private DropOffAddress(Builder builder) {
		this.city = builder.city;
		this.zone = builder.zone;
		this.district = builder.district;
		this.firstLine = builder.firstLine;
		this.secondLine = builder.secondLine;
		this.buildingNumber = builder.buildingNumber;
		this.floor = builder.floor;
		this.apartment = builder.apartment;
	}
	public static final class Builder {
		private String city;
		private String zone;
		private String district;
		private String firstLine;
		private String secondLine;
		private String buildingNumber;
		private String floor;
		private String apartment;

		/**
		* Creates new dropOff address.
		* 
		*/
		public Builder() {
		}

		/**
		* Sets dropOff address city.
		* 
		* @param city  DropOff address city.
		*/
		public Builder city(String city) {
			this.city = city;
			return this;
		}
		
		/**
		* Sets dropOff address zone.
		* 
		* @param zone  DropOff address zone.
		*/
		public Builder zone(String zone) {
			this.zone = zone;
			return this;
		}
		
		/**
		* Sets dropOff address district.
		* 
		* @param district  DropOff address district.
		*/
		public Builder district(String district) {
			this.district = district;
			return this;
		}
		
		/**
		* Sets dropOff address firstLine.
		* 
		* @param firstLine  DropOff address firstLine.
		*/
		public Builder firstLine(String firstLine) {
			this.firstLine = firstLine;
			return this;
		}
		
		/**
		* Sets dropOff address secondLine.
		* 
		* @param secondLine  DropOff address secondLine.
		*/
		public Builder secondLine(String secondLine) {
			this.secondLine = secondLine;
			return this;
		}
		
		/**
		* Sets dropOff address buildingNumber.
		* 
		* @param buildingNumber  DropOff address buildingNumber.
		*/
		public Builder buildingNumber(String buildingNumber) {
			this.buildingNumber = buildingNumber;
			return this;
		}
		
		/**
		* Sets dropOff address floor.
		* 
		* @param floor  DropOff address floor.
		*/
		public Builder floor(String floor) {
			this.floor = floor;
			return this;
		}
		
		/**
		* Sets dropOff address apartment.
		* 
		* @param apartment  DropOff address apartment.
		*/
		public Builder apartment(String apartment) {
			this.apartment = apartment;
			return this;
		}


		public DropOffAddress build() {
			return new DropOffAddress(this);
		}
	}
}