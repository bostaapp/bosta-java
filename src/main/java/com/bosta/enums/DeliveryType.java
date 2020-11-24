/**
 * 
 */
package com.bosta.enums;

import java.util.HashMap;
import java.util.Map;

public enum DeliveryType {
	SEND(10), 
	CASH(15),
	Exchange(30), 
	CRP(25);

	private final int value;
	private static Map map = new HashMap<>();

	private DeliveryType(int number) {
		this.value = number;
	}

	public int getNumber() {
		return value;
	}

	static {
		for (DeliveryType deliveryType : DeliveryType.values()) {
			map.put(deliveryType.value, deliveryType);
		}
	}

	public static DeliveryType valueOf(int deliveryType) {
		return (DeliveryType) map.get(deliveryType);
	}

	public int getValue() {
		return value;
	}
}
