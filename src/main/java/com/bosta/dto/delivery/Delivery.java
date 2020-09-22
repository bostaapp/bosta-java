 
package com.bosta.dto.delivery;

public class Delivery {
	 int type;
	 Specs specs;
	 String notes;
	 float cod;
	 DropOffAddress dropOffAddress;
	 String businessReference;
	 Receiver receiver;
	 String webhookUrl;
	 
	 public Delivery(int type, Specs specs,String notes,
			 float cod, DropOffAddress dropOffAddress,
			 String businessReference,Receiver receiver,
			 String webhookUrl) {
		 this.type = type;
		 this.specs = specs;
		 this.notes = notes;
		 this.cod = cod;
		 this.dropOffAddress = dropOffAddress;
		 this.receiver = receiver;
		 this.webhookUrl = webhookUrl;
	 }
}