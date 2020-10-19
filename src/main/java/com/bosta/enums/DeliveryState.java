package com.bosta.enums;

public enum DeliveryState {

	PICKUP_REQUESTED("Pickup requested"),
	WAITING_FOR_ROUTE("Waiting for route"),
	ROUTE_ASSIGNED("Route Assigned"),
	WAITING_FOR_PICKUP("Waiting for Pickup"),
	PICKING_UP("Picking up"),
	PICKING_UP_FROM_WAREHOUSE("Picking up from warehouse"),
	PICKING_UP_FROM_CONSIGNEE("Picking up from consignee"),
	ARRIVED_AT_BUSINESS("Arrived at business"),
	RECEIVED_AT_WAREHOUSE("Received at warehouse"),
	PICKED_UP("Picked up"),
	PICKED_UP_FROM_BUSINESS("Picked up from business"),
	PICKED_UP_FROM_CONSIGNEE("Picked up from consignee"),
	DELIVERING("Delivering"),
	ARRIVED_AT_CUSTOMER("Arrived at customer"),
	DELIVERED("Delivered"),
	CANCELED("Canceled"),
	EXCEPTION("Exception"),
	RETURNED_TO_BUSINESS("Returned to business"),
	TERMINATED("Terminated"),
	IN_TRANSIT_BETWEEN_HUBS("In transit between Hubs"),
	DELIVERY_CONFIRMED("Delivery confirmed"),
	LOST("Lost"),
	DAMAGED("Damaged"),
	INVESTIGATION("Investigation");

	private final String val;

	private DeliveryState(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}	

}
