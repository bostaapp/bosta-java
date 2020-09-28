package com.bosta;

import com.bosta.request.delivery.CreateDeliveryRequest;
import com.bosta.request.delivery.UpdateDeliveryRequest;
import com.bosta.response.delivery.CreateDeliveryResponse;
import com.bosta.response.delivery.GetDeliveryResponse;
import com.bosta.response.delivery.UpdateDeliveryResponse;

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
	
	public UpdateDeliveryResponse updateDelivery(UpdateDeliveryRequest delivery, String deliveryId) throws Exception {
		try {
			return this.delivery.update(delivery, deliveryId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public UpdateDeliveryResponse terminateDelivery(String deliveryId) throws Exception {
		try {
			return this.delivery.terminate(deliveryId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public UpdateDeliveryResponse getDeliveryAwb(String deliveryId) throws Exception {
		try {
			return this.delivery.awp(deliveryId);
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