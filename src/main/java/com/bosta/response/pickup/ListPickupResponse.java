package com.bosta.response.pickup;

public class ListPickupResponse {
	 private boolean success;
	 private String message;
	 ListPickupResponseData DataObject;


	 // Getter Methods 

	 public boolean getSuccess() {
	  return success;
	 }

	 public String getMessage() {
	  return message;
	 }

	 public ListPickupResponseData getData() {
	  return DataObject;
	 }

	 // Setter Methods 

	 public void setSuccess(boolean success) {
	  this.success = success;
	 }

	 public void setMessage(String message) {
	  this.message = message;
	 }

	 public void setData(ListPickupResponseData dataObject) {
	  this.DataObject = dataObject;
	 }
}
