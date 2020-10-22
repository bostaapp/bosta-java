package com.bosta.request.pickup;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.bosta.common.ContactPerson;
import com.bosta.enums.ScheduledTimeSlot;

public class UpdatePickupRequest {
	private String businessLocationId;
	private String notes;
	private @NotNull Date scheduledDate;
	private @NotNull String scheduledTimeSlot;
	private ContactPerson contactPerson;

	private UpdatePickupRequest(Builder builder) {
		this.businessLocationId = builder.businessLocationId;
		this.notes =builder.notes;
		this.scheduledDate = builder.scheduledDate;
		if(builder.scheduledTimeSlot != null) {
			this.scheduledTimeSlot = builder.scheduledTimeSlot.getVal();
		}
		this.contactPerson = builder.contactPerson;
	}

	public static final class Builder {
		private String businessLocationId;
		private String notes;
		private Date scheduledDate;
		private ScheduledTimeSlot scheduledTimeSlot;
		private ContactPerson contactPerson;

		public Builder() { // The mandatory parameters are set here
		}

		public Builder scheduledDate(Date scheduledDate) {
			this.scheduledDate = scheduledDate;
			return this;
		}

		public Builder scheduledTimeSlot(ScheduledTimeSlot scheduledTimeSlot) {
			this.scheduledTimeSlot = scheduledTimeSlot;
			return this;
		}

		public Builder businessLocationId(String businessLocationId) {
			this.businessLocationId = businessLocationId;
			return this;
		}

		public Builder notes(String notes) {
			this.notes = notes;
			return this;
		}

		public Builder contactPerson(ContactPerson contactPerson) {
			this.contactPerson = contactPerson;
			return this;
		}

		public UpdatePickupRequest build() {
			return new UpdatePickupRequest(this);
		}
	}
}
