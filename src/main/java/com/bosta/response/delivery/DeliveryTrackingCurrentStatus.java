package com.bosta.response.delivery;

public class DeliveryTrackingCurrentStatus {
	private String state;
	private String code;
	private String timestamp;


	// Getter Methods 

	public String getState() {
		return state;
	}

	public String getCode() {
		return code;
	}

	public String getTimestamp() {
		return timestamp;
	}

	// Setter Methods 

	public void setState(String state) {
		this.state = state;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
