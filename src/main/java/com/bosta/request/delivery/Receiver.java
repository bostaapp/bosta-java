package com.bosta.request.delivery;

import javax.validation.constraints.NotNull;


public class Receiver {
	private @NotNull String firstName;
	private @NotNull String lastName;
	private @NotNull String phone;
	private String email;

	private Receiver(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName =builder.lastName;
		this.phone = builder.phone;
		this.email = builder.email;
	}

	public static final class Builder {
		private String firstName;
		private String lastName;
		private String phone;
		private String email;

		/**
		* Creates new receiver.
		* 
		* @param firstName  Receiver first name.
		* @param lastName  Receiver last name.
		* @param phone  Receiver phone.
		*/
		public Builder(String firstName, String lastName, String phone) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
		}

		/**
		* Sets receiver email.
		* 
		* @param email  Receiver email.
		*/
		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Receiver build() {
			return new Receiver(this);
		}
	}
}