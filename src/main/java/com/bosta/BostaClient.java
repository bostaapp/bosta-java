package com.bosta;

import com.bosta.dto.delivery.Delivery;

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
	
	public void getDelivery(String trackingNumber) {
		this.delivery.get(trackingNumber);
	}
	
	public void listDeliveries() {
		this.delivery.list();
	}
	
	public void createDelivery(Delivery delivery) {
		this.delivery.create(delivery);
	}
	
	public void listPickups() {
		this.pickup.list();
	}
	
	public void createPickup() {
		this.pickup.create();
	}
	
}