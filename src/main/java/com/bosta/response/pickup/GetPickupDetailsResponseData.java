package com.bosta.response.pickup;

import java.util.ArrayList;

public class GetPickupDetailsResponseData {
	private String _id;
	 private String type;
	 private String scheduledDate;
	 private String scheduledTimeSlot;
	 private String state;
	 ArrayList < Object > tickets = new ArrayList < Object > ();
	 private String puid;
	 Business BusinessObject;
	 ContactPerson ContactPersonObject;
	 private String notes;
	 private String businessLocationId;
	 ArrayList < Object > deliveries = new ArrayList < Object > ();
	 ArrayList < Object > log = new ArrayList < Object > ();
	 private String createdAt;
	 private String updatedAt;

	 // Getter Methods 

	 public String get_id() {
	  return _id;
	 }

	 public String getType() {
	  return type;
	 }

	 public String getScheduledDate() {
	  return scheduledDate;
	 }

	 public String getScheduledTimeSlot() {
	  return scheduledTimeSlot;
	 }

	 public String getState() {
	  return state;
	 }

	 public String getPuid() {
	  return puid;
	 }

	 public Business getBusiness() {
	  return BusinessObject;
	 }

	 public ContactPerson getContactPerson() {
	  return ContactPersonObject;
	 }

	 public String getNotes() {
	  return notes;
	 }

	 public String getBusinessLocationId() {
	  return businessLocationId;
	 }

	 public String getCreatedAt() {
	  return createdAt;
	 }

	 public String getUpdatedAt() {
	  return updatedAt;
	 }

	 // Setter Methods 

	 public void set_id(String _id) {
	  this._id = _id;
	 }

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setScheduledDate(String scheduledDate) {
	  this.scheduledDate = scheduledDate;
	 }

	 public void setScheduledTimeSlot(String scheduledTimeSlot) {
	  this.scheduledTimeSlot = scheduledTimeSlot;
	 }

	 public void setState(String state) {
	  this.state = state;
	 }

	 public void setPuid(String puid) {
	  this.puid = puid;
	 }

	 public void setBusiness(Business businessObject) {
	  this.BusinessObject = businessObject;
	 }

	 public void setContactPerson(ContactPerson contactPersonObject) {
	  this.ContactPersonObject = contactPersonObject;
	 }

	 public void setNotes(String notes) {
	  this.notes = notes;
	 }

	 public void setBusinessLocationId(String businessLocationId) {
	  this.businessLocationId = businessLocationId;
	 }

	 public void setCreatedAt(String createdAt) {
	  this.createdAt = createdAt;
	 }

	 public void setUpdatedAt(String updatedAt) {
	  this.updatedAt = updatedAt;
	 }

}
