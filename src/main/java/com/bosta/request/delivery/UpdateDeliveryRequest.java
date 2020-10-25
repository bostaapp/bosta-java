package com.bosta.request.delivery;

public class UpdateDeliveryRequest {
	private Receiver ReceiverObject;
	private PickUpAddress PickUpAddressObject;
	private DropOffAddress DropOffAddressObject;
	private ReturnAddress ReturnAddressObject;
	private String notes;
	private String businessReference;
	private String webhookUrl;
	private float cod;

	private UpdateDeliveryRequest(Builder builder) {
		this.ReceiverObject = builder.ReceiverObject;
		this.PickUpAddressObject =builder.PickUpAddressObject;
		this.DropOffAddressObject = builder.DropOffAddressObject;
		this.ReturnAddressObject = builder.ReturnAddressObject;
		this.notes = builder.notes;
		this.businessReference = builder.businessReference;
		this.webhookUrl = builder.webhookUrl;
		this.cod = builder.cod;
	}

	public static final class Builder {
		private Receiver ReceiverObject;
		private PickUpAddress PickUpAddressObject;
		private DropOffAddress DropOffAddressObject;
		private ReturnAddress ReturnAddressObject;
		private String notes;
		private String businessReference;
		private String webhookUrl;
		private float cod;

		/**
		* Creates delivery update params.
		* 
		*/
		public Builder() {
		}

		/**
		* Sets delivery receiver.
		* 
		* @param ReceiverObject  Delivery receiver.
		*/
		public Builder ReceiverObject(Receiver ReceiverObject) {
			this.ReceiverObject = ReceiverObject;
			return this;
		}
		
		/**
		* Sets delivery pickUp address.
		* 
		* @param PickUpAddressObject  Delivery pickUp address.
		*/
		public Builder PickUpAddressObject(PickUpAddress PickUpAddressObject) {
			this.PickUpAddressObject = PickUpAddressObject;
			return this;
		}
		
		/**
		* Sets delivery droppOff address.
		* 
		* @param DropOffAddressObject  Delivery droppOff address.
		*/
		public Builder DropOffAddressObject(DropOffAddress DropOffAddressObject) {
			this.DropOffAddressObject = DropOffAddressObject;
			return this;
		}
		
		/**
		* Sets delivery return address.
		* 
		* @param ReturnAddressObject  Delivery return address.
		*/
		public Builder ReturnAddressObject(ReturnAddress ReturnAddressObject) {
			this.ReturnAddressObject = ReturnAddressObject;
			return this;
		}
		
		/**
		* Sets delivery notes.
		* 
		* @param notes  Delivery notes.
		*/
		public Builder notes(String notes) {
			this.notes = notes;
			return this;
		}
		
		/**
		* Sets delivery business reference.
		* 
		* @param businessReference  Delivery business reference.
		*/
		public Builder businessReference(String businessReference) {
			this.businessReference = businessReference;
			return this;
		}
		
		/**
		* Sets delivery webhook URL.
		* 
		* @param webhookUrl  Delivery webhook URL.
		*/
		public Builder webhookUrl(String webhookUrl) {
			this.webhookUrl = webhookUrl;
			return this;
		}
		
		/**
		* Sets delivery CoD.
		* 
		* @param cod  Delivery CoD.
		*/
		public Builder cod(float cod) {
			this.cod = cod;
			return this;
		}

		public UpdateDeliveryRequest build() {
			return new UpdateDeliveryRequest(this);
		}
	}
}

