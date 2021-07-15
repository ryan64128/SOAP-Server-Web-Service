package com.example;

import javax.xml.ws.Endpoint;

public class SOAPMathPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8084/soap-math", new SOAPMathImpl());
		System.out.println("Running SOAP Server on port 8084");
	}
}
