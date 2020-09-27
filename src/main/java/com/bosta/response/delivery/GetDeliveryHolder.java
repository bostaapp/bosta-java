package com.bosta.response.delivery;

public class GetDeliveryHolder {
	private String _id;
	private String name;
	private String phone;
	private String role;


	// Getter Methods 

	public String get_id() {
		return _id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getRole() {
		return role;
	}

	// Setter Methods 

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
