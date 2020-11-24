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

		/**
		* Creates update pickup request params.
		*/
		public Builder() {
		}

		/**
		* Sets pickup request scheduled date.
		* 
		* @param scheduledDate  Pickup request scheduled date.
		*/
		public Builder scheduledDate(Date scheduledDate) {
			this.scheduledDate = scheduledDate;
			return this;
		}

		/**
		* Sets pickup request scheduled time slot.
		* 
		* @param scheduledTimeSlot  Pickup request scheduled time slot.
		*/
		public Builder scheduledTimeSlot(ScheduledTimeSlot scheduledTimeSlot) {
			this.scheduledTimeSlot = scheduledTimeSlot;
			return this;
		}

		/**
		* Sets pickup request business location Id.
		* 
		* @param businessLocationId  Pickup request business location Id.
		*/
		public Builder businessLocationId(String businessLocationId) {
			this.businessLocationId = businessLocationId;
			return this;
		}

		/**
		* Sets pickup request notes.
		* 
		* @param notes  Pickup request notes.
		*/
		public Builder notes(String notes) {
			this.notes = notes;
			return this;
		}

		/**
		* Sets pickup request contact person.
		* 
		* @param contactPerson  Pickup request contact person.
		*/
		public Builder contactPerson(ContactPerson contactPerson) {
			this.contactPerson = contactPerson;
			return this;
		}

		public UpdatePickupRequest build() {
			return new UpdatePickupRequest(this);
		}
	}
}
