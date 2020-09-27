package com.bosta.response.delivery;

public class GetDeliverySpecs {
	GetDeliverPackageDetails PackageDetailsObject;


	// Getter Methods 

	public GetDeliverPackageDetails getPackageDetails() {
		return PackageDetailsObject;
	}

	// Setter Methods 

	public void setPackageDetails(GetDeliverPackageDetails packageDetailsObject) {
		this.PackageDetailsObject = packageDetailsObject;
	}
}
