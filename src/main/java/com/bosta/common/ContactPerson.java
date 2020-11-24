package com.bosta.common;

public class ContactPerson {
	private String name;
	private String phone;
	private String email;
	
	private ContactPerson(Builder builder) {
		this.name = builder.name;
		this.phone =builder.phone;
		this.email = builder.email;
	}
	
	public static final class Builder {
		private String name;
		private String phone;
		private String email;

		public Builder() { // The mandatory parameters are set here
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public ContactPerson build() {
			return new ContactPerson(this);
		}
	}
}
