package com.bosta.response.delivery;

public class CreateDeliveryData {
	  private String _id;
	  private String trackingNumber;
	  private String message;
	  CreateDeliveryDataState StateObject;


	 // Getter Methods 

	  public String get_id() {
	    return _id;
	  }

	  public String getTrackingNumber() {
	    return trackingNumber;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public CreateDeliveryDataState getState() {
	    return StateObject;
	  }

	 // Setter Methods 

	  public void set_id( String _id ) {
	    this._id = _id;
	  }

	  public void setTrackingNumber( String trackingNumber ) {
	    this.trackingNumber = trackingNumber;
	  }

	  public void setMessage( String message ) {
	    this.message = message;
	  }

	  public void setState( CreateDeliveryDataState stateObject ) {
	    this.StateObject = stateObject;
	  }
	}
