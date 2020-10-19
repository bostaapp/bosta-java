package com.bosta.response.pickup;

public class CreatePickupResponse {
	 private boolean success;
	 private String message;
	 CreatePickupResponseData DataObject;

	 // Getter Methods 

	 public boolean getSuccess() {
	  return success;
	 }

	 public String getMessage() {
	  return message;
	 }

	 public CreatePickupResponseData getData() {
	  return DataObject;
	 }

	 // Setter Methods 

	 public void setSuccess(boolean success) {
	  this.success = success;
	 }

	 public void setMessage(String message) {
	  this.message = message;
	 }

	 public void setData(CreatePickupResponseData dataObject) {
	  this.DataObject = dataObject;
	 }
}
