package com.bosta.response.delivery;

import java.util.ArrayList;

public class ListDeliveryData {
	ArrayList < Object > deliveries = new ArrayList < Object > ();
	private float count;
	private String perPage;
	private String page;


	// Getter Methods 

	public float getCount() {
		return count;
	}

	public String getPerPage() {
		return perPage;
	}

	public String getPage() {
		return page;
	}

	// Setter Methods 

	public void setCount(float count) {
		this.count = count;
	}

	public void setPerPage(String perPage) {
		this.perPage = perPage;
	}

	public void setPage(String page) {
		this.page = page;
	}
}
