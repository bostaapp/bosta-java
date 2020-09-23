package com.bosta.dto.delivery;


public class Specs {
	 private String size;
	 private PackageDetails packageDetails;
	
	 
	 private Specs(Builder builder) {
		 this.size = builder.size;
		 this.packageDetails = builder.packageDetails;
	 }
	 
		public static final class Builder {
			 private String size;
			 private PackageDetails packageDetails;

			public Builder() { // The mandatory parameters are set here
			}

			public Builder size(String size) {
				this.size = size;
				return this;
			}
			
			public Builder packageDetails(PackageDetails packageDetails) {
				this.packageDetails = packageDetails;
				return this;
			}
			
			public Specs build() {
				return new Specs(this);
			}
		}
}