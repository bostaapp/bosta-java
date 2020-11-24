package com.bosta.response.pickup;

public class UpdatePickupResponse {
	 private boolean success;
	 private String message;
	 private Object data = null;


	 // Getter Methods 

	 public boolean getSuccess() {
	  return success;
	 }

	 public String getMessage() {
	  return message;
	 }

	 public Object getData() {
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
