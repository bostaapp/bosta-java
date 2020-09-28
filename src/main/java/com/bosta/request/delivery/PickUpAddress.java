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

			public Builder() { // The mandatory parameters are set here

			}

			public Builder city(String city) {
				this.city = city;
				return this;
			}
			
			public Builder zone(String zone) {
				this.zone = zone;
				return this;
			}
			
			public Builder district(String district) {
				this.district = district;
				return this;
			}
			
			public Builder firstLine(String firstLine) {
				this.firstLine = firstLine;
				return this;
			}
			
			public Builder secondLine(String secondLine) {
				this.secondLine = secondLine;
				return this;
			}
			
			public Builder buildingNumber(String buildingNumber) {
				this.buildingNumber = buildingNumber;
				return this;
			}
			
			public Builder floor(String floor) {
				this.floor = floor;
				return this;
			}
			
			public Builder apartment(String apartment) {
				this.apartment = apartment;
				return this;
			}

			public PickUpAddress build() {
				return new PickUpAddress(this);
			}
		}
}
