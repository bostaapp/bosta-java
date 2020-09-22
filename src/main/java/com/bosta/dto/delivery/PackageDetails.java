package com.bosta.dto.delivery;

public class PackageDetails {
	 int itemsCount;
	 String document;
	 String description;
	 
	 public PackageDetails (){}
	 
	 public PackageDetails (int itemsCount,String document,String description){
		 this.itemsCount = itemsCount;
		 this.document = document;
		 this.description = description;
	 }
}