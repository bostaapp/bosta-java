package com.bosta.response.delivery;

public class GetDeliverPackageDetails {
	private float itemsCount;
	private String document;
	private String description;


	// Getter Methods 

	public float getItemsCount() {
		return itemsCount;
	}

	public String getDocument() {
		return document;
	}

	public String getDescription() {
		return description;
	}

	// Setter Methods 

	public void setItemsCount(float itemsCount) {
		this.itemsCount = itemsCount;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
