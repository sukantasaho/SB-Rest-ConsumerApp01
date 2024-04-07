package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SbRestProviderApp011Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SbRestProviderApp011Application.class, args);
		//create rest template class object
		RestTemplate template = new RestTemplate();
		String requestURL = "http://localhost:8080/api/wish";
		
		//generate http request with get mode to consume the web service
		ResponseEntity<String> response = template.getForEntity(requestURL, String.class);
		String msg = response.getBody();
	
		System.out.println(msg);
		//diplay the received details from the response
		System.out.println("Response Body : "+response.getBody());
		System.out.println("Response Status Code  Value : "+response.getStatusCodeValue());
		System.out.println("Response Status Code : "+response.getStatusCode());
		
		System.exit(0);
	}

}
