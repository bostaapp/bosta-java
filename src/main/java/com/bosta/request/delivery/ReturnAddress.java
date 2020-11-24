package com.bosta.request.delivery;


public class ReturnAddress {
	 private String city;
	 private String zone;
	 private String district;
	 private String firstLine;
	 private String secondLine;
	 private String buildingNumber;
	 private String floor;
	 private String apartment;
	 
		private ReturnAddress(Builder builder) {
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
			* Creates new return address.
			* 
			*/
			public Builder() {
			}

			/**
			* Sets return address city.
			* 
			* @param city  Return address city.
			*/
			public Builder city(String city) {
				this.city = city;
				return this;
			}
			
			/**
			* Sets return address zone.
			* 
			* @param zone  Return address zone.
			*/
			public Builder zone(String zone) {
				this.zone = zone;
				return this;
			}
			
			/**
			* Sets return address district.
			* 
			* @param district  Return address district.
			*/
			public Builder district(String district) {
				this.district = district;
				return this;
			}
			
			/**
			* Sets return address firstLine.
			* 
			* @param firstLine  Return address firstLine.
			*/
			public Builder firstLine(String firstLine) {
				this.firstLine = firstLine;
				return this;
			}
			
			/**
			* Sets return address secondLine.
			* 
			* @param secondLine  Return address secondLine.
			*/
			public Builder secondLine(String secondLine) {
				this.secondLine = secondLine;
				return this;
			}
			
			/**
			* Sets return address buildingNumber.
			* 
			* @param buildingNumber  Return address buildingNumber.
			*/
			public Builder buildingNumber(String buildingNumber) {
				this.buildingNumber = buildingNumber;
				return this;
			}
			
			/**
			* Sets return address floor.
			* 
			* @param floor  Return address floor.
			*/
			public Builder floor(String floor) {
				this.floor = floor;
				return this;
			}
			
			/**
			* Sets return address apartment.
			* 
			* @param apartment  Return address apartment.
			*/
			public Builder apartment(String apartment) {
				this.apartment = apartment;
				return this;
			}


			public ReturnAddress build() {
				return new ReturnAddress(this);
			}
		}
}
