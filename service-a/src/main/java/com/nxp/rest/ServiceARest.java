package com.nxp.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxp.model.ServiceARequest;
import com.nxp.model.ServiceAResponse;

@RestController
@RequestMapping(value = "/rest", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class ServiceARest {

	@PostMapping(value = "/getmsg")
	public ServiceAResponse getMsg(@RequestBody ServiceARequest serviceARequest) {

		ServiceAResponse response = new ServiceAResponse();
		if (serviceARequest =! null) {
			response.setRequestId("123");
			response.setResponseCode("9999");
			response.setResponseMessage("Success_ServiceA");
			return response;
		}
		return response;

	}

}
