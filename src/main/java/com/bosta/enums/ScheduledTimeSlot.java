package com.bosta.enums;

public enum ScheduledTimeSlot {
	FROM_13_TO_16("13:00 to 16:00"),
	FROM_10_TO_13("10:00 to 13:00");
	
	private final String val;

	private ScheduledTimeSlot(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}
	
    @Override
    public String toString(){
        return val;
    }
}
