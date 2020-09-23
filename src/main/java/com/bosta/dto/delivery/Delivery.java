
package com.bosta.dto.delivery;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class Delivery {

	private @NotNull int type;
	private Specs specs;
	private String notes;
	private @PositiveOrZero float cod;
	private DropOffAddress dropOffAddress;
	private String businessReference;
	private @NotNull Receiver receiver;
	private String webhookUrl;

	private Delivery(Builder builder) {
		this.type = builder.type;
		this.specs = builder.specs;
		this.notes = builder.notes;
		this.cod = builder.cod;
		this.dropOffAddress = builder.dropOffAddress;
		this.receiver = builder.receiver;
		this.webhookUrl = builder.webhookUrl;
		this.businessReference = builder.businessReference;
	}

	public static final class Builder {
		private int  type;
		private Specs specs;
		private String notes;
		private float cod;
		private DropOffAddress dropOffAddress;
		private String businessReference;
		private Receiver receiver;
		private String webhookUrl;

		public Builder(int type, float cod, Receiver receiver) { // The mandatory parameters are set here
			this.type = type;
			this.cod = cod;
			this.receiver = receiver;
		}

		public Builder specs(Specs specs) {
			this.specs = specs;
			return this;
		}

		public Builder notes(String notes) {
			this.notes = notes;
			return this;
		}

		public Builder dropOffAddress(DropOffAddress dropOffAddress) {
			this.dropOffAddress = dropOffAddress;
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
		public Delivery build() {
			return new Delivery(this);
		}
	}
}