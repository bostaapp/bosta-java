package com.bosta;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import com.bosta.dto.delivery.Delivery;

class DeliveryService {
	String apiKey;
	HttpClient client;
	
	public DeliveryService(String apiKey) {
		this.apiKey = apiKey;
		this.client = HttpClient.newHttpClient();
	}
	
	public void get(String trackingNumber) {
		try {
			HttpRequest request = HttpRequest.newBuilder(
				       URI.create(String.format(
				    		   "http://localhost:3000/api/v0/deliveries/%s", 
				    		   trackingNumber)))
				   .header("accept", "application/json")
				   .header("Authorization", apiKey)
				   .build();
			
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void create(Delivery delivery) {
		try {
			HttpRequest request = HttpRequest.newBuilder(
				       URI.create("http://localhost:3000/api/v0/deliveries"))
				   .header("accept", "application/json")
				   .header("Authorization", apiKey)
				   .POST(BodyPublishers.ofString(delivery.toString()))
				   .build();
			
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void list() {}
	

}