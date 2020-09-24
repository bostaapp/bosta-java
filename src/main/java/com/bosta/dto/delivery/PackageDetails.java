package com.bosta.dto.delivery;

import com.bosta.dto.delivery.Receiver.Builder;

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

			public Builder() { // The mandatory parameters are set here
			}

			public Builder itemsCount(int itemsCount) {
				this.itemsCount = itemsCount;
				return this;
			}
			
			public Builder document(String document) {
				this.document = document;
				return this;
			}
			
			public Builder description(String description) {
				this.description = description;
				return this;
			}

			public PackageDetails build() {
				return new PackageDetails(this);
			}
		}
}