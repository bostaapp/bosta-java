package com.bosta;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.bosta.request.delivery.Delivery;
import com.bosta.response.delivery.CreateDeliveryResponse;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.core.type.TypeReference;

class DeliveryService {
	String apiKey;
	HttpClient client;
	private ObjectMapper objectMapper;

	public DeliveryService(String apiKey) {
		this.objectMapper = new ObjectMapper();
		this.objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		this.objectMapper.setSerializationInclusion(Include.NON_NULL);
		this.apiKey = apiKey;
		this.client = HttpClient.newHttpClient();
	}

	public void get(String trackingNumber) {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v1/deliveries/%s", 
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

	public CreateDeliveryResponse create(Delivery delivery) throws Exception {
		try {
			String requestBody = objectMapper
					.writeValueAsString(delivery);
			HttpRequest request = HttpRequest.newBuilder(
					URI.create("https://stg-app.bosta.co/api/v1/deliveries"))
					.header("accept", "application/json")
					.header("Content-Type", "application/json")
					.header("Authorization", apiKey)
					.POST(BodyPublishers.ofString(requestBody))
					.build();
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			CreateDeliveryResponse createDeliveryResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<CreateDeliveryResponse>() {});
			return createDeliveryResponse;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public void list() {}


}