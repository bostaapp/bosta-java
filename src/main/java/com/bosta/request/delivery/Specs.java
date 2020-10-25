package com.bosta.request.delivery;


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

		/**
		 * Creates new specs.
		 * 
		 */
		public Builder() {
		}

		/**
		* Sets specs size.
		* 
		* @param size  Specs size.
		*/
		public Builder size(String size) {
			this.size = size;
			return this;
		}

		/**
		* Sets specs package details.
		* 
		* @param packageDetails  Specs package details.
		*/
		public Builder packageDetails(PackageDetails packageDetails) {
			this.packageDetails = packageDetails;
			return this;
		}

		public Specs build() {
			return new Specs(this);
		}
	}
}