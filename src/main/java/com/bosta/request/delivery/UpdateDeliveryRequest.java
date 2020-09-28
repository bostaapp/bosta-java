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

		public Builder() { // The mandatory parameters are set here;
		}

		public Builder ReceiverObject(Receiver ReceiverObject) {
			this.ReceiverObject = ReceiverObject;
			return this;
		}
		
		public Builder PickUpAddressObject(PickUpAddress PickUpAddressObject) {
			this.PickUpAddressObject = PickUpAddressObject;
			return this;
		}
		
		public Builder DropOffAddressObject(DropOffAddress DropOffAddressObject) {
			this.DropOffAddressObject = DropOffAddressObject;
			return this;
		}
		
		public Builder ReturnAddressObject(ReturnAddress ReturnAddressObject) {
			this.ReturnAddressObject = ReturnAddressObject;
			return this;
		}
		
		public Builder notes(String notes) {
			this.notes = notes;
			return this;
		}
		
		public Builder businessReference(String businessReference) {
			this.businessReference = businessReference;
			return this;
		}
		
		public Builder webhookUrl(String webhookUrl) {
			this.webhookUrl = webhookUrl;
			return this;
		}
		
		public Builder cod(float cod) {
			this.cod = cod;
			return this;
		}

		public UpdateDeliveryRequest build() {
			return new UpdateDeliveryRequest(this);
		}
	}
}

