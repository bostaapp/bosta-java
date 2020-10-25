package com.bosta.response.city;

import java.util.ArrayList;

public class ListCityResponse {
	public class Codebeautify {
		 private boolean success;
		 private String message;
		 ArrayList < Object > data = new ArrayList < Object > ();


		 // Getter Methods 

		 public boolean getSuccess() {
		  return success;
		 }

		 public String getMessage() {
		  return message;
		 }

		 // Setter Methods 

		 public void setSuccess(boolean success) {
		  this.success = success;
		 }

		 public void setMessage(String message) {
		  this.message = message;
		 }
		}
}
