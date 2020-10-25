package com.bosta;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.bosta.response.city.ListCityResponse;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CityService {
	String baseUrl;
	HttpClient client;
	private ObjectMapper objectMapper;

	public CityService(String baseUrl) {
		this.baseUrl = baseUrl;
		this.objectMapper = new ObjectMapper();
		this.objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		this.objectMapper.setSerializationInclusion(Include.NON_NULL);
		this.client = HttpClient.newHttpClient();
	}

	public ListCityResponse list() throws Exception {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"%s/api/v1/cities", this.baseUrl)))
					.header("accept", "application/json")
					.build();

			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			ListCityResponse listCityResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<ListCityResponse>() {});
			return listCityResponse;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public ListCityResponse list(int per, int page) throws Exception {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"%s/api/v1/cities?per=%d&page=%s", this.baseUrl, per, page)))
					.header("accept", "application/json")
					.build();

			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			ListCityResponse listCityResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<ListCityResponse>() {});
			return listCityResponse;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public ListCityResponse listZones(String cityId) throws Exception {
		try {
			HttpRequest request = HttpRequest.newBuilder(
					URI.create(String.format(
							"%s/api/v1/cities/%s/zones", this.baseUrl,
							cityId)))
					.header("accept", "application/json")
					.build();

			HttpResponse<String> response = 
					client.send(request, BodyHandlers.ofString());
			// parse JSON
			ListCityResponse listCityResponse = 
					objectMapper.readValue(response.body(), 
							new TypeReference<ListCityResponse>() {});
			return listCityResponse;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
