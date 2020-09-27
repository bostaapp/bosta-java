package com.bosta;

import com.bosta.request.delivery.CreateDeliveryRequest;
import com.bosta.response.delivery.CreateDeliveryResponse;
import com.bosta.response.delivery.GetDeliveryResponse;

public class BostaClient {
	String apiKey;
	DeliveryService delivery;
	PickupService pickup;

	//This is the constructor
	public BostaClient(String apiKey){
		this.apiKey = apiKey;
		this.delivery = new DeliveryService(apiKey);
		this.pickup = new PickupService(apiKey);
	}

	public GetDeliveryResponse getDelivery(String trackingNumber) throws Exception {
		try {
			return this.delivery.get(trackingNumber);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public void listDeliveries() {
		this.delivery.list();
	}

	public CreateDeliveryResponse createDelivery(CreateDeliveryRequest delivery) throws Exception {
		try {
			return this.delivery.create(delivery);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public void listPickups() {
		this.pickup.list();
	}

	public void createPickup() {
		this.pickup.create();
	}

}