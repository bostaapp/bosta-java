package com.bosta;

import com.bosta.request.delivery.CreateDeliveryRequest;
import com.bosta.request.delivery.UpdateDeliveryRequest;
import com.bosta.request.pickup.CreatePickupRequest;
import com.bosta.response.delivery.CreateDeliveryResponse;
import com.bosta.response.delivery.DeliveryTrackingResponse;
import com.bosta.response.delivery.GetDeliveryResponse;
import com.bosta.response.delivery.ListDeliveryResponse;
import com.bosta.response.delivery.UpdateDeliveryResponse;
import com.bosta.response.pickup.CreatePickupResponse;

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

	public DeliveryTrackingResponse getDeliveryTracking(String deliveryId) throws Exception {
		try {
			return this.delivery.tracking(deliveryId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public ListDeliveryResponse listDeliveries() throws Exception{
		try {
			return this.delivery.list();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public ListDeliveryResponse listDeliveries(int perPage, int page) throws Exception{
		try {
			return this.delivery.list(perPage, page);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public void listPickups() {
		this.pickup.list();
	}

	public CreatePickupResponse createPickup(CreatePickupRequest createPickupRequest) throws Exception {
		try {
			return this.pickup.create(createPickupRequest);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}