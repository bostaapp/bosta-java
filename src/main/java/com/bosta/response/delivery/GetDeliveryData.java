package com.bosta.response.delivery;

import java.util.ArrayList;

public class GetDeliveryData {
	private String _id;
	GetDeliveryPickupAddress PickupAddressObject;
	GetDeliveryDropOffAddress DropOffAddressObject;
	private String notes;
	private float cod;
	GetDeliveryState StateObject;
	private String maskedState;
	GetDeliveryStatesData StatesDataObject;
	GetDeliveryReceiver ReceiverObject;
	GetDeliveryType TypeObject;
	private String businessReference;
	private String trackingNumber;
	private String createdAt;
	private String updatedAt;
	GetDeliverySpecs SpecsObject;
	GetDeliveryHolder HolderObject;
	private float deliveryAttemptsLength;
	private float returnAttemptsLength;
	private float pickupAttemptsLength;
	private float outboundActionsCount;
	private float shipmentFees;
	ArrayList < Object > timeline = new ArrayList < Object > ();
	ArrayList < Object > history = new ArrayList < Object > ();
	private float creationTimestamp;


	// Getter Methods 

	public String get_id() {
		return _id;
	}

	public GetDeliveryPickupAddress getPickupAddress() {
		return PickupAddressObject;
	}

	public GetDeliveryDropOffAddress getDropOffAddress() {
		return DropOffAddressObject;
	}

	public String getNotes() {
		return notes;
	}

	public float getCod() {
		return cod;
	}

	public GetDeliveryState getState() {
		return StateObject;
	}

	public String getMaskedState() {
		return maskedState;
	}

	public GetDeliveryStatesData getStatesData() {
		return StatesDataObject;
	}

	public GetDeliveryReceiver getReceiver() {
		return ReceiverObject;
	}

	public GetDeliveryType getType() {
		return TypeObject;
	}

	public String getBusinessReference() {
		return businessReference;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public GetDeliverySpecs getSpecs() {
		return SpecsObject;
	}

	public GetDeliveryHolder getHolder() {
		return HolderObject;
	}

	public float getDeliveryAttemptsLength() {
		return deliveryAttemptsLength;
	}

	public float getReturnAttemptsLength() {
		return returnAttemptsLength;
	}

	public float getPickupAttemptsLength() {
		return pickupAttemptsLength;
	}

	public float getOutboundActionsCount() {
		return outboundActionsCount;
	}

	public float getShipmentFees() {
		return shipmentFees;
	}

	public float getCreationTimestamp() {
		return creationTimestamp;
	}

	// Setter Methods 

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setPickupAddress(GetDeliveryPickupAddress pickupAddressObject) {
		this.PickupAddressObject = pickupAddressObject;
	}

	public void setDropOffAddress(GetDeliveryDropOffAddress dropOffAddressObject) {
		this.DropOffAddressObject = dropOffAddressObject;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setCod(float cod) {
		this.cod = cod;
	}

	public void setState(GetDeliveryState stateObject) {
		this.StateObject = stateObject;
	}

	public void setMaskedState(String maskedState) {
		this.maskedState = maskedState;
	}

	public void setStatesData(GetDeliveryStatesData statesDataObject) {
		this.StatesDataObject = statesDataObject;
	}

	public void setReceiver(GetDeliveryReceiver receiverObject) {
		this.ReceiverObject = receiverObject;
	}

	public void setType(GetDeliveryType typeObject) {
		this.TypeObject = typeObject;
	}

	public void setBusinessReference(String businessReference) {
		this.businessReference = businessReference;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setSpecs(GetDeliverySpecs specsObject) {
		this.SpecsObject = specsObject;
	}

	public void setHolder(GetDeliveryHolder holderObject) {
		this.HolderObject = holderObject;
	}

	public void setDeliveryAttemptsLength(float deliveryAttemptsLength) {
		this.deliveryAttemptsLength = deliveryAttemptsLength;
	}

	public void setReturnAttemptsLength(float returnAttemptsLength) {
		this.returnAttemptsLength = returnAttemptsLength;
	}

	public void setPickupAttemptsLength(float pickupAttemptsLength) {
		this.pickupAttemptsLength = pickupAttemptsLength;
	}

	public void setOutboundActionsCount(float outboundActionsCount) {
		this.outboundActionsCount = outboundActionsCount;
	}

	public void setShipmentFees(float shipmentFees) {
		this.shipmentFees = shipmentFees;
	}

	public void setCreationTimestamp(float creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}
}
