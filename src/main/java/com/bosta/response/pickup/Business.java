package com.bosta.response.pickup;

public class Business {
	 private String _id;
	 private String name;
	 Address AddressObject;
	 private String phone;


	 // Getter Methods 

	 public String get_id() {
	  return _id;
	 }

	 public String getName() {
	  return name;
	 }

	 public Address getAddress() {
	  return AddressObject;
	 }

	 public String getPhone() {
	  return phone;
	 }

	 // Setter Methods 

	 public void set_id(String _id) {
	  this._id = _id;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setAddress(Address addressObject) {
	  this.AddressObject = addressObject;
	 }

	 public void setPhone(String phone) {
	  this.phone = phone;
	 }
}
