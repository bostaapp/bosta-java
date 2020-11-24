package com.bosta.response.delivery;

public class GetDeliveryResponse {
	private boolean success;
	private String message;
	GetDeliveryData DataObject;


	// Getter Methods 

	public boolean getSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}

	public GetDeliveryData getData() {
		return DataObject;
	}

	// Setter Methods 

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(GetDeliveryData dataObject) {
		this.DataObject = dataObject;
	}

}
