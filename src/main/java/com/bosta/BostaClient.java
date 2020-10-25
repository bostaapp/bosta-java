package com.bosta;

import com.bosta.enums.EnvironmentOptions;
import com.bosta.request.delivery.CreateDeliveryRequest;
import com.bosta.request.delivery.UpdateDeliveryRequest;
import com.bosta.request.pickup.CreatePickupRequest;
import com.bosta.request.pickup.UpdatePickupRequest;
import com.bosta.response.delivery.CreateDeliveryResponse;
import com.bosta.response.delivery.DeliveryTrackingResponse;
import com.bosta.response.delivery.GetDeliveryResponse;
import com.bosta.response.delivery.ListDeliveryResponse;
import com.bosta.response.delivery.UpdateDeliveryResponse;
import com.bosta.response.pickup.CreatePickupResponse;
import com.bosta.response.pickup.GetPickupDetailsResponse;
import com.bosta.response.pickup.ListPickupResponse;
import com.bosta.response.pickup.UpdatePickupResponse;

public class BostaClient {
	String apiKey;
	DeliveryService delivery;
	PickupService pickup;
	
	private void initialize(String apiKey, String baseUrl){
		this.delivery = new DeliveryService(apiKey, baseUrl);
		this.pickup = new PickupService(apiKey, baseUrl);
	}

	@SuppressWarnings("unused")
	private BostaClient() {
		//not called
	}

	public BostaClient(String apiKey){
		this.apiKey = apiKey;
		initialize(apiKey, EnvironmentOptions.PRODUCTION.getVal());
	}
	
	public BostaClient(String apiKey, EnvironmentOptions environmentOptions){
		this.apiKey = apiKey;
		initialize(apiKey, environmentOptions.getVal());
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

	public ListPickupResponse listPickups(int pageId)  throws Exception{
		try {
			return this.pickup.list(pageId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public CreatePickupResponse createPickup(CreatePickupRequest createPickupRequest) throws Exception {
		try {
			return this.pickup.create(createPickupRequest);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public GetPickupDetailsResponse getPickup(String pickupId)  throws Exception{
		try {
			return this.pickup.get(pickupId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public UpdatePickupResponse updatePickup(UpdatePickupRequest updatePickupRequest, String pickupId) throws Exception {
		try {
			return this.pickup.update(updatePickupRequest, pickupId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}