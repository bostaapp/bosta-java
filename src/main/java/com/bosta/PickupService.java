 
package com.bosta;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import com.bosta.request.pickup.CreatePickupRequest;
import com.bosta.response.pickup.CreatePickupResponse;
import com.bosta.response.pickup.GetPickupDetailsResponse;
import com.bosta.response.pickup.ListPickupResponse;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

class PickupService {
	String apiKey;
	HttpClient client;
	private ObjectMapper objectMapper;
	
	public PickupService(String apiKey) {
		this.objectMapper = new ObjectMapper();
		this.objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		this.objectMapper.setSerializationInclusion(Include.NON_NULL);
		this.apiKey = apiKey;
		this.client = HttpClient.newHttpClient();
	}
	
	public CreatePickupResponse create(CreatePickupRequest createPickupRequest)throws Exception {
		try {
			String requestBody = objectMapper
					.writeValueAsString(createPickupRequest);
			HttpRequest request = HttpRequest.newBuilder(
					URI.create("https://stg-app.bosta.co/api/v1/pickups"))
					.header("accept", "application/json")
					.header("Content-Type", "application/json")
					.header("Authorization", apiKey)
					.POST(BodyPublishers.ofString(requestBody))
					.build();
			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			CreatePickupResponse createPickupResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<CreatePickupResponse>() {});
			return createPickupResponse;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public ListPickupResponse list(int pageId) throws Exception {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v1/pickups?pageId=%s", 
							pageId)))
					.header("accept", "application/json")
					.header("Authorization", apiKey)
					.build();

			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			ListPickupResponse listPickupResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<ListPickupResponse>() {});
			return listPickupResponse;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public GetPickupDetailsResponse get(String pickupId) throws Exception {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"https://stg-app.bosta.co/api/v1/pickups/%s", 
							pickupId)))
					.header("accept", "application/json")
					.header("Authorization", apiKey)
					.build();

			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			GetPickupDetailsResponse getPickupDetailsResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<GetPickupDetailsResponse>() {});
			return getPickupDetailsResponse;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}