package com.bosta.request.pickup;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.bosta.common.ContactPerson;
import com.bosta.enums.ScheduledTimeSlot;

public class CreatePickupRequest {
	private String businessLocationId;
	private String notes;
	private @NotNull Date scheduledDate;
	private @NotNull String scheduledTimeSlot;
	private ContactPerson contactPerson;
	
	private CreatePickupRequest(Builder builder) {
		this.businessLocationId = builder.businessLocationId;
		this.notes =builder.notes;
		this.scheduledDate = builder.scheduledDate;
		this.scheduledTimeSlot = builder.scheduledTimeSlot.getVal();
		this.contactPerson = builder.contactPerson;
	}
	
	public static final class Builder {
		private String businessLocationId;
		private String notes;
		private Date scheduledDate;
		private ScheduledTimeSlot scheduledTimeSlot;
		private ContactPerson contactPerson;

		public Builder(Date scheduledDate, ScheduledTimeSlot scheduledTimeSlot) { // The mandatory parameters are set here
			this.scheduledDate = scheduledDate;
			this.scheduledTimeSlot = scheduledTimeSlot;
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

		public CreatePickupRequest build() {
			return new CreatePickupRequest(this);
		}
	}
}
