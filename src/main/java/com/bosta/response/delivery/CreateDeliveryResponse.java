package com.bosta.response.delivery;

public class CreateDeliveryResponse {
	  private boolean success;
	  private String message;
	  CreateDeliveryData DataObject;


	 // Getter Methods 

	  public boolean getSuccess() {
	    return success;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public CreateDeliveryData getData() {
	    return DataObject;
	  }

	 // Setter Methods 

	  public void setSuccess( boolean success ) {
	    this.success = success;
	  }

	  public void setMessage( String message ) {
	    this.message = message;
	  }

	  public void setData( CreateDeliveryData dataObject ) {
	    this.DataObject = dataObject;
	  }
	}
