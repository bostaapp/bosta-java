package com.bosta.request.delivery;


public class PickUpAddress {
	private String city;
	private String zone;
	private String district;
	private String firstLine;
	private String secondLine;
	private String buildingNumber;
	private String floor;
	private String apartment;

	private PickUpAddress(Builder builder) {
		this.city = builder.city;
		this.zone =builder.zone;
		this.district = builder.district;
		this.firstLine = builder.firstLine;
		this.secondLine = builder.secondLine;
		this.buildingNumber =builder.buildingNumber;
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
		 * Creates new pickup address.
		 * 
		 */
		public Builder() {

		}

		/**
		* Sets pickup address city.
		* 
		* @param city  Pickup address city.
		*/
		public Builder city(String city) {
			this.city = city;
			return this;
		}

		/**
		* Sets pickup address zone.
		* 
		* @param zone  Pickup address zone.
		*/
		public Builder zone(String zone) {
			this.zone = zone;
			return this;
		}

		/**
		* Sets pickup address district.
		* 
		* @param district  Pickup address district.
		*/
		public Builder district(String district) {
			this.district = district;
			return this;
		}

		/**
		* Sets pickup address firstLine.
		* 
		* @param firstLine  Pickup address firstLine.
		*/
		public Builder firstLine(String firstLine) {
			this.firstLine = firstLine;
			return this;
		}

		/**
		* Sets pickup address secondLine.
		* 
		* @param secondLine  Pickup address secondLine.
		*/
		public Builder secondLine(String secondLine) {
			this.secondLine = secondLine;
			return this;
		}

		/**
		* Sets pickup address buildingNumber.
		* 
		* @param buildingNumber  Pickup address buildingNumber.
		*/
		public Builder buildingNumber(String buildingNumber) {
			this.buildingNumber = buildingNumber;
			return this;
		}

		/**
		* Sets pickup address floor.
		* 
		* @param floor  Pickup address floor.
		*/
		public Builder floor(String floor) {
			this.floor = floor;
			return this;
		}

		/**
		* Sets pickup address apartment.
		* 
		* @param apartment  Pickup address apartment.
		*/
		public Builder apartment(String apartment) {
			this.apartment = apartment;
			return this;
		}

		public PickUpAddress build() {
			return new PickUpAddress(this);
		}
	}
}
