package com.bosta.response.pickup;

public class GetPickupDetailsResponse {
	 private boolean success;
	 private String message;
	 GetPickupDetailsResponseData DataObject;


	 // Getter Methods 

	 public boolean getSuccess() {
	  return success;
	 }

	 public String getMessage() {
	  return message;
	 }

	 public GetPickupDetailsResponseData getData() {
	  return DataObject;
	 }

	 // Setter Methods 

	 public void setSuccess(boolean success) {
	  this.success = success;
	 }

	 public void setMessage(String message) {
	  this.message = message;
	 }

	 public void setData(GetPickupDetailsResponseData dataObject) {
	  this.DataObject = dataObject;
	 }
}
