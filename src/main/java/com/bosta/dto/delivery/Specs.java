package com.bosta.dto.delivery;

public class Specs {
	 String size;
	 PackageDetails packageDetails;
	 
	 public Specs() {}
	 
	 public Specs(String size,PackageDetails packageDetails) {
		 this.size = size;
		 this.packageDetails = packageDetails;
	 }
}