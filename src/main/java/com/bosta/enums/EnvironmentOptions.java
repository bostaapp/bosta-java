package com.bosta.enums;

public enum EnvironmentOptions {
	PRODUCTION("https://app.bosta.co"),
	STAGING("https://stg-app.bosta.co");
	
	private final String val;

	private EnvironmentOptions(String val) {
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
