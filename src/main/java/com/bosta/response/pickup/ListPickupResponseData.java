package com.bosta.response.pickup;

import java.util.ArrayList;

public class ListPickupResponseData {
	 ArrayList < Object > pickups = new ArrayList < Object > ();
	 private float count;
	 private float scheduledToday;
	 private float scheduledTomorrow;
	 private float scheduledNextWeek;


	 // Getter Methods 

	 public float getCount() {
	  return count;
	 }

	 public float getScheduledToday() {
	  return scheduledToday;
	 }

	 public float getScheduledTomorrow() {
	  return scheduledTomorrow;
	 }

	 public float getScheduledNextWeek() {
	  return scheduledNextWeek;
	 }

	 // Setter Methods 

	 public void setCount(float count) {
	  this.count = count;
	 }

	 public void setScheduledToday(float scheduledToday) {
	  this.scheduledToday = scheduledToday;
	 }

	 public void setScheduledTomorrow(float scheduledTomorrow) {
	  this.scheduledTomorrow = scheduledTomorrow;
	 }

	 public void setScheduledNextWeek(float scheduledNextWeek) {
	  this.scheduledNextWeek = scheduledNextWeek;
	 }
}
