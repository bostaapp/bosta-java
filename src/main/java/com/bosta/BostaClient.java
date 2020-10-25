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

/**
 * This class is for creating Bosta client.
 *
 */
public class BostaClient {
	String apiKey;
	DeliveryService delivery;
	PickupService pickup;
	
	private void initialize(String apiKey, String baseUrl){
		this.delivery = new DeliveryService(apiKey, baseUrl);
		this.pickup = new PickupService(apiKey, baseUrl);
	}

	/**
	* Creates bosta client on production environment by default.
	*
	* @param  apiKey Business API key.
	* @return The bosta client.
	*/
	public BostaClient(String apiKey){
		this.apiKey = apiKey;
		initialize(apiKey, EnvironmentOptions.PRODUCTION.getVal());
	}
	
	/**
	* Creates bosta client with the selected environment.
	*
	* @param  apiKey Business API key.
	* @param  environmentOptions Environment option.
	* @return The bosta client.
	*/
	public BostaClient(String apiKey, EnvironmentOptions environmentOptions){
		this.apiKey = apiKey;
		initialize(apiKey, environmentOptions.getVal());
	}

	/**
	* Returns a delivery based on the tracking number.
	*
	* @param  trackingNumber Delivery tracking number.
	* @return The result
	*/
	public GetDeliveryResponse getDelivery(String trackingNumber) throws Exception {
		try {
			return this.delivery.get(trackingNumber);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Creates a new delivery.
	*
	* @param  delivery New Delivery params.
	* @return The result
	*/
	public CreateDeliveryResponse createDelivery(CreateDeliveryRequest delivery) throws Exception {
		try {
			return this.delivery.create(delivery);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Updates a delivery.
	*
	* @param  delivery Delivery data to be updated.
	* @param  deliveryId The delivery Id.
	* @return The result
	*/
	public UpdateDeliveryResponse updateDelivery(UpdateDeliveryRequest delivery, String deliveryId) throws Exception {
		try {
			return this.delivery.update(delivery, deliveryId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Terminates a delivery.
	*
	* @param  deliveryId The delivery Id.
	* 
	* @return The result
	*/
	public UpdateDeliveryResponse terminateDelivery(String deliveryId) throws Exception {
		try {
			return this.delivery.terminate(deliveryId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Returns a delivery awb.
	*
	* @param  deliveryId The delivery Id.
	* 
	* @return The result
	*/
	public UpdateDeliveryResponse getDeliveryAwb(String deliveryId) throws Exception {
		try {
			return this.delivery.awp(deliveryId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Returns a delivery tracking.
	*
	* @param  deliveryId The delivery Id.
	* 
	* @return The result
	*/
	public DeliveryTrackingResponse getDeliveryTracking(String deliveryId) throws Exception {
		try {
			return this.delivery.tracking(deliveryId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Returns a list of deliveries.
	* 
	* @return The result
	*/
	public ListDeliveryResponse listDeliveries() throws Exception{
		try {
			return this.delivery.list();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Returns a list of deliveries.
	*
	* @param  perPage The returned items per page.
	* @param  page The page number(started from 1).
	* 
	* @return The result
	*/
	public ListDeliveryResponse listDeliveries(int perPage, int page) throws Exception{
		try {
			return this.delivery.list(perPage, page);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Returns a list of deliveries.
	*
	* @param  pageId The page number(started from 0).
	* 
	* @return The result
	*/
	public ListPickupResponse listPickups(int pageId)  throws Exception{
		try {
			return this.pickup.list(pageId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Creates new pickup request.
	*
	* @param  pickupRequest New pickup request params.
	* 
	* @return The result
	*/
	public CreatePickupResponse createPickup(CreatePickupRequest pickupRequest) throws Exception {
		try {
			return this.pickup.create(pickupRequest);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Returns a pickup request.
	*
	* @param  pickupId The pickup request id.
	* 
	* @return The result
	*/
	public GetPickupDetailsResponse getPickup(String pickupId)  throws Exception{
		try {
			return this.pickup.get(pickupId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	* Updates a pickup request.
	*
	*@param  pickupRequest PickupRequest data to be updated.
	* @param  pickupId The pickup request id.
	* 
	* @return The result
	*/
	public UpdatePickupResponse updatePickup(UpdatePickupRequest pickupRequest, String pickupId) throws Exception {
		try {
			return this.pickup.update(pickupRequest, pickupId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}