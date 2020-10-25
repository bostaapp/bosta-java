package com.bosta.request.delivery;

import com.bosta.request.delivery.Receiver.Builder;

public class PackageDetails {
	private int itemsCount;
	private String document;
	private String description;
	
	 
	 private PackageDetails (Builder builder){
		 this.itemsCount = builder.itemsCount;
		 this.document = builder.document;
		 this.description = builder.description;
	 }
	 
		public static final class Builder {
			private int itemsCount;
			private String document;
			private String description;

			/**
			* Creates new Package details.
			* 
			*/
			public Builder() {
			}

			/**
			* Sets Package details items count.
			* 
			* @param itemsCount Package details items count.
			*/
			public Builder itemsCount(int itemsCount) {
				this.itemsCount = itemsCount;
				return this;
			}
			
			/**
			* Sets Package details document.
			* 
			* @param document Package details document.
			*/
			public Builder document(String document) {
				this.document = document;
				return this;
			}
			
			/**
			* Sets Package details description.
			* 
			* @param description Package details description.
			*/
			public Builder description(String description) {
				this.description = description;
				return this;
			}

			public PackageDetails build() {
				return new PackageDetails(this);
			}
		}
}