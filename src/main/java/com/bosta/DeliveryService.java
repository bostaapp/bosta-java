package com.bosta;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.bosta.request.delivery.CreateDeliveryRequest;
import com.bosta.request.delivery.UpdateDeliveryRequest;
import com.bosta.response.delivery.CreateDeliveryResponse;
import com.bosta.response.delivery.DeliveryTrackingResponse;
import com.bosta.response.delivery.GetDeliveryResponse;
import com.bosta.response.delivery.ListDeliveryResponse;
import com.bosta.response.delivery.UpdateDeliveryResponse;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
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

	public GetDeliveryResponse get(String trackingNumber)throws Exception {
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
			// parse JSON
			GetDeliveryResponse getDeliveryResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<GetDeliveryResponse>() {});
			System.out.println(getDeliveryResponse.getMessage());
			return getDeliveryResponse;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} 
	}

	public CreateDeliveryResponse create(CreateDeliveryRequest delivery) throws Exception {
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

	public UpdateDeliveryResponse update(UpdateDeliveryRequest delivery, String deliveryId) throws Exception {
		try {
			String requestBody = objectMapper
					.writeValueAsString(delivery);
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v1/deliveries/%s", 
							deliveryId)))
					.header("accept", "application/json")
					.header("Content-Type", "application/json")
					.header("Authorization", apiKey)
					.PUT(BodyPublishers.ofString(requestBody))
					.build();
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			UpdateDeliveryResponse updateDeliveryResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<UpdateDeliveryResponse>() {});
			return updateDeliveryResponse;
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public UpdateDeliveryResponse terminate(String deliveryId) throws Exception {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v1/deliveries/%s", 
							deliveryId)))
					.header("accept", "application/json")
					.header("Content-Type", "application/json")
					.header("Authorization", apiKey)
					.DELETE()
					.build();
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			 UpdateDeliveryResponse updateDeliveryResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<UpdateDeliveryResponse>() {});
			return updateDeliveryResponse;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public UpdateDeliveryResponse awp(String deliveryId) throws Exception {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v1/deliveries/awb/%s", 
							deliveryId)))
					.header("accept", "application/json")
					.header("Authorization", apiKey)
					.build();
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
			// parse JSON
			 UpdateDeliveryResponse updateDeliveryResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<UpdateDeliveryResponse>() {});
			return updateDeliveryResponse;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public DeliveryTrackingResponse tracking(String deliveryId) throws Exception {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v1/deliveries/%s/tracking", 
							deliveryId)))
					.header("accept", "application/json")
					.header("Authorization", apiKey)
					.build();
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			DeliveryTrackingResponse deliveryTrackingResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<DeliveryTrackingResponse>() {});
			return deliveryTrackingResponse;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public ListDeliveryResponse list() throws Exception{
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v0/deliveries")))
					.header("accept", "application/json")
					.header("Authorization", apiKey)
					.build();
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			ListDeliveryResponse listDeliveryResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<ListDeliveryResponse>() {});
			return listDeliveryResponse;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public ListDeliveryResponse list(int perPage, int page) throws Exception{
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v0/deliveries?perPage=%d&page=%d", perPage, page)))
					.header("accept", "application/json")
					.header("Authorization", apiKey)
					.build();
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			ListDeliveryResponse listDeliveryResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<ListDeliveryResponse>() {});
			return listDeliveryResponse;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}


}