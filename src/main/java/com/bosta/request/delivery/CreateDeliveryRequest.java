
package com.bosta.request.delivery;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.bosta.enums.DeliveryType;

public class CreateDeliveryRequest {

	private @NotNull int type;
	private Specs specs;
	private String notes;
	private @PositiveOrZero float cod;
	private DropOffAddress dropOffAddress;
	private String businessReference;
	private @NotNull Receiver receiver;
	private String webhookUrl;

	private CreateDeliveryRequest(Builder builder) {
		this.type = builder.type.getValue();
		this.specs = builder.specs;
		this.notes = builder.notes;
		this.cod = builder.cod;
		this.dropOffAddress = builder.dropOffAddress;
		this.receiver = builder.receiver;
		this.webhookUrl = builder.webhookUrl;
		this.businessReference = builder.businessReference;
	}

	public static final class Builder {
		private DeliveryType  type;
		private Specs specs;
		private String notes;
		private float cod;
		private DropOffAddress dropOffAddress;
		private String businessReference;
		private Receiver receiver;
		private String webhookUrl;

		/**
		* Creates new delivery
		* 
		* @param type  Delivery type.
		* @param cod  Cash on delivery.
		* @param receiver  Delivery receiver.
		*/
		public Builder(DeliveryType type, float cod, Receiver receiver) { // The mandatory parameters are set here
			this.type = type;
			this.cod = cod;
			this.receiver = receiver;
		}

		/**
		* Sets delivery specifications.
		* 
		* @param specs  Delivery specifications.
		*/
		public Builder specs(Specs specs) {
			this.specs = specs;
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
		* Sets delivery dropOffAddress.
		* 
		* @param dropOffAddress  Delivery dropOffAddress.
		*/
		public Builder dropOffAddress(DropOffAddress dropOffAddress) {
			this.dropOffAddress = dropOffAddress;
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
		
		public CreateDeliveryRequest build() {
			return new CreateDeliveryRequest(this);
		}
	}
}