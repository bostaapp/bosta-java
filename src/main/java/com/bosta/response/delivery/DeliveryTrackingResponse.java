package com.bosta.response.delivery;

public class DeliveryTrackingResponse {
	private boolean success;
	private String message;
	DeliveryTrackingData DataObject;


	// Getter Methods 

	public boolean getSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}

	public DeliveryTrackingData getData() {
		return DataObject;
	}

	// Setter Methods 

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(DeliveryTrackingData dataObject) {
		this.DataObject = dataObject;
	}
}

