package com.bosta.response.delivery;

import java.util.ArrayList;

public class DeliveryTrackingData {
	DeliveryTrackingCurrentStatus CurrentStatusObject;
	ArrayList < Object > stateHistory = new ArrayList < Object > ();
	private String trackingNumber;
	private String createDate;
	private String updateDate;
	private String dropOffAddress;


	// Getter Methods 

	public DeliveryTrackingCurrentStatus getCurrentStatus() {
		return CurrentStatusObject;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public String getDropOffAddress() {
		return dropOffAddress;
	}

	// Setter Methods 

	public void setCurrentStatus(DeliveryTrackingCurrentStatus currentStatusObject) {
		this.CurrentStatusObject = currentStatusObject;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public void setDropOffAddress(String dropOffAddress) {
		this.dropOffAddress = dropOffAddress;
	}
}
