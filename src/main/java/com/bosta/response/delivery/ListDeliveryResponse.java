package com.bosta.response.delivery;

public class ListDeliveryResponse {
	private boolean success;
	private String message;
	ListDeliveryData DataObject;


	// Getter Methods 

	public boolean getSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}

	public ListDeliveryData getData() {
		return DataObject;
	}

	// Setter Methods 

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(ListDeliveryData dataObject) {
		this.DataObject = dataObject;
	}
}
