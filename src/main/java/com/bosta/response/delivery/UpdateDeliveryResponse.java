package com.bosta.response.delivery;

public class UpdateDeliveryResponse {
	 private boolean success;
	 private String message;
	 private String data;


	 // Getter Methods 

	 public boolean getSuccess() {
	  return success;
	 }

	 public String getMessage() {
	  return message;
	 }

	 public String getData() {
	  return data;
	 }

	 // Setter Methods 

	 public void setSuccess(boolean success) {
	  this.success = success;
	 }

	 public void setMessage(String message) {
	  this.message = message;
	 }

	 public void setData(String data) {
	  this.data = data;
	 }
}
